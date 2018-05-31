package com.young.thinking.adaptermodel.selfdemo;

import com.young.thinking.adaptermodel.Apply;

/**
 * Created by youngwa on 2018年4月9日
 *
 */
public class ChangeProcessor {
	public static void main(String[] args) {
		ModelStr str= new ModelStr();
		str.setStr("youngwa");
		Apply.process(new StrAdapter(new ChangeStr()), str );
	}
}
