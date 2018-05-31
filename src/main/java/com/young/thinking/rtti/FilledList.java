/**
 * 
 */
package com.young.thinking.rtti;

import java.util.ArrayList;
import java.util.List;

import com.young.thinking.model.CountedInteger;

/**
 * Created by youngwa on 2018Äê1ÔÂ15ÈÕ
 *
 */
public class FilledList<T> {
	private Class<T> type;

	public FilledList(Class<T> type) {
		super();
		this.type = type;
	}

	public List<T> create(int nElements) {
		List<T> result = new ArrayList<T>();
		try {
			for (int i = 0; i < nElements; i++) {
				result.add(type.newInstance());
			}
		} catch (Exception e) {
			throw new RuntimeException();
		}
		return result;
	}
public static void main(String[] args) {
	FilledList<CountedInteger> fl = new FilledList<CountedInteger>(CountedInteger.class);
	System.out.println(fl.create(10));
}
}
