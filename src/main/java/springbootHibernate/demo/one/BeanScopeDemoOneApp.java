package springbootHibernate.demo.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springbootHibernate.demo.one.bean.Coach;

@SpringBootApplication
public class BeanScopeDemoOneApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrieve bean from config file
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		//check if they are the same bean
		boolean res = (theCoach == alphaCoach);
		System.out.println("Pointing to the same obj: " + res);
		System.out.println("Memory location for theCoach: " + theCoach);
		System.out.println("Memory location for alphaCoach: " + alphaCoach);
		//retrieve bean from config file
		Coach theOtherCoach = context.getBean("yourCoach", Coach.class);
		Coach alphaOtherCoach = context.getBean("yourCoach", Coach.class);
		//check if they are the same bean
		boolean resOther = (theOtherCoach == alphaOtherCoach);
		System.out.println("Pointing to the same obj: " + resOther);
		System.out.println("Memory location for theOtherCoach: " + theOtherCoach);
		System.out.println("Memory location for alphaOtherCoach: " + alphaOtherCoach);
		//Close context
		context.close();

	}

}
