package com.stly7.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component("aspectLog")
public class LoggerAspect {
	@Around(value="execution(* com.stly7.service.ProductService.*(..))")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("start log:" + joinPoint.getSignature() + "  " + System.currentTimeMillis());
		// 这段是核心业务了
		Object object = joinPoint.proceed();
		System.out.println("end log:" + joinPoint.getSignature() + "  " + System.currentTimeMillis());
		return object;
	}
}
