import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.model.SpringTest;
import com.service.ServiceExample;

import config.Config;
import lifeCycle.test.LifeCycleTest;
import scope.test.TestScope;

public class MainForExample {

	public static void main(String[] args) {
		ApplicationContext contex=new AnnotationConfigApplicationContext(Config.class);
		//SpringTest springTest=(SpringTest) contex.getBean("springTest");
//		springTest.printYourMessage();
		
		ServiceExample serviceExample=(ServiceExample) contex.getBean(ServiceExample.class);
       serviceExample.printFromDao();
		
//		TestScope testScope=(TestScope) contex.getBean("testScope");
//		TestScope testScope2=(TestScope) contex.getBean("testScope");
//		TestScope testScope3=(TestScope) contex.getBean("testScope");
	
	}

}
 