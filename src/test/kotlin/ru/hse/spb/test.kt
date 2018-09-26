package ru.hse.spb

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class TestSource {


    fun runTest(data: String, expected: String, block: () -> Unit) {
        val outContent = ByteArrayOutputStream()

        try {
            System.setOut(PrintStream(outContent));
            System.setIn(ByteArrayInputStream(data.toByteArray()))

            block()

            assertThat(outContent.toString())
                    .isEqualTo(expected)
        } finally {
            System.setIn(System.`in`)
            System.setOut(System.out)
        }
    }

    @Test
    fun testCase1() {
        runTest(
                "5 5\n5 5 9 100 3\n",
                "321\n9 8 7 6 10\n"
        ) {
            solve()
        }
    }

    @Test
    fun testCase2() {
        runTest("1 1\n1\n", "1\n2\n"
        ) {
            solve()
        }
    }
    @Test
    fun testCase3() {
        runTest("8 1\n3669 11274 87693 33658 58862 78334 42958 30572",
                "29352\n9 2 3 4 5 6 7 8\n"
        ) {
            solve()
        }
    }
}