package com.young.thinking.listdemo;

import java.util.ArrayList;
import java.util.List;

import com.young.thinking.model.User;

public class ForEachTest {
/*	public static void main(String[] args) {
		List<User> users =new ArrayList<>();
		User user = new User("yh", 10);
		users.add(user);
		for (User user1 : users) {
			user1.setName("yh01");
		}
		System.out.println(user);
		System.out.println(users);
	}*/
	 public static void main(String []args)  
	    {  
	        //char ae='a';  
	        //System.out.println(ae+0);  
	        int []c={1,2,3,4,5};  
	        for(int i:c)  
	        {  
	            if(i==3||i==5)  
	                i=i*5;  
	        }  
	        for(int j:c)  
	        {  
	            System.out.println(j);  
	        }  
	    }  
}
