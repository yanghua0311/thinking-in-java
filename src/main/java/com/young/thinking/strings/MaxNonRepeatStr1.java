/**
 * 
 */
package com.young.thinking.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by youngwa on 2018年5月31日
 *
 */
public class MaxNonRepeatStr1 {
	
	//static List<Integer> ins = new ArrayList<>();
	static Map<Integer, Integer> ins = new HashMap<>();
	
	public static void main(String[] args) {		
		StringBuilder str2 = new StringBuilder("小鑫鑫贼鸡儿666");
		
		//StringBuilder str2 = new StringBuilder("一二三二四");

	    Boolean[][] strs = new Boolean[str2.length()][str2.length()];
	    for (int i = 0; i < strs.length; i++) {
	    	 for (int j = 0; j < strs.length; j++) {
	 			if (str2.charAt(i) == str2.charAt(j)) {
	 				strs[i][j] = true;
	 			} else {
	 				strs[i][j] = false;
	 			}
	 		}
		}
		for (int i = 0; i < strs.length; i++) {
			for (int j = 0; j < strs.length; j++) {
				if (strs[i][j]) {
					System.out.print(" √ ");
					if (!strs[i][j-1 < 0 ? 1 : j-1 ] && !strs[i][j+1 > strs.length -1 ? strs.length -2 : j+1]) {
						ins.put(i, j);
					}
				} else {
					System.out.print(" x ");
				}
			}
			System.out.println();
		}
		System.out.println("最长不重复的字串的下标：  "+ins);
	}
}
