/**
 * 
 */
package com.young.thinking.threadstudy.volatiledemo;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

/**
 * Created by youngwa on 2018Äê9ÔÂ10ÈÕ
 *
 */
public class ReadWriteLock {
	public static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	public static ReadLock readLock = lock.readLock();
	public static WriteLock writeLock = lock.writeLock();

	public static StringBuilder str = new StringBuilder("helloworld");
	
	public static void read() {
		readLock.lock();
		try {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "  say:  " + str.toString());
		} finally {
			readLock.unlock();
		}
	}
	
	public static void write() {
		writeLock.lock();
		try {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			str.append("  666");
			System.out.println(Thread.currentThread().getName() + "  updated:  " + str.toString());
			
		} finally {
			writeLock.unlock();
		}
	}
	public static void main(String[] args) {
		Thread read1 = new Thread(() -> read(), "read1");
		Thread read2 = new Thread(() -> read(), "read2");
		Thread read3 = new Thread(() -> read(), "read3");
		Thread write1 = new Thread(() -> write(), "write1");
		Thread write2 = new Thread(() -> write(), "write2");
		read1.start();
		read2.start();
		read3.start();
		write1.start();
		write2.start();
	}
}
