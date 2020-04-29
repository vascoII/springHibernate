package springbootHibernate.demo.one;

import springbootHibernate.demo.one.bean.Coach;
import springbootHibernate.demo.one.bean.TrackCoach;
import springbootHibernate.demo.one.service.FortuneService;

public class MyApp {

    public static void main(String[] args, FortuneService fortuneService) {

        Coach theCoach = new TrackCoach(fortuneService);
        System.out.println(theCoach.getDailyWorkout());
    }
}
