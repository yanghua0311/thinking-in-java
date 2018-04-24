package com.young.thinking.threadstudy.BlockingQueue;

import com.young.thinking.threadstudy.proandcon.Product;

public class Consumer1 implements Runnable{
	 private String name;
     private StorageQueue storageQueue = null;
     
     
     public Consumer1(String name, StorageQueue storageQueue) {
		super();
		this.name = name;
		this.storageQueue = storageQueue;
	}


	@Override
	public void run() {
    	 try {
             while (true) {
                 Product product = storageQueue.pop();
                 System.out.println(name + "ÒÑÏû·Ñ(" + product.toString() + ")");
                 System.out.println("------------------------------");  
                 Thread.sleep(2000);
             }
         } catch (InterruptedException e) {
			e.printStackTrace();
		}
     }     
}
