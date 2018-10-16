package com.stly7.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.stly7.pojo.Category;

// spring的测试类
@RunWith(SpringJUnit4ClassRunner.class)
// 加载配置文件
@ContextConfiguration("classpath:application_IOC_ANNOCATION.xml")
public class TestSpring {
	@Autowired
	private Category c;
	
	@Test
	public void test() {
		System.out.println(c);
	}
}
