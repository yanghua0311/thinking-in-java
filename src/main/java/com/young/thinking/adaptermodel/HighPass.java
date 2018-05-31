package com.young.thinking.adaptermodel;

/**
 * Created by youngwa on 2018年4月9日
 *
 */
public class HighPass extends Filter {
	long cutoff;

	public HighPass(long cutoff){
		this.cutoff = cutoff;
	}
}
