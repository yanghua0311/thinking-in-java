/**
 * 
 */
package com.young.thinking.hashdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.young.thinking.model.User;

/**
 * Created by youngwa on 2017Äê12ÔÂ25ÈÕ
 *
 */
public class SetDemo {
	public static void main(String[] args) {
		User user1=new User("yh",23);
		User user2=new User("yh",23);
		User user3=new User("yh",23);
		Set<User> set1=new HashSet<User>();
		List<User> list1 = new ArrayList<User>();
		set1.add(user1);
		set1.add(user1);
		set1.add(user1);
		list1.add(user1);
		list1.add(user1);
		list1.add(user1);
		System.out.println(list1);
		System.out.println(set1);		
	}
}
