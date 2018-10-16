package com.stly7.pojo;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("product")
public class Product {
	
	private String name;
	private float price;
	//@Autowired
	private Category category;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Category getCatgeory() {
		return category;
	}
	// 注入再setter上面也是有效果的,这是spring框架提供封装的注入, resource是原生注解
	//@Autowired
	@Resource(name="c")
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", categeory=" + category.toString() + "]";
	}
	
}
