package springbootHibernate.demo.one.service;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "It is your lucky day";
    }
}
