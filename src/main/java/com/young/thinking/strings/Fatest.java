/**
 * 
 */
package com.young.thinking.strings;

import com.young.thinking.model.Father;
import com.young.thinking.model.Son;

/**
 * Created by youngwa on 2018��1��15��
 *
 */
public class Fatest {
	//�ݹ����toString();
	public static void main(String[] args) {
		Son son = new Son();
		Father fa = new Father();
		//fa.setS(son);
		son.setF(fa);
		System.out.println(fa);
		//System.out.println(son);
	}
	
}
