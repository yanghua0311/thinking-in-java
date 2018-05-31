/**
 * 
 */
package com.young.thinking.threadstudy;

import java.lang.reflect.Method;

class User {
	/*
	 * private User(){//将默认的构造方法私有化的话就不可以再创建对象，两种方法 都是这样}
	 */

	public String toString() {
		return "User 对象创建成功！";
	}
	private void test(){
		System.out.println("执行私有方法");
	}
}

public class NewInstance1 {
	public static void main(String[] args) throws Exception {
		// 传统方式创建对象
		System.out.println(new User());
		// 使用反射的方式

		Class c = User.class;
		User u = (User) c.newInstance();
		Method m=c.getDeclaredMethod("test");
		m.setAccessible(true);
		m.invoke(u);
		/*
		 * 直接 newInstance 的话必须保证默认的构造方法正常存在，也就是没 有被私有化！这是前提条件
		 */
		System.out.println("");
	}
}