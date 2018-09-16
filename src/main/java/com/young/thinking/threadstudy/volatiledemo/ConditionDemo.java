/**
 * 
 */
package com.young.thinking.threadstudy.volatiledemo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by youngwa on 2018Äê9ÔÂ1ÈÕ
 *
 */
public class ConditionDemo {
	private int flag = 0;
	public String str = "youngwa";
	ReentrantLock lock = new ReentrantLock();
	Condition newCondition = lock.newCondition();
	
	public void print() {

		lock.lock();
		try {
			while (flag == 0) {
				newCondition.await();
				System.out.println(str);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public static void main(String[] args) {
		ConditionDemo cd = new ConditionDemo();
		Thread th1 = new Thread(() -> {
			try {
				cd.print();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		th1.start();
		th1.interrupt();
		System.out.println(th1.isInterrupted());
		try {
			th1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
