package springbootHibernate.demo.annotations.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springbootHibernate.demo.annotations.service.FortuneService;

@Component
public class BaseballCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    public BaseballCoach() {

    }

    @Override
    public String getDailyWorkout() {
        return "Practice by throwing ball at full speed";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

    /*
    @Autowired
    public void setDailyFortune(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */
}
