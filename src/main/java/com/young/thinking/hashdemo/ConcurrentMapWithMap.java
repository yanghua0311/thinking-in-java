package com.young.thinking.hashdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

public class ConcurrentMapWithMap {
	private static Map<String, Long> mapWordCounts = new HashMap<>();
	private static ConcurrentMap<String, Long> concurrentMapWordCounts = new ConcurrentHashMap<>();
	public static int count = 0;

	public static long mapIncrease(String word) {
		Long oldValue = mapWordCounts.get(word);
		Long newValue = (oldValue == null) ? 1L : oldValue + 1;
		mapWordCounts.put(word, newValue);
		return newValue;
	}

	public static long ConcurrentMapIncrease(String word) {
		Long oldValue, newValue;
		while (true) {
			oldValue = concurrentMapWordCounts.get(word);
			if (oldValue == null) {
				newValue = 1L;
				// �Ѿ���key�˾ͷ��ط����ֵ�����򷵻ؿ�
				if (concurrentMapWordCounts.putIfAbsent(word, newValue) == null) {
					break;
				}
			} else {
				newValue = oldValue + 1;
				// ֵ�滻��ÿ���滻ʱ����Ƚ������õ�oldValue�Ƿ���ǵ�ǰmap�����ֵ���ǲ��滻�����������ȡ
				if (concurrentMapWordCounts.replace(word, oldValue, newValue)) {
					break;
				}
			}
		}
		return newValue;
	}

	public static void mapWordCount() throws InterruptedException, ExecutionException {
		new Thread(new Runnable() {
			public void run() {
				int count = 0;
				while (count++ < 10000)
					ConcurrentMapWithMap.mapIncrease("work");
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				int count = 0;
				while (count++ < 10000)
					;
				ConcurrentMapWithMap.mapIncrease("work");
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				int count = 0;
				while (count++ < 10000)
					ConcurrentMapWithMap.mapIncrease("work");
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				int count = 0;
				while (count++ < 10000)
					ConcurrentMapWithMap.mapIncrease("work");
			}
		}).start();
	}

	public static void concurrentWordCount() throws InterruptedException, ExecutionException {
		new Thread(new Runnable() {
			public void run() {
				int count = 0;
				while (count++ < 10000)
					ConcurrentMapWithMap.ConcurrentMapIncrease("work");
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				int count = 0;
				while (count++ < 10000)
					ConcurrentMapWithMap.ConcurrentMapIncrease("work");
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				int count = 0;
				while (count++ < 10000)
					ConcurrentMapWithMap.ConcurrentMapIncrease("work");
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				int count = 0;
				while (count++ < 10000)
					ConcurrentMapWithMap.ConcurrentMapIncrease("work");
			}
		}).start();
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ConcurrentMapWithMap.mapWordCount();
		Thread.sleep(10000);
		System.out.println("final count map" + ConcurrentMapWithMap.mapWordCounts.get("work"));// ���߳��ۼӣ�ÿ�ζ�����40000�����̲߳���ȫ
		ConcurrentMapWithMap.concurrentWordCount();
		Thread.sleep(10000);
		System.out.println("final count concurrentMap" + ConcurrentMapWithMap.concurrentMapWordCounts.get("work"));// ���߳��ۼӣ�ÿ�ζ���40000
	}

}
