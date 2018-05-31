/**
 * 
 */
package com.young.thinking.threadstudy.proandcon;

import com.young.thinking.threadstudy.StorageQueue;

/**
 * Created by yanghua on 2018年4月10日
 *
 */
public class Producer implements Runnable {
	  private String name=null;
      private Storage storage = null;
      private StorageQueue storageQueue = null;
      public Producer() {
         
      }
      public Producer(String name, Storage storage) {
          this.name = name;
          this.storage = storage;
      }
      public Producer(String name, StorageQueue storageQueue) {
          this.name = name;
          this.storageQueue =storageQueue;
      }
	@Override
	public void run() {
		  try {
              while (true) {
            	  int num=(int) (Math.random()*1000);
                  //产品对象
            	  Product product = new Product(num,"产品"+num); // 产生0~9999随机整数
                 
                  storage.push(product);
//                  storageQueue.push(product);
                  System.out.println(name + "已生产(" + product.toString() + ")");
//                  System.out.println("此时的max是"+storage.max );
                  System.out.println("------------------------------");
            
              }
          } catch (InterruptedException e1) {
              e1.printStackTrace();
          }
	}

}

