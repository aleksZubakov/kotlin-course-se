package org.ifmo.dsltex

import java.io.OutputStream
import java.lang.IllegalArgumentException
import kotlin.reflect.full.isSubclassOf

interface Writer<T> {
    fun write(data: String)
    fun out(): T
}


class OutputStreamWriter(private val outputStream: OutputStream) : Writer<OutputStream> {
    override fun write(data: String) {
        outputStream.write(data.toByteArray())
    }

    override fun out(): OutputStream {
        return outputStream
    }
}

class StringWriter(private val builder: StringBuilder = StringBuilder()) : Writer<String> {
    override fun write(data: String) {
        builder.append(data)
    }

    override fun out(): String {
        return builder.toString()
    }
}

/**
 * Creates specified inheritor of Writer by type of [out] or its generic type,
 * @throws IllegalArgumentException if [out] is null and corresponding inheritor of [Writer]
 * requires not null [out] or if can't find [Writer] by generic type.
 */
@Suppress("UNCHECKED_CAST")
inline fun <reified T> makeWriter(out: T? = null): Writer<T> {
    if (out == null && T::class.isSubclassOf(OutputStream::class)) {
        throw IllegalArgumentException("oops")
    }

    return when {
        T::class.isSubclassOf(OutputStream::class) -> OutputStreamWriter(out!! as OutputStream) as Writer<T>
        T::class == String::class -> StringWriter() as Writer<T>
        else -> throw IllegalArgumentException("oops")
    }
}


