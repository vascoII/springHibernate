package springbootHibernate.demo.one.bean;

import springbootHibernate.demo.one.service.FortuneService;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }
    //setter method for injection
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15min";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
