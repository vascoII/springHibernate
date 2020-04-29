package springbootHibernate.demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springbootHibernate.demo.one.bean.Coach;

public class HelloSpringApp {

    public static void main(String[] args) {
        //load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from config file
        Coach theCoach = context.getBean("myCoach", Coach.class);
        //call method getDailyWorkout on bean
        System.out.println(theCoach.getDailyWorkout());
        //call method getDailyFortune on bean
        System.out.println(theCoach.getDailyFortune());
        //close the context
        context.close();
    }
}
