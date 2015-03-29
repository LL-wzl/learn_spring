package com.ll.learn.spring.h_aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator
 *
 */
@Order(1)
@Component
@Aspect
public class ValidateAspecjt {
	
	@Before("LoggingAspecjt.pointCutExpression()")
	public void beforeMethod(){
		System.out.println("--validate..before");
	}

}
