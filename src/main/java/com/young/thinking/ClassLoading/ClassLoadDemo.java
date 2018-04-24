package com.young.thinking.ClassLoading;

/**
 * Created by youngwa on 2018/4/24.
 */
public class ClassLoadDemo {
    static {
        System.out.println("1");
    }
    static  Sample s1 = new Sample("2");
    Sample sa1 = new Sample("3");
    static  Sample s2 = new Sample("4");
    static {
        System.out.println("5");
    }
    ClassLoadDemo(){
        System.out.println("6");
    }
    Sample sa2 = new Sample("7");

    public static void main(String[] args) {
        new ClassLoadDemo();
    }
}
class Sample{
    Sample(String s){
        System.out.println(s);
        }
    }
