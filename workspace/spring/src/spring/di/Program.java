package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
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
		
//		List<Exam> exams= (List<Exam>) context.getBean("exams");//new ArrayList<>();		//이녀석을 통해서 참조할 녀석은 Exam이다. Exam을 참도하기위한 콜렉션으로써
//		exams.add(new NewlecExam(1,1,1,1));		//exams에다가 추가할수있따. exam객체를 newlecExam을 추가하자
		
//		for(Exam e: exams)
//			System.out.println(e);
	}

}
