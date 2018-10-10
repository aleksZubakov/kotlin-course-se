package org.ifmo.dsltex

fun main(args: Array<String>) {
    document {
        documentClass("beamer")

        usepackage("babel", "russian" /* varargs */)
        body {
            frame("frametitle", "arg1" to "arg2") {
                itemize {
                    val rows = listOf("test1", "test2", "test3")
                    for (row in rows) {
                        item { + "$row text" }
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

    }.to(System.out)


}