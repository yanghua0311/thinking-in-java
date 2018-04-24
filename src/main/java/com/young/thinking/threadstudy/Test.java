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
    //来源文件
    private static String sourceFile;
    //目标文件
    private static String targetFile;
    //分块数
    private static int blockCount;
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //
		File f1 = new File("D:" + File.separator + "IO文件处理" + File.separator
				+ "杜德伟 - 情人.mp3");
		File f2 = new File("D:" + File.separator + "IO文件处理" + File.separator
				+ "2.mp3");
        sourceFile=args[0];
        targetFile=args[1];
        blockCount=Integer.parseInt(args[2]);
        //记录开始时间
        long beginTime=System.currentTimeMillis();
        //依次分块进行文件COPY
        for(int i=0;i<blockCount;i++)
        {
            //实例化文件复制对象
            CopyFile copyFile=new CopyFile(sourceFile,targetFile,blockCount,i);
            //实例化线程
            Thread thread=new Thread(copyFile);
            //开始线程
            thread.start();
            try
            {
                //加入线程
                thread.join();
            }
            catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
        //计算耗时
        long endTime=System.currentTimeMillis();
        //输出耗时
        System.out.println("共用时:"+(endTime-beginTime)+"ms");

    }
}