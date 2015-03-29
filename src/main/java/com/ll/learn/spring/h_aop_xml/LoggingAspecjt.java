package com.ll.learn.spring.h_aop_xml;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 
 * @author Administrator
 *
 */
public class LoggingAspecjt {

	public void beforeMethod(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.println("Logging..methodName["+methodName+"]...ags["+Arrays.asList(args)+"]....before");
	}

	public void afterMethod(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("Logging..methodName["+methodName+"]..end...after");
	}
	
	public void afterReturning(JoinPoint joinPoint, Object object){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("Logging..methodName["+methodName+"]..afterReturning");
	}
	
	public void afterThrowing(JoinPoint joinPoint, Exception ex){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("Logging..methodName["+methodName+"]..afterThrowing");
	}
	
	public void around(ProceedingJoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		
		try {
			//前置通知  before
			System.out.println("before");
			//执行目标方法
			System.out.println("proceed..." + methodName);
			joinPoint.proceed();
			//返回通知 afterReturning
			System.out.println("afterReturning");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//异常通知
			System.out.println("afterThrowing");
		}
		//返回通知
		System.out.println("after");
	}
	
}
