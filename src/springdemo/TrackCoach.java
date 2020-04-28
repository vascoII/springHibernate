package springdemo;

public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout() {

        return "Spend 30min running at slow pace then 45min at high pace";
    }
}
