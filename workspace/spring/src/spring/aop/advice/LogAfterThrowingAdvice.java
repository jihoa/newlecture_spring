package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdvice implements ThrowsAdvice {
	//������ �ȱ׾�����. �ֳĸ� Throw�� �����ؾ��� �Լ��� ���������ʾƼ��̴�.
	//	��� � ���ܰ� �߻��ϴ��Ŀ����� �޶�����  �׷���.
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("���ܰ� �߻��Ͽ����ϴ�.: "+e.getMessage());
	}	
	
}
