
package com.young.thinking.threadstudy.BlockingQueue;

/**
 * @author Administrator
 *
 */

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.young.thinking.threadstudy.proandcon.Product;

public class StorageQueue {

	 BlockingQueue<Product> queues = new LinkedBlockingQueue<Product>(2);
	 
     public BlockingQueue<Product> getQueues() {
		return queues;
	}

	public void setQueues(BlockingQueue<Product> queues) {
		this.queues = queues;
	}

	/**
      * ����
      * 
      * @param p
      *            ��Ʒ
      * @throws InterruptedException
      */
     public void push(Product p) throws InterruptedException {
         queues.put(p);
     }

     /**
      * ����
      * 
      * @return ��Ʒ
      * @throws InterruptedException
      */
     public Product pop() throws InterruptedException {
         return queues.take();
     }
}

