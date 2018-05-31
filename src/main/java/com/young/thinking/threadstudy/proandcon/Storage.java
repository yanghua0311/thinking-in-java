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
 * Created by yanghua on 2018��4��10��
 *
 */
public class Storage {
	  private Product[] products = new Product[2];  
	  public int max=0;
	  /**
       * ���� 
       * @throws InterruptedException
       */
      public synchronized void push(Product p) throws InterruptedException {
  // synchronizedȷ��ֻ��һ���߳̽���    
    	  while (max == products.length) {  
             Thread.sleep(3000);
                  //���������̵��Ͷ��� 
                  //�̵߳ȴ�
                  System.out.println(Thread.currentThread().getName()+"�̵��Ʒ�������ȴ�");
                 
                  wait(); 
          }  
    	  //����̵�û�������Ѳ�Ʒ�����̵�
          products[max++] = p;  
          
//          System.out.println(Thread.currentThread().getName() + " �����˲�Ʒ"  
//                  + p);  
          Thread.sleep(1000);
          notifyAll();//���ѵȴ��߳� 
    	 
      }

      /**
       * ����
       * 
       * @return ��Ʒ
       * @throws InterruptedException
       */
      public synchronized Product pop() throws InterruptedException {
    	  while (max == 0) {  
              try {  
                  wait(); 
                  System.out.println("�̵�գ��ȴ�");
                  Thread.sleep(1000);
              } catch (InterruptedException e) {  
                  // TODO Auto-generated catch block  
                  e.printStackTrace();  
              }  
    
          }  
          //���̵���ȡ��Ʒ  
          --max;  
          Product p = new Product(products[max].getId(), products[max].getName());  
          products[max] = null;  
          //System.out.println(Thread.currentThread().getName() + " �����˲�Ʒ" + p);  
          notifyAll();//���ѵȴ��߳�  
          Thread.sleep(1000);
          return p;  
      }

}

