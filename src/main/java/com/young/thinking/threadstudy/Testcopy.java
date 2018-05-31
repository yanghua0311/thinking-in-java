/**
 * 
 */
package com.young.thinking.threadstudy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Administrator
 * 
 */
public class Testcopy implements Runnable {
//	private File file1;
//	private File file2;
//
//	public Testcopy(File file1, File file2) {
//        this.file1=file1;
//        this.file2=file2;
//	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
        try {
//			Copy(file1,file2);
        	Copy();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Copy() throws IOException {
		File file1 = new File("D:" + File.separator + "IO文件处理" + File.separator
				+ "杜德伟 - 情人.mp3");
		System.out.println(file1.getPath());
		File file2 = new File("D:" + File.separator + "IO文件处理" + File.separator
				+ "5.mp3");
		FileInputStream fis1 = new FileInputStream(file1);
		FileOutputStream fis2 = new FileOutputStream(file2);
		BufferedInputStream bis1 = new BufferedInputStream(fis1);
		BufferedOutputStream bis2 = new BufferedOutputStream(fis2);
		int len ;
		while ((len = bis1.read()) != -1) {
			bis2.write(len);
		}
		System.out.println("复制完毕");
		bis1.close();
		bis2.close();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File f1 = new File("D:" + File.separator + "IO文件处理" + File.separator
//				+ "杜德伟 - 情人.mp3");
//		File f2 = new File("D:" + File.separator + "IO文件处理" + File.separator
//				+ "4.mp3");
		Testcopy c=new Testcopy();
		Thread t=new Thread(c);
		t.start();
	}

}
