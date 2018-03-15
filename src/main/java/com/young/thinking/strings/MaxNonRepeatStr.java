package com.young.thinking.strings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by youngwa on 2018��3��15��
 *
 */
public class MaxNonRepeatStr {
	  static List<String> notRepeatStr = new ArrayList<String>();
	  static String maxString = "";

	  public static void main(String[] args) {
	    String str2 = "С����������666";
	    calcStr(str2);
	    sortStr(str2);

	    for (int i = 0; i < notRepeatStr.size(); i++) {
	      if (i == 0) {
	        String strFirst = joinStr("", notRepeatStr.get(0), notRepeatStr.get(1));
	        maxString = strFirst;
	      } else if (i == notRepeatStr.size() - 1) {
	        String strMiddle = joinStr(notRepeatStr.get(i - 1), notRepeatStr.get(i), "");
	        if (maxString.length() < strMiddle.length()) {
	          maxString = strMiddle;
	        }
	      } else {
	        String strLast = joinStr(notRepeatStr.get(i - 1), notRepeatStr.get(i), notRepeatStr.get(i + 1));
	        if (maxString.length() < strLast.length()) {
	          maxString = strLast;
	        }
	      }

	    }
	    System.out.println(notRepeatStr.toString());
	    System.out.println(maxString);
	  }
	  
	  //ȥ�غ�����
	  private static void sortStr(String str2) {
	    List<String> sortList = new ArrayList<String>(str2.length());
	    Map<Integer,String> sortMap = new TreeMap<>((o1, o2) -> o1.compareTo(o2));
	    for (String str : notRepeatStr) {      
	      sortMap.put(str2.indexOf(str),str);
	    }
	    for (Integer sort : sortMap.keySet()) {
	      sortList.add(sortMap.get(sort));  
	    }
	    notRepeatStr = new ArrayList<String>();
	    notRepeatStr.addAll(sortList);
	  }

	  private static String joinStr(String... str) {
	    String midStr = str[1];
	    String rightArr = str[0];
	    String leftArr = str[2];
	    if (!"".equals(rightArr)) {
	      for (int i = rightArr.length(); i > 0; i--) {
	        if (!midStr.contains(rightArr.substring(i - 1, i))) {
	          midStr = rightArr.substring(i - 1, i) + midStr;
	        } else {
	          break;
	        }
	      }
	    }
	    if (!"".equals(leftArr)) {
	      for (int j = 0; j < leftArr.length(); j++) {
	        if (!midStr.contains(leftArr.substring(j, j ))) {
	          midStr = midStr + rightArr.substring(j, j );
	        } else {
	          break;
	        }
	      }
	    }
	    return midStr;
	  }

	  static void calcStr(String str) {
	    int key = 0, key2 = 0;
	    char[] strArr = str.toCharArray();
	    for (int i = 0; i < strArr.length - 1; i++) {
	      if (key == 0) {
	        for (int j = i + 1; j < strArr.length - 1; j++) {
	          if (key2 == 0) {
	            if (strArr[i] == strArr[j]) {
	              String rightStr = str.substring(0, j);
	              if (notRepeatStr.contains(str)) {
	                notRepeatStr.remove(str);
	              }
	              notRepeatStr.add(rightStr);
	              String leftStr = str.substring(j, str.length());
	              notRepeatStr.add(leftStr);
	              calcStr(rightStr);
	              calcStr(leftStr);
	              key = 1;
	              key2 = 1;
	            }
	          }
	        }
	      }
	    }
	  }
}
