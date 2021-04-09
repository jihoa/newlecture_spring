package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdvice implements ThrowsAdvice {
	//밑줄이 안그어진다. 왜냐면 Throw가 구현해야할 함수가 정해지지않아서이다.
	//	얘는 어떤 예외가 발생하느냐에따라서 달라져서  그렇다.
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("예외가 발생하였습니다.: "+e.getMessage());
	}	
	
}
