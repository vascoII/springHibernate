package springbootHibernate.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springbootHibernate.demo.annotations.bean.Coach;

public class SetterAnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
		//get the bean from spring container
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//close the container
		context.close();
	}

}
