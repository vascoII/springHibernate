package springbootHibernate.demo.one;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springbootHibernate.demo.one.bean.Coach;

@SpringBootApplication
public class BeanScopeLifeCycleDemoOneApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		//retrieve bean from config file
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		//Close context
		context.close();
	}

}
