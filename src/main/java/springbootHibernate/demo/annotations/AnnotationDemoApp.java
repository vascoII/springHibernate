package springbootHibernate.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springbootHibernate.demo.annotations.bean.Coach;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
		//get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		//close the container
		context.close();
	}

}
