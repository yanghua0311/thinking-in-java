package com.young.thinking.adaptermodel.selfdemo;

import java.util.Arrays;

/**
 * Created by youngwa on 2018年4月9日
 *
 */
public class ChangeStr {
	public String change(String str) {
		char[] strarr = str.toCharArray();
		char[] strarr1 = new char[str.length()];
		int length = str.length()-1;
		for (int i = 0; i < length+1; i++) {
			strarr1[length-i] = strarr[i];			
		}
		return Arrays.toString(strarr1).replace(",", "");
	}
}
