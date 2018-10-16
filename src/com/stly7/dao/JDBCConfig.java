package com.stly7.dao;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE})
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface JDBCConfig {
	 String ip(); 
	 int port() default 3306; 
	 String database(); 
	 String encoding() default "UTF-8"; 
	 String loginName() default "root"; 
	 String password() default "123"; 
}
