package springbootHibernate.demo.one;

public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Spend 30min running";
    }
}
