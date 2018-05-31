package com.young.thinking.adaptermodel;

/**
 * Created by youngwa on 2018年4月9日
 *
 */
public class Apply {
	public static void process(Processor processor,Object obj){
		System.out.println("Using Processor " + processor.name());
		System.out.println(processor.process(obj));
	}
}
