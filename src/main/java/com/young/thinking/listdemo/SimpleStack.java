package com.young.thinking.listdemo;

import java.util.LinkedList;

/**
 * Created by youngwa on 2017Äê12ÔÂ21ÈÕ
 *
 */
public class SimpleStack<E> {
	LinkedList<E> storage = new LinkedList<E>();

	public void push(E e) {
		storage.addFirst(e);
	}

	public E pop() {
		return storage.removeFirst();
	}

	public boolean isEmpty() {
		return storage.isEmpty();
	}

	public E peek() {
		return storage.getFirst();
	}

	public String toString() {
		return storage.toString();
	}
}
