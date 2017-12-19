package com.young.thinking.collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddAllDemo {
    public static void main(String[] args) {
    	System.out.println("11111111111");
    	System.out.println(1);
    	Collection<Integer> co=new ArrayList<Integer>(Arrays.asList(1,2,3,4));
    	System.out.println(co.toString());
    	Stream<Integer> stream=Stream.iterate(1, f->f+2);
    	List<Integer> ins=stream.limit(10).collect(Collectors.toList());
    	Collections.addAll(co, 1,2,3);
    	co.forEach(System.out::println);
    	ins.forEach(System.out::println);
	}
}
