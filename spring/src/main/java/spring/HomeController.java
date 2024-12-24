package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller // bean 연결과 같음.  ex ) app-context.xml 파일에 <bean id="test1" class="app.Test1" /> 와 같음.
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	public void point() {
		System.out.println(homeService);
	}

}
