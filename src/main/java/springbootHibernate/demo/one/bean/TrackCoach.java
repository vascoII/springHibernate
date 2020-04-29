package springbootHibernate.demo.one.bean;

import springbootHibernate.demo.one.service.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30min running at slow pace then 45min at high pace";
    }

    @Override
    public String getDailyFortune() {

        return "Just do it: " + fortuneService.getFortune();
    }
}
