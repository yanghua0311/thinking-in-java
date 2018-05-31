package com.young.thinking.threadstudy.BlockingQueue;

import javax.swing.plaf.SliderUI;

import com.young.thinking.threadstudy.proandcon.Product;

public class Producer1 implements Runnable{
	 private String name=null;
     private StorageQueue storageQueue = null;
	
     public Producer1() {
         
     }

     public Producer1(String name, StorageQueue storageQueue) {
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
           	  		storageQueue.push(product);
                 System.out.println(name + "������(" + product.toString() + ")"+" ��ʱ���Ϊ ��"+storageQueue.getQueues().size() );
                 System.out.println("------------------------------"); 
                 Thread.sleep(3000);
             }
         } catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
     
}
