package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/aop/settings.xml");
//				new AnnotationConfigApplicationContext(NewlecDIconfig.class);

		Exam proxy= (Exam) context.getBean("proxy");
		
		System.out.printf("total is %d\n", proxy.total());
		
//		Exam exam = new NewlecExam(1,1,1,1);
//		
//		Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), 	// �������� ��ü�� �ε��Ϸ��� ��ü������ ù��°�Ű������� �Ѱ���
//				new Class[] {Exam.class}, 						//�������̽������� �Ѱ�����ϴµ� �������̾ �迭���·� �Ѱ��ش�.
//																//proxy ��¥��� �浵 �������ִ�. ������ �ڵ�� �Ȱ��� ����ִ�. ������ ��ٸ������� �������ִ�.
//				new InvocationHandler() {
//					
//					@Override
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//						// �ڵ鷯�� �������ִ� ���� �߿��Ѻκ�
//						
//						long start=System.currentTimeMillis();
//						
//						// ���� ���������� �Ⱦ� ����Ѵ�. ���������� ����ϴ� �޼ҵ带 �����ϴ� ������ method��� �Ű������� ����ִ�.
//						Object result = method.invoke(exam, args);		//���� ������ exam�� �־��ش�. 	 ȣ���� �޼��尡 �������ִ� ���ڸ� args�� �Ѱ��ش�. ��������� ���� ��ȯ�Ҽ��ְ� Object������ ���¸� ����
//						
//
//						long end = System.currentTimeMillis();
//						
//						String message=(end-start)+"ms �ð��� �귶��.";
//						System.out.println(message);
//						
//						return result;
//					}
//				});	// ������ �� �ڵ鷯��� �༮�� �������ִ�. ��ٸ������� �������ִ�. �������̽��� �����ϴ� Ŭ������  ��üȭ�ϴ� �۾����ؾ��ϴµ� ������ Ŭ���������� �������ϴµ� �͸����� �͸�Ŭ������ �ۼ��Ұ��̴�.
		
		
	}

}
