/**
 * 
 */
package com.young.thinking.threadstudy.volatiledemo;

/**
 * Created by youngwa on 2018Äê9ÔÂ1ÈÕ
 *
 */
public class VolatileDemo {
	public static long vl = 0L;
	
	public static synchronized void set(long l) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		vl =l;
	}
	
	public static synchronized long get() {
		return vl;
	}
}
