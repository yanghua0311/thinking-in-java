/**
 * 
 */
package com.young.thinking.threadstudy;
/**
 * �򵥵���������
 * @author С��΢��
 *
 */
public class DeadLock extends Thread{
    public DeadLock(String name){
        super(name);
    }  
    public void run() {        
        while(true){
            if("��ʹ��".equals(Thread.currentThread().getName())){
                /**
                 * �򵥳�����Ԥ����������
                 */
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                synchronized ("ң����") {
                    System.out.println("��ʹ���õ�ң������׼��ȥ�õ�أ�");
                    synchronized ("���") {
                        System.out.println("��ʹ���õ�ң�����͵�أ����ſյ�ˬ����.....��");
                        break;
                    }
                }
                
                
            }else if("��С��".equals(Thread.currentThread().getName())){
                synchronized ("���") {
                    System.out.println("��С���õ���أ�׼��ȥ��ң������");
                    synchronized ("ң����") {
                        System.out.println("��С���õ�ң�����͵�أ����ſյ�ˬ����.....��");
                        break;
                    }
                }
                
            }
        }
    }
    public static void main(String[] args) {
        DeadLock yan=new DeadLock("��ʹ��");
        yan.start();
        DeadLock gxl=new DeadLock("��С��");
        gxl.start();
    }
    
}