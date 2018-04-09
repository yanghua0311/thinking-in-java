package com.young.thinking.adaptermodel;

/**
 * Created by youngwa on 2018年4月9日
 *
 */
/**
 * 适配器的场景，当一个类中的方法（Apply）处理一个接口（Processor），
 * 接口中的抽象方法和另一个类（Filter）当方法相似，也想被这样处理，
 * 可以考虑用一个代理类（FilterProcessor）实现这个接口在代理类中注入另一个类，结合该类实现接口中的抽象方法
 * 接受已经拥有的接口，返回需要的接口
 */
public class FilterProcessor {
	public static void main(String[] args) {
		WaveForm wf = new WaveForm();
		WaveForm wf2 = new WaveForm();

		Apply.process(new FilterAdapter(new LowPass(2.0)), wf);
		Apply.process(new FilterAdapter(new HighPass(10l)), wf2);

	}
}
