package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringHome implements SpringRUnner {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("봄에는 봄봄봄");
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
	 	HomeController home = context.getBean("homeController", HomeController.class);
		System.out.println(home);
		home.point();
	}
	
	

}



