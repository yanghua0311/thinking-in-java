package com.young.thinking.threadstudy.BlockingQueue;


public class ThreadMachine {
	public static void main(String[] args) {
       StorageQueue storage = new  StorageQueue();
        Thread consumer1 = new Thread(new Consumer1("������1",storage));  
        Thread producer1 = new Thread(new Producer1("������1",storage)); 
        Thread producer2 = new Thread(new Producer1("������2",storage));  
        Thread producer3 = new Thread(new Producer1("������3",storage));  
        Thread producer4 = new Thread(new Producer1("������4",storage));  
        consumer1.start();  
        producer1.start(); 
        producer2.start();
        producer3.start();

}
}
