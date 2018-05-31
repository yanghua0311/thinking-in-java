/**
 * 
 */
package com.young.thinking.model;

import lombok.Data;

/**
 * Created by youngwa on 2017Äê12ÔÂ25ÈÕ
 *
 */
@Data
public class User {
	private String name;
	private int age;

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	

}
