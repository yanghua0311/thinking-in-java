package com.young.thinking.adaptermodel;

/**
 * Created by youngwa on 2018年4月9日
 *
 */
public class LowPass extends Filter {
	double cutoff;
	
	public LowPass(double cutoff){
		this.cutoff = cutoff;
	}
	
//	public WaveForm process(WaveForm in){
//		return in;
//	}
}
