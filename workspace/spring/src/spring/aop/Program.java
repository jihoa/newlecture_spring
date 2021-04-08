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
//		Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), 	// 실질적인 객체를 로드하려고 객체정보를 첫번째매개변수로 넘겨줌
//				new Class[] {Exam.class}, 						//인터페이스정보를 넘겨줘야하는데 복수형이어서 배열형태로 넘겨준다.
//																//proxy 가짜라는 뜻도 가지고있다. 윗줄의 코드랑 똑같이 닮아있다. 하지만 곁다리업무를 가지고있다.
//				new InvocationHandler() {
//					
//					@Override
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//						// 핸들러가 가지고있는 가장 중요한부분
//						
//						long start=System.currentTimeMillis();
//						
//						// 실제 업무로직을 꽂아 줘야한다. 실제업무를 담당하는 메소드를 실행하는 변수를 method라는 매개변수에 담겨있다.
//						Object result = method.invoke(exam, args);		//실제 업무인 exam을 넣어준다. 	 호출한 메서드가 가지고있는 인자를 args로 넘겨준다. 모든형태의 값을 반환할수있게 Object형으로 형태를 지정
//						
//
//						long end = System.currentTimeMillis();
//						
//						String message=(end-start)+"ms 시간이 흘렀다.";
//						System.out.println(message);
//						
//						return result;
//					}
//				});	// 마지막 은 핸들러라는 녀석을 꽂을수있다. 곁다리업무를 꽂을수있다. 인터페이스를 구현하는 클래스를  객체화하는 작업을해야하는데 별도의 클래스파일을 만들어야하는데 익명으로 익명클래스를 작성할것이다.
		
		
	}

}
