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
		
		/* ���������� �����ϴ� ������� �ٲܰ�
		//Exam exam = new NewlecExam();
		//Exam exam = new NewlecExam(10,10,10,10);
		ExamConsole console =new GridExamConsole(exam);
		console.setExam(exam);
		*/
	
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("spring/di/settings.xml");
		
//		ExamConsole console=(ExamConsole) context.getBean("console");
		Exam exam =context.getBean(Exam.class);				//exam�� ���������ð��̴�. Exam�̶�� �༮�� �����Ͱ� ������ ��ȯ�ش޶�.
		System.out.println(exam.toString());				//�׸��� �� Exam�� ����Ұ��̴�.
		ExamConsole console=context.getBean(ExamConsole.class);	
		console.print();
		
//		List<Exam> exams= (List<Exam>) context.getBean("exams");//new ArrayList<>();		//�̳༮�� ���ؼ� ������ �༮�� Exam�̴�. Exam�� �����ϱ����� �ݷ������ν�
//		exams.add(new NewlecExam(1,1,1,1));		//exams���ٰ� �߰��Ҽ��ֵ�. exam��ü�� newlecExam�� �߰�����
		
//		for(Exam e: exams)
//			System.out.println(e);
	}

}
