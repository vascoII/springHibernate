package springbootHibernate.demo.annotations.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springbootHibernate.demo.annotations.service.FortuneService;

@Component
public class BaseballCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService happyFortuneService;

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService randomFortuneService;

    public BaseballCoach() {

    }

    @Override
    public String getDailyWorkout() {
        return "Practice by throwing ball at full speed";
    }

    @Override
    public String getDailyFortune() {
        return this.happyFortuneService.getFortune() + ", but also " + this.randomFortuneService.getFortune();
    }

    /*
    @Autowired
    public void setDailyFortune(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */
}
