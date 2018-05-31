/**
 * 
 */
package com.young.thinking.threadstudy;

import java.io.File;

/**
 * @author Administrator
 *
 */
public class Test {

    /**
     * @param args
     */
    //��Դ�ļ�
    private static String sourceFile;
    //Ŀ���ļ�
    private static String targetFile;
    //�ֿ���
    private static int blockCount;
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //
		File f1 = new File("D:" + File.separator + "IO�ļ�����" + File.separator
				+ "�ŵ�ΰ - ����.mp3");
		File f2 = new File("D:" + File.separator + "IO�ļ�����" + File.separator
				+ "2.mp3");
        sourceFile=args[0];
        targetFile=args[1];
        blockCount=Integer.parseInt(args[2]);
        //��¼��ʼʱ��
        long beginTime=System.currentTimeMillis();
        //���ηֿ�����ļ�COPY
        for(int i=0;i<blockCount;i++)
        {
            //ʵ�����ļ����ƶ���
            CopyFile copyFile=new CopyFile(sourceFile,targetFile,blockCount,i);
            //ʵ�����߳�
            Thread thread=new Thread(copyFile);
            //��ʼ�߳�
            thread.start();
            try
            {
                //�����߳�
                thread.join();
            }
            catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
        //�����ʱ
        long endTime=System.currentTimeMillis();
        //�����ʱ
        System.out.println("����ʱ:"+(endTime-beginTime)+"ms");

    }
}