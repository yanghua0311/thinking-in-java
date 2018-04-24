/**
 * 
 */
package com.young.thinking.threadstudy.proandcon;

/**
 * @author Administrator
 *
 */
/**
 * 产品类
 * @author mc
 *
 */
public class Product {

	  private int id;  // 产品id  
	  private String name;// 产品名称  
	  
	    public Product(int id, String name) {  
	        this.id = id;  
	        this.name = name;  
	    }  
	  
	    @Override  
	    public String toString() {  
	        return "(产品ID：" + id + " 产品名称：" + name + ")";  
	    }  
	  
	    public int getId() {  
	        return id;  
	    }  
	  
	    public void setId(int id) {  
	        this.id = id;  
	    }  
	  
	    public String getName() {  
	        return name;  
	    }  
	  
	    public void setName(String name) {  
	        this.name = name;  
	    }  
}
