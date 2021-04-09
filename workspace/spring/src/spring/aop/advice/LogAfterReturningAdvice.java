package spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterReturningAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// 반환값을 가지고 할것이 있으면해라, 필요없으면 안써도된다.
		System.out.println("returnValue:"+returnValue+", method:"+method.getName());
	
	}

}
