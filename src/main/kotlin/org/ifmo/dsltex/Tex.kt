package org.ifmo.dsltex


@DslMarker
annotation class TexMarker

enum class Align {
    Left, Right, Center;

    override fun toString(): String = when (this) {
        Left -> "flushleft"
        Right -> "flushright"
        Center -> "center"
    }
}


@TexMarker
class Itemize<T>(private val writer: Writer<T>) {
    private fun String.write() = writer.write(this)

    fun item(init: Item<T>.() -> Unit) {
        "\\item ".write()
        Item(writer).init()
    }
}



@TexMarker
open class Tag<T>(
        val tag: String,
        private val writer: Writer<T>) {
    operator fun String.unaryPlus() = "${this.trimIndent()}\n".write()

    protected fun String.write() = writer.write(this)
    open fun write(body: Tag<T>.() -> Unit) {
        "\\begin{$tag}\n".write()
        body()
        "\\end{$tag}\n".write()
    }
}

class Item<T>(private val writer: Writer<T>): Tag<T>("item", writer) {
    override fun write(body: Tag<T>.() -> Unit) {
        body()
    }
}


open class Body<T>(private val writer: Writer<T>) {
    private fun String.write() = writer.write(this)

    fun frame(title: String, vararg params: Pair<String, String>, body: Body<T>.() -> Unit) {
        Tag("frame", writer).write {
            "\\frametitle{$title}".write()
            if (params.isNotEmpty()) {
                params(*params).write()
            }
            body()
        }

    }

    fun math(code: String) = "$$code$\n".write()

    fun alignment(type: Align, body: Body<T>.() -> Unit) =
            Tag(type.toString(), writer).write { body() }

    fun customTag(name: String, vararg args: Pair<String, String>, body: Body<T>.() -> Unit) =
            Tag(name, writer).write { body() }

    operator fun String.unaryPlus() = "${this.trimIndent()}\n".write()


    fun params(vararg params: String) =
            params.joinToString(separator = ",", prefix = "[", postfix = "]")

    fun params(vararg params: Pair<String, String>) =
            params.joinToString(separator = ",", prefix = "[", postfix = "]") {
                "${it.first}=${it.second}"
            }

    fun itemize(body: Itemize<T>.() -> Unit) = items("itemize", body)
    fun enumerate(body: Itemize<T>.() -> Unit) = items("enumerate", body)

    fun items(tag: String, body: Itemize<T>.() -> Unit) {
        "\\begin{$tag}\n".write()
        Itemize(writer).body()
        "\\end{$tag}\n".write()
    }
}

class Document<T>(private val writer: Writer<T>) {
    private fun String.write() = writer.write(this)
    fun documentClass(docCls: String) = "\\documentclass{$docCls}\n".write()

    fun usepackage(first: String, vararg other: String) = writer.apply {
        "\\usepackage".write()
        val postfix =
                if (other.isNotEmpty())
                    other.joinToString(separator = ", ", prefix = "[", postfix = "] {$first}\n")
                else
                    "{$first}\n"
        postfix.write()
    }

    fun body(init: Body<T>.() -> Unit) = writer.apply {
        "\\begin{document}\n".write()
        val body = Body(writer)
        body.init()
        "\n\\end{document}".write()
    }
}

class TexMaker(val init: Document<*>.() -> Unit) {
    inline fun <reified T> to(where: T? = null): T {
        val writer = makeWriter(where)
        Document(writer).init()
        return writer.out()
    }

}

fun document(eval: Document<*>.() -> Unit) = TexMaker(eval)

