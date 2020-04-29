package springbootHibernate.demo.one.bean;

import springbootHibernate.demo.one.service.FortuneService;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30min running";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
