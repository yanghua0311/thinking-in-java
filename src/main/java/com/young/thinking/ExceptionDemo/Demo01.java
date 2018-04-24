/**
 * 
 */
package com.young.thinking.ExceptionDemo;


/**
 * created by youngwa on 2018Äê1ÔÂ1ÈÕ
 *
 */
public class Demo01 {
	public static void skipExce(){

		for (int i = 9; i > -2 ; i--) {
		try {
			int key = 80/i;
			System.out.println(key+ "   and   " +i);
			if(i==50)
				break;

		} catch (Exception e) {
				i+=100;
		}
		}
		
	System.out.println("123456789");
		
	}
	public static void main(String[] args) {
		skipExce();
		
	}
	
	
}
