package com.stly7;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stly7.pojo.Category;
import com.stly7.pojo.Product;
import com.stly7.service.ProductService;

public class TestSrping {

	public static void main(String[] args) throws SQLException {
		// final String SPRING_PATH = "applicationContext.xml";
		final String SPRING_PATH = "application_AOP_ANNOCATION.xml";

		ApplicationContext context = new ClassPathXmlApplicationContext(SPRING_PATH);

		// 通过加载文件的 xml里面匹配bean上面的的name的值 来获取对象 也是我们常说的DI, ioc
		// Category c = (Category)context.getBean("c");

		// System.out.println(c);
		// Product p = (Product)context.getBean("product");
		// System.out.println(p);
		
		
		// 着里就是AOP 切面编程,需要再配置文件开启AOP功能并且
		// ProductService s = (ProductService) context.getBean("pserevice");
		// s.doSomeService();
		
		// 注解方式编程,注意compont上的标签这就要通过这里进行获得
		ProductService s = (ProductService) context.getBean("pService");
		s.doSomeService();
		
		
	}
}
