package com.young.thinking.threadstudy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
//ÿ���̶߳�ȡһ�����ļ���
public class CopyFile implements Runnable {
	private String srcFile;
	private String destFile;
	private int threadCount;//�̸߳���
	private int threadNo;//�̱߳��
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
		long readLength=fileLength/threadCount;//ÿ���̶߳����ļ�����
		long startPosition=readLength*threadNo;//������λ��
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
				System.out.println(Thread.currentThread().getName()+"��������..."+curLength);

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
		
		 String srcFile="D:" + File.separator + "IO�ļ�����" + File.separator
					+ "helloworld2.txt";
		 File file=new File(srcFile);
			long fileLength=file.length();
			System.out.println(fileLength);
		 String temp=srcFile.substring(srcFile.lastIndexOf("."));//��ȡ�ļ��ĺ�׺��
		 System.out.println(temp);
		 String destFile="D:"+File.separator+"IO�ļ�����" + File.separator+ System.currentTimeMillis()+"b"+temp;
		for (int i = 0; i < 5; i++) {
			CopyFile c=new CopyFile(srcFile,destFile,5,i);
			Thread th=new Thread(c);
			th.start();
		}
		
	}
	

}
