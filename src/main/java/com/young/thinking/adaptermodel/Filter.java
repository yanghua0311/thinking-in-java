package com.young.thinking.adaptermodel;

/**
 * Created by youngwa on 2018年4月9日
 *
 */
public class Filter {
	public String name(){
		return getClass().getSimpleName();
	}
	public WaveForm process(WaveForm waveForm){
		return waveForm;
	}
}
