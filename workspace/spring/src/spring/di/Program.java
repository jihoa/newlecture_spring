package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/* 스프링에게 지시하는 방법으로 바꿀것
		//Exam exam = new NewlecExam();
		//Exam exam = new NewlecExam(10,10,10,10);
		ExamConsole console =new GridExamConsole(exam);
		console.setExam(exam);
		*/
	
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("spring/di/settings.xml");
		
//		ExamConsole console=(ExamConsole) context.getBean("console");
		Exam exam =context.getBean(Exam.class);				//exam을 직접꺼내올것이다. Exam이라는 녀석에 데이터가 있으면 반환해달라.
		System.out.println(exam.toString());				//그리고 그 Exam을 출력할것이다.
		ExamConsole console=context.getBean(ExamConsole.class);	
		console.print();
	}

}
