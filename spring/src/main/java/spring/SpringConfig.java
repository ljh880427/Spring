package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "spring")  //어노테이션
@Configuration   // app-context.xml 만든것과 같음.
public class SpringConfig {
	
//	@Bean
//	public HomeController homeController() {
//		return new HomeController();
//	}
//	
//	@Bean
//	public HomeService homeService() {
//		return new HomeService();
//	}
	
}
