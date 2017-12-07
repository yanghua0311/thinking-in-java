package com.young.thinking.jiekou;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class JIekou {
	public static void main(String[] args) {	
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
		String date = df.format(new Date());
		System.out.println(date);
		
		Date date1=new Date();
	    String timestamp = String.valueOf(date1.getTime()/1000);  
	    System.out.println(Integer.valueOf(timestamp)) ; 
	    
	    String uuid = UUID.randomUUID().toString().replaceAll("-", "");
	    System.out.println(uuid);
	}
}
