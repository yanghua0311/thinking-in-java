/**
 * 
 */
package com.young.thinking.threadstudy.proandcon;

import com.young.thinking.threadstudy.StorageQueue;

/**
 * Created by yanghua on 2018年4月10日
 *
 */
public class Consumer implements Runnable {
	 private String name;
     private StorageQueue storageQueue = null;
     private Storage storage = null;

     public Consumer(String name, Storage storage) {
         this.name = name;
         this.storage =storage;
     }
     public Consumer(String name, StorageQueue storageQueue) {
         this.name = name;
         this.storageQueue =storageQueue;
     }
     public void run() {
         try {
             while (true) {
                 Product product = storage.pop();
//                 Product product = storageQueue.pop();
                 System.out.println(name + "已消费(" + product.toString() + ")");
                 System.out.println("------------------------------");
                 
             }
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

     }

	

}
