package com.young.thinking.listdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SimpleIteration {
	public static void main(String[] args) {

		List<String> list1=new ArrayList<String>(Arrays.asList("a","b","c","d"));  //Arrays.asList转化的只是数组Arrays，不支持add和remove方法
		Iterator<String> iterator=list1.iterator();
/*		while(iterator.hasNext()){
			System.out.println(iterator.next());
			iterator.remove();
		}*/
/*		for (int i = 0; i < 2; i++) {
			System.out.println(iterator.next());
			
		}*/
		
		System.out.println(list1.size());

		/*		List<Integer> list = new ArrayList<Integer>();  
        for(int i =1;i<10;i++){  
            list.add(i);  
        }  
        Iterator<Integer> it = list.iterator();  
        while(it.hasNext()){  
            System.out.println(it.next());  
            it.remove();  
        } */ 
		ListIterator<String> listitor=list1.listIterator(2);
		while(listitor.hasNext()){
			listitor.next();
			listitor.set("d");
		}
		System.out.println(list1);
	}
}
