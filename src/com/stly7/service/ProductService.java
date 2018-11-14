package com.stly7.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stly7.dao.ProductDao;

@Component("pService")
public class ProductService {
	//@Autowired
	@Resource(name="pDao")
	//因为dao上面已经申明了@Component(value="pDao"),这边引用对就OK
	private ProductDao dao;
	
	public void doSomeService() throws SQLException {
		// 调用jdbc进行测试一下性能
		
		ResultSet result = dao.getResult();
		System.out.println("doSomeService");
		System.out.println(result);
	}
}
