/**
 * 
 */
package com.young.thinking.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by youngwa on 2018��6��27��
 *
 */
public class TestShape {
	public static void main(String[] args) {
		Collection<Square> square = new ArrayList<Square>();
		total(square);
	}
	
	public static void total(Collection<? extends Shape> s) {
		
	}
}
