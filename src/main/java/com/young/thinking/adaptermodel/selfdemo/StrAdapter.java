package com.young.thinking.adaptermodel.selfdemo;

import com.young.thinking.adaptermodel.Processor;

/**
 * Created by youngwa on 2018年4月9日
 *
 */
public class StrAdapter implements Processor{
	ChangeStr cs;
	
	public StrAdapter(ChangeStr cs) {
		super();
		this.cs = cs;
	}


	@Override
	public String name() {
		return cs.getClass().getSimpleName();
	}

	
	@Override
	public Object process(Object obj) {
		ModelStr str = (ModelStr) obj;
		str.setStr(cs.change(str.getStr()));
		return str;
	}

}
