package springbootHibernate.demo.one.bean;

import springbootHibernate.demo.one.service.FortuneService;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String emailAddress;
    private String team;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }
    //setter method for injection
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }
    //setter method for literal injection
    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }
    //setter method for literal injection
    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
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
