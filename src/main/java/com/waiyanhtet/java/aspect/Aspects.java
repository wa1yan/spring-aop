package com.waiyanhtet.java.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import com.waiyanhtet.java.service.User;

public class Aspects {
	
	public void doBefore(JoinPoint joinpoint) {
		System.out.println("Start Processing.");
		for(var arg : joinpoint.getArgs()) {
			System.out.print(arg + " ");
		}
		System.out.println("");
	}
	
	public void doAfter() {
		System.out.println("End Processing.");
	}
	
	public void afterReturning(User user) {
		System.out.println("After Returning");
		System.out.println(user.toString());
	}
	
	public void afterThrowing() {
		System.out.println("After Throwing");
	}
	
	public Object around(ProceedingJoinPoint joinPoint) {
		System.out.println("Around");
		Object result = null;
		try {
			result = joinPoint.proceed();
			return result;
		} catch (Throwable e) {
			System.out.println("Exception " + e.getMessage());
			throw new RuntimeException(e);
		} finally {
			System.out.println("After finally");
		}
	}

}
