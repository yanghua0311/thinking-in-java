/**
 * 
 */
package com.young.thinking.threadstudy;

import java.lang.reflect.Method;

class User {
	/*
	 * private User(){//��Ĭ�ϵĹ��췽��˽�л��Ļ��Ͳ������ٴ����������ַ��� ��������}
	 */

	public String toString() {
		return "User ���󴴽��ɹ���";
	}
	private void test(){
		System.out.println("ִ��˽�з���");
	}
}

public class NewInstance1 {
	public static void main(String[] args) throws Exception {
		// ��ͳ��ʽ��������
		System.out.println(new User());
		// ʹ�÷���ķ�ʽ

		Class c = User.class;
		User u = (User) c.newInstance();
		Method m=c.getDeclaredMethod("test");
		m.setAccessible(true);
		m.invoke(u);
		/*
		 * ֱ�� newInstance �Ļ����뱣֤Ĭ�ϵĹ��췽���������ڣ�Ҳ����û �б�˽�л�������ǰ������
		 */
		System.out.println("");
	}
}