package springbootHibernate.demo.annotations;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springbootHibernate.demo.annotations.bean.Coach;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
		//get the bean from spring container
		Coach theCoach = context.getBean("theTennisCoach", Coach.class);
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		//close the container
		context.close();
	}

}
