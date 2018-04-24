package com.young.thinking.threadstudy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
//每个线程读取一部分文件。
public class CopyFile implements Runnable {
	private String srcFile;
	private String destFile;
	private int threadCount;//线程个数
	private int threadNo;//线程编号
	int curLength;
	public CopyFile(){}
	public CopyFile(String srcFile,String destFile,int threadCount,int threadNo){
		this.srcFile=srcFile;
		this.destFile=destFile;
		this.threadCount=threadCount;
		this.threadNo=threadNo;
	}
	public void run() {
		copyFile();
	}
	public  void copyFile(){
		File file=new File(srcFile);
		long fileLength=file.length();
		long readLength=fileLength/threadCount;//每个线程读的文件长度
		long startPosition=readLength*threadNo;//跳过的位置
		RandomAccessFile raf=null;
		FileInputStream fis=null;
		byte []buf=new byte[(int)readLength];
		try {
			fis=new FileInputStream(file);
			fis.skip(startPosition);
			raf=new RandomAccessFile(destFile,"rw");
			raf.seek(startPosition);
			//int curLength=0;
			while((curLength=fis.read(buf))!=-1){	
				raf.write(buf,0,curLength);
				System.out.println(Thread.currentThread().getName()+"正在运行..."+curLength);

			}
					
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					raf.close();
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}	
	}
	public static void main(String[] args) {
		
		 String srcFile="D:" + File.separator + "IO文件处理" + File.separator
					+ "helloworld2.txt";
		 File file=new File(srcFile);
			long fileLength=file.length();
			System.out.println(fileLength);
		 String temp=srcFile.substring(srcFile.lastIndexOf("."));//获取文件的后缀名
		 System.out.println(temp);
		 String destFile="D:"+File.separator+"IO文件处理" + File.separator+ System.currentTimeMillis()+"b"+temp;
		for (int i = 0; i < 5; i++) {
			CopyFile c=new CopyFile(srcFile,destFile,5,i);
			Thread th=new Thread(c);
			th.start();
		}
		
	}
	

}
