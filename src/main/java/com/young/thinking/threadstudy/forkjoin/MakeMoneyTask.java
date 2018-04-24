package com.young.thinking.threadstudy.forkjoin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;

public class  MakeMoneyTask extends RecursiveTask<Integer>{

	private static final long serialVersionUID = -3312996125383209851L;
	private static final int MIN_GOAL_MONEY = 100000;
    private int goalMoney;
    private String name;
    private static final AtomicLong employeeNo = new AtomicLong();
    public MakeMoneyTask(int goalMoney){
        this.goalMoney = goalMoney;
        this.name = "Ա��" + employeeNo.getAndIncrement() + "��";
    }
    @Override
    protected Integer compute() {
        if (this.goalMoney < MIN_GOAL_MONEY){
            System.out.println(name + ": �ϰ彻����,Ҫ׬ " + goalMoney + " Ԫ,Ϊ������,���Ͱ�....");
            return makeMoney();
        }else{
            int subThreadCount = ThreadLocalRandom.current().nextInt(10) + 2;
            System.out.println(name + ": �ϼ�Ҫ��׬ " + goalMoney + ", �е�С��,û������" + subThreadCount + "������ȥ��ɰ�," +
                    "ÿ��׬�� " + Math.ceil(goalMoney * 1.0 / subThreadCount) + "ԪӦ��û����...");
            List<MakeMoneyTask> tasks = new ArrayList<>();
            for (int i = 0; i < subThreadCount; i ++){
                tasks.add(new MakeMoneyTask(goalMoney / subThreadCount));
            }
            Collection<MakeMoneyTask> makeMoneyTasks = invokeAll(tasks);
            int sum = 0;
            for (MakeMoneyTask moneyTask : makeMoneyTasks){
                try {
                    sum += moneyTask.get();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println(name + ": ��,����,Ч�ʻ�����,����׬�� " + sum + "Ԫ,�Ͻ�����ȥ....");
            return sum;
        }
    }

    private Integer makeMoney(){
        int sum = 0;
        int day = 1;
        try {
            while (true){
                Thread.sleep(ThreadLocalRandom.current().nextInt(500));
                int money = ThreadLocalRandom.current().nextInt(MIN_GOAL_MONEY / 3);
                System.out.println(name + ": �ڵ� " + (day ++) + " ��׬��" + money);
                sum += money;
                if (sum >= goalMoney){
                    System.out.println(name + ": ����׬�� " + sum + " Ԫ, ���Խ�����...");
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return sum;
    }
}