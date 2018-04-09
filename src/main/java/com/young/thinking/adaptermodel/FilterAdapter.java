package com.young.thinking.adaptermodel;

/**
 * Created by youngwa on 2018年4月9日
 *
 */
//代理类的
public class FilterAdapter implements Processor {
	Filter filter;
	public FilterAdapter(Filter filter) {
		super();
		this.filter = filter;
	}
	
	@Override
	public String name() {
		return filter.name();
	}
	
	@Override
	public Object process(Object obj) {
		return filter.process((WaveForm) obj);
	}
}
