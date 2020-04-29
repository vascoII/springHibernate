package springbootHibernate.demo.one.service;

public class HappyFortuneService implements FortuneService {

    private String[] array = {
            "It is your lucky day",
            "It is not your lucky day",
            "It is your normal average day"
    };

    @Override
    public String getFortune() {

        return array[(int)(System.currentTimeMillis() % array.length)];
    }
}
