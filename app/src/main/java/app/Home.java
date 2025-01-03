package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String xml = "app-context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(xml);
		//Test1 t1 = context.getBean(Test1.class); // Test1 클래스 Bean 연결 사용
		//Test1 t1 = (Test1) context.getBean("test1"); // Test1 클래스 Bean ID 연결 사용
		Test1 t1 = context.getBean("test1", Test1.class); // dependency look up (DL)
		// Test t1 = new Test1();
		System.out.println(t1.add(1, 3));
		System.out.println("스프링은 자바의 봄이다!");
		
		Test2 t2 = context.getBean("test2", Test2.class);
		System.out.println(t2.getName());
		
		Test3 t3 = context.getBean("test3", Test3.class);
		System.out.println(t3.getName());
		
	}

}
