/**
 * 
 */
package com.young.thinking.threadstudy.proandcon;

/**
 * @author Administrator
 *
 */


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * 生产者-消费者-商店
 * 1、生产者仅仅在仓库未满时候生产，仓库则停止生产。
 * 2、消费者仅仅在仓库有产品时候才能消费，仓空则等待。
 * 3、当消费者发现仓库没产品可消费时候会通知生产者生产。
 * 4、生产者在生产出可消费产品时候，应该通知等待的消费者去消费。
 * 
 * @author mc
 *
 */
public class ProducerConsumer {

	public static void main(String[] args) {
	        Storage storage = new Storage();  
//	        StorageQueue storage = new  StorageQueue();
//	        Thread consumer1 = new Thread(new Consumer("消费者1",storage));  
//	        Thread consumer2 = new Thread(new Consumer("消费者2",storage));  
//	        Thread consumer3 = new Thread(new Consumer("消费者3",storage)); 
//	        Thread consumer4 = new Thread(new Consumer("消费者4",storage)); 
	        Thread producer1 = new Thread(new Producer("生产者1",storage)); 
	        Thread producer2 = new Thread(new Producer("生产者2",storage));  
	        Thread producer3 = new Thread(new Producer("生产者3",storage));  
	        Thread producer4 = new Thread(new Producer("生产者4",storage));  
	       
//	        consumer1.start();  
//	        try {
//				consumer1.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	        producer1.start(); 
	        producer2.start();
	        producer3.start();
//	        producer4.start();
//		
	}
	
}
