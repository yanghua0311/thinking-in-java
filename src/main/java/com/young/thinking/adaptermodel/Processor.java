package com.young.thinking.adaptermodel;

/**
 * Created by youngwa on 2018年4月9日
 *
 */
//加工处理的抽象方法接口
public interface Processor {
	String name();
	Object process(Object obj);
}
