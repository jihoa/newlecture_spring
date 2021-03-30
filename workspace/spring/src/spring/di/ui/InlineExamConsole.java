package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	@Autowired				
	@Qualifier("exam1")
	private Exam exam;
	
	public InlineExamConsole() {
		System.out.println("constructor");
	}
	
	@Autowired
	public InlineExamConsole(Exam exam) {
		System.out.println("overloaded constructor");
		this.exam = exam;
	}

	@Override
	public void print() {
		if(exam==null)
			System.out.printf("total is %d, avg is %f\n",0,0.0);
		else
			System.out.printf("total is %d, avg is %f\n", exam.total(),exam.avg());
	}
	
	
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam=exam;
	}
}
