/**
 * 
 */
package com.young.thinking.threadstudy.volatiledemo;

/**
 * Created by youngwa on 2018Äê9ÔÂ1ÈÕ
 *
 */
public class TestDemo {
	public static void main(String[] args) {
		VolatileDemo vd = new VolatileDemo();
		Thread th1 = new Thread(() -> vd.set(2l));
		Thread th2 = new Thread(() -> System.out.println(vd.get()));
		th1.start();
		th2.start();
	}
}
