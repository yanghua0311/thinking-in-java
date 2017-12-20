package com.young.thinking.listdemo;

public class StackTest {
	public static void main(String[] args) {
		SimpleStack<String> stack=new SimpleStack<String>();
		for (String string : "I am winner".split(" ")) {
			stack.push(string);	
		}
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+" ");
		}
	}
}