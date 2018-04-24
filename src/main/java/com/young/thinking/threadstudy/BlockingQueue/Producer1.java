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
                 //产品对象
           	  		Product product = new Product(num,"产品"+num); // 产生0~9999随机整数
           	  		storageQueue.push(product);
                 System.out.println(name + "已生产(" + product.toString() + ")"+" 此时库存为 ："+storageQueue.getQueues().size() );
                 System.out.println("------------------------------"); 
                 Thread.sleep(3000);
             }
         } catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
     
}
