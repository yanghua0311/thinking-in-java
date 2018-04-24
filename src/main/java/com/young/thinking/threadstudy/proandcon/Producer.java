/**
 * 
 */
package com.young.thinking.threadstudy.proandcon;

import com.young.thinking.threadstudy.StorageQueue;

/**
 * Created by yanghua on 2018��4��10��
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
                  //��Ʒ����
            	  Product product = new Product(num,"��Ʒ"+num); // ����0~9999�������
                 
                  storage.push(product);
//                  storageQueue.push(product);
                  System.out.println(name + "������(" + product.toString() + ")");
//                  System.out.println("��ʱ��max��"+storage.max );
                  System.out.println("------------------------------");
            
              }
          } catch (InterruptedException e1) {
              e1.printStackTrace();
          }
	}

}

