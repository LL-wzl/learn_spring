package com.ll.learn.spring.h_aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator
 *
 */
@Aspect
@Component
public class LoggingAspecjt {

	/**
	 *  声明一个切入点表达式。其他类中也可以引用，类名.方法   不同的包中要加上全类名
	 */
	@Pointcut(value="execution(* com.ll.learn.spring.h_aop.*.*(..))")
	public void pointCutExpression(){}
	
	/**
	 * 目标方法执行前执行
	 * @param joinPoint
	 */
	@Before("pointCutExpression()")
	public void beforeMethod(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.println("Logging..methodName["+methodName+"]...ags["+Arrays.asList(args)+"]....before");
	}
	/**
	 * 目标方法执行后执行，不管有没有出现异常都会执行。还不能访问到目标方法的结果
	 * @param joinPoint
	 */
	@After("pointCutExpression()")
	public void afterMethod(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("Logging..methodName["+methodName+"]..end...after");
	}
	
	/**
	 * 返回通知，有异常的时候不会执行
	 * @param joinPoint
	 * @param object
	 */
	@AfterReturning(value="pointCutExpression()", returning="object")
	public void afterReturning(JoinPoint joinPoint, Object object){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("Logging..methodName["+methodName+"]..afterReturning");
	}
	
	/**
	 * 异常通知，有异常的时候执行 其中的参数的异常类表明会catch什么异常，发生其他的异常不会执行
	 * @param joinPoint
	 * @param ex
	 */
	@AfterThrowing(value="pointCutExpression()", throwing="ex")
	public void afterThrowing(JoinPoint joinPoint, Exception ex){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("Logging..methodName["+methodName+"]..afterThrowing");
	}
	/*
	*//**
	 * 环绕通知就包括了其他几个通知
	 * @param pjp
	 *//*
	@Around(value="execution(* com.ll.learn.spring.h_aop.UserDao.*(..))")
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
	*/
}
