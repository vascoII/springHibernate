package springbootHibernate.demo.one;

import springbootHibernate.demo.one.bean.Coach;
import springbootHibernate.demo.one.bean.TrackCoach;

public class MyApp {

    public static void main(String[] args) {

        Coach theCoach = new TrackCoach();
        System.out.println(theCoach.getDailyWorkout());
    }
}
