package com.young.thinking.hashdemo;

import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by youngwa on 2018/4/24.
 */
public class Add10000Value {
    static boolean flag =false;

    public static void main(String[] args) {
        Map<String,Integer> map = new ConcurrentHashMap<String,Integer>();
        Runnable runnable = ()->{
            for(int i=0;i<100;i++){
                if(map.size()>99){
                    System.out.println("Thread has stopped");
                    flag = true;
                    break;
                }
                String str = UUID.randomUUID().toString();
                map.put(str,i);

            }
        };
        for (int i = 0; i < 15; i++) {
            Thread th = new Thread(runnable);
            th.start();
        }
        while(true){
            if(flag){
             System.out.println(map.size());
              break;
            }
        }
    }
}
