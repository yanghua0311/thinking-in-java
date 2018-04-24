/**
 * 
 */
package com.young.thinking.threadstudy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Administrator 多线程下载复制 一个文件需要多个线程复制完成
 * 假设用5个线程，获取文件长度，100kb，一个线程20kb
 * 第一个线程0-20kb，20-40kb，。。。80-100kb
 * 随机流实现
 * 
 * 
 */
public class copy implements Runnable {
	private int maxbyte = 1024 * 1024;
	private long count = 3;
	private long seek = 0;
	private File file1;
	private File file2;
	private int Threadsize;
	private int blocksize;

	public copy(File file1, File file2){
		this.file1 = file1;
		this.file2 = file2;
	}
	public copy(File file1, File file2,int Threadsize,int blocksize) {
		this.file1 = file1;
		this.file2 = file2;
		this.Threadsize=Threadsize;
		this.blocksize=blocksize;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			if (count > 0) {
				try {
					copy(file1, file2);
					System.out.println(Thread.currentThread().getName()
							+ "正在复制");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("复制完毕");
				break;
			}
		}
	}

	public synchronized void copy(File file1, File file2) throws IOException {
		FileInputStream f1 = new FileInputStream(file1);
		RandomAccessFile f2 = new RandomAccessFile(file2, "rw");
		f2.seek(seek);
		f1.skip(seek);
//		count = file1.length() / maxbyte;
//		System.out.println(count);
		byte[] buff = new byte[1024 * 1024];
		int len = -1;
		while ((len = f1.read(buff)) != -1) {
			f2.write(buff);
		}
		seek= f2.length();
	    System.out.println(seek);
		count--;
		
		f1.close();
		f2.close();
	}

	public static void main(String[] args) {
		File f1 = new File("D:" + File.separator + "IO文件处理" + File.separator
				+ "杜德伟 - 情人.mp3");
		System.out.println(f1.getPath());
		String temp=f1.getPath().substring(f1.getPath().lastIndexOf("."));
		String temp1=f1.getPath().substring(0,f1.getPath().lastIndexOf("\\"));
		System.out.println(temp);
		System.out.println(temp1);
		File f2 = new File("D:" + File.separator + "IO文件处理" + File.separator
				+ "7.mp3");
//		copy c = new copy(f1, f2);
//		Thread t1 = new Thread(c);
//		Thread t2 = new Thread(c);
//		Thread t3 = new Thread(c);
//		t1.start();
//		t2.start();
//		t3.start();

	}
}
