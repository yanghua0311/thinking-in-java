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
 * ������-������-�̵�
 * 1�������߽����ڲֿ�δ��ʱ���������ֿ���ֹͣ������
 * 2�������߽����ڲֿ��в�Ʒʱ��������ѣ��ֿ���ȴ���
 * 3���������߷��ֲֿ�û��Ʒ������ʱ���֪ͨ������������
 * 4���������������������Ѳ�Ʒʱ��Ӧ��֪ͨ�ȴ���������ȥ���ѡ�
 * 
 * @author mc
 *
 */
public class ProducerConsumer {

	public static void main(String[] args) {
	        Storage storage = new Storage();  
//	        StorageQueue storage = new  StorageQueue();
//	        Thread consumer1 = new Thread(new Consumer("������1",storage));  
//	        Thread consumer2 = new Thread(new Consumer("������2",storage));  
//	        Thread consumer3 = new Thread(new Consumer("������3",storage)); 
//	        Thread consumer4 = new Thread(new Consumer("������4",storage)); 
	        Thread producer1 = new Thread(new Producer("������1",storage)); 
	        Thread producer2 = new Thread(new Producer("������2",storage));  
	        Thread producer3 = new Thread(new Producer("������3",storage));  
	        Thread producer4 = new Thread(new Producer("������4",storage));  
	       
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
