package org.ifmo.dsltex

import org.junit.Assert.assertEquals
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream


class TexTest {
    @Test
    fun case1() {
        val data = """\documentclass{beamer}
\usepackage[russian] {babel}
\begin{document}
\begin{frame}
\frametitle{frametitle}[arg1=arg2]\begin{itemize}
\itemtest1 text
\itemtest2 text
\itemtest3 text
\end{itemize}
\begin{pyglist}
|val a = 1
|
\end{pyglist}
\end{frame}

\end{document}
        """.trimIndent()

        val res = document {
            documentClass("beamer")

            usepackage("babel", "russian" /* varargs */)
            body {
                frame("frametitle", "arg1" to "arg2") {
                    itemize {
                        val rows = listOf("test1", "test2", "test3")
                        for (row in rows) {
                            item { +"$row text" }
                        }
                    }

                    // begin{pyglist}[language=kotlin]...\end{pyglist}
                    customTag("pyglist", "language" to "kotlin") {
                        +"""
               |val a = 1
               |
            """
                    }
                }

            }

        }.to<String>()

        assertEquals(data, res)


    }


    @Test
    fun case2() {
        val data = """\documentclass{beamer}
\usepackage[russian] {babel}
\begin{document}
\begin{frame}
\frametitle{frametitle}[arg1=arg2]\begin{itemize}
\itemtest1 text
\itemtest2 text
\itemtest3 text
\end{itemize}
\begin{pyglist}
|val a = 1
|
\end{pyglist}
\end{frame}

\end{document}
        """.trimIndent()


        val byteArrayOutputStream = ByteArrayOutputStream()
        val res = document {
            documentClass("beamer")

            usepackage("babel", "russian" /* varargs */)
            body {
                frame("frametitle", "arg1" to "arg2") {
                    itemize {
                        val rows = listOf("test1", "test2", "test3")
                        for (row in rows) {
                            item { +"$row text" }
                        }
                    }

                    // begin{pyglist}[language=kotlin]...\end{pyglist}
                    customTag("pyglist", "language" to "kotlin") {
                        +"""
               |val a = 1
               |
            """
                    }
                }

            }

        }.to(byteArrayOutputStream)

        assertEquals(data, byteArrayOutputStream.toString())


    }




}