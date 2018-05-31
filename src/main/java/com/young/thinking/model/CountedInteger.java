/**
 * 
 */
package com.young.thinking.model;

/**
 * Created by youngwa on 2018Äê1ÔÂ15ÈÕ
 *
 */
public class CountedInteger {
	private static long counter;
	private final long id = counter++;
	public String toString(){
		return Long.toString(id);
	}
}
