/**
 * 
 */
package com.young.thinking.threadstudy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Administrator
 *
 */
public class ExcutorTest implements Runnable {

	/**
	 * @param args
	 */

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService est1 = Executors.newFixedThreadPool(2);
		ExcutorTest  et=new ExcutorTest();
		for (int i = 0; i < 5; i++) {
			est1.execute(et);
		}
		est1.shutdown();
	}

}
