package com.young.thinking.duotai;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("1");
		list.add("1");
		list.add("1");
		list.add("1");
		System.out.println(list.size());
		list.clear();
		System.out.println(list.size());
		list.add("ww");
		System.out.println(list.size());
 	}
}
