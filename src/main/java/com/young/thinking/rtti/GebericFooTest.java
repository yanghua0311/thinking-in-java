/**
 * 
 */
package com.young.thinking.rtti;

import com.young.thinking.jiekou.Coo;

/**
 * Created by youngwa on 2018��1��15��
 *
 */
public class GebericFooTest {
	
	public static void main(String[] args) throws Exception {
		Class<Coo> coo = Coo.class;
		 Coo co = coo.newInstance();
		Class<? super Coo> up = coo.getSuperclass();
		Object newInstance = up.newInstance();
	}
}
