/**
 * 
 */
package com.young.thinking.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by youngwa on 2018��1��15��
 *
 */
public class InfiniteRecursion {
	
	public String toString(){
		return "InfiniteRecursion address" + this + "\n";					 //	�ݹ����
		//return "InfiniteRecursion address" + super.toString() + "\n";		 //	�޸� ʹ��super.toString();
	}	
	
	public static void main(String[] args) {
		List<InfiniteRecursion> v = new  ArrayList<InfiniteRecursion>();
		for (int i = 0; i < 10; i++) {
			v.add(new InfiniteRecursion());
			System.out.println(v);
		}
	}
}
