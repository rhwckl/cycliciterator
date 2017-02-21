package com.son.cycliciterator

class CyclicIterator<T> (val iterable: Iterable<T>) : Iterator<T> {
    val hasNext = iterable.iterator().hasNext()
    var current = iterable.iterator()

    override fun next(): T {
        if (! current.hasNext()) {
            current = iterable.iterator()
        }
        return current.next()
    }

    override fun hasNext(): Boolean = hasNext
}

