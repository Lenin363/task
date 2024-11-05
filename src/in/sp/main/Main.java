package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.StudentDetails;
import in.sp.resource.JavaConfig;

public class Main {
	
	
	public static void main(String[] args) {
		
		
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		
//		ApplicationContext  context = new ClassPathXmlApplicationContext("/in/sp/resource/applicationContext.xml");
//		
		ApplicationContext  context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
	
		StudentDetails s  =  (StudentDetails) context.getBean("studentDetails") ;
		StudentDetails s1 =  (StudentDetails) context.getBean("studentDetails") ;
		
		
	
		
	
		
		
	
		System.out.println(s);
		System.out.println(s1);
		
		
	
	}

}
