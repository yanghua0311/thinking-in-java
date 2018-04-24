/**
 * 
 */
package com.young.thinking.threadstudy.proandcon;

/**
 * @author Administrator
 *
 */


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


/**
 * Created by yanghua on 2018年4月10日
 *
 */
public class Storage {
	  private Product[] products = new Product[2];  
	  public int max=0;
	  /**
       * 生产 
       * @throws InterruptedException
       */
      public synchronized void push(Product p) throws InterruptedException {
  // synchronized确保只有一个线程进入    
    	  while (max == products.length) {  
             Thread.sleep(3000);
                  //生产者往商店送东西 
                  //线程等待
                  System.out.println(Thread.currentThread().getName()+"商店货品已满，等待");
                 
                  wait(); 
          }  
    	  //如果商店没有满，把产品放入商店
          products[max++] = p;  
          
//          System.out.println(Thread.currentThread().getName() + " 生产了产品"  
//                  + p);  
          Thread.sleep(1000);
          notifyAll();//唤醒等待线程 
    	 
      }

      /**
       * 消费
       * 
       * @return 产品
       * @throws InterruptedException
       */
      public synchronized Product pop() throws InterruptedException {
    	  while (max == 0) {  
              try {  
                  wait(); 
                  System.out.println("商店空，等待");
                  Thread.sleep(1000);
              } catch (InterruptedException e) {  
                  // TODO Auto-generated catch block  
                  e.printStackTrace();  
              }  
    
          }  
          //从商店中取产品  
          --max;  
          Product p = new Product(products[max].getId(), products[max].getName());  
          products[max] = null;  
          //System.out.println(Thread.currentThread().getName() + " 消费了产品" + p);  
          notifyAll();//唤醒等待线程  
          Thread.sleep(1000);
          return p;  
      }

}

