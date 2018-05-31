package com.young.thinking.adaptermodel;

/**
 * Created by youngwa on 2018年4月9日
 *
 */
public class WaveForm {
	private static long counter;
	
	private final long id = counter ++;
	
	public String toString(){
		return "WaveForm  " + id;  
	}
}
