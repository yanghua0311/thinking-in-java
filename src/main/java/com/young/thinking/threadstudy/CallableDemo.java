package com.young.thinking.threadstudy;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableDemo {
	public static void test(){
		Callable<Integer> cb = ()->{
			int a=2;
			for (int i = 0; i <10; i++) {
				a += i;
			}
			return a;			
		};
		Runnable run = () -> {
			for (int i = 0; i <10; i++) {
				System.out.println(i);
			}
		};
		try {
			System.out.println(cb.call());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread th2 = new Thread(run);
		Thread th3 = new Thread(run);
		th2.start();
		th3.start();
	}
	public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
	}
}
