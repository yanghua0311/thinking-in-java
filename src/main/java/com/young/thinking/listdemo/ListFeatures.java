package com.young.thinking.listdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.apache.commons.collections.CollectionUtils;
public class ListFeatures {
    public static void main(String[] args) {
		Random rand = new Random(47);
		List<String> pets = new ArrayList<String>();
		System.out.println(pets.isEmpty());
		pets.add("a");
		pets.add("b");
		pets.add("c");
		/*		System.out.println(pets.isEmpty());
		pets.clear();
		System.out.println(pets.isEmpty());
		System.out.println(CollectionUtils.isEmpty(pets));
		pets.add(null);
		pets.add(null);		
		pets.add(null);
		System.out.println(pets.isEmpty());
		System.out.println(CollectionUtils.isEmpty(pets));	
		System.out.println(pets.size());
		System.out.println(pets.toString());
		System.out.println(pets.contains(null));*/
		pets.retainAll(Arrays.asList("a","d","bb","b"));  //取交集 a，b
		Collections.sort(pets);    			//正序 a，b
		//Collections.shuffle(pets);		//倒序b，a
		System.out.println(pets.toString());

	}	

}
