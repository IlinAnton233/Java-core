package dz1;

public class Course {

    String result;
    private int MaxSpeedTrack;
    private int MaxBrakingTime;
    private int MaxReaction;

    public Course(int MaxSpeedTrack, int MaxBrakingTime, int MaxReaction) {
        this.MaxSpeedTrack = MaxSpeedTrack;
        this.MaxBrakingTime = MaxBrakingTime;
        this.MaxReaction = MaxReaction;
    }

    public String doIt(Team team) {
        result = "Team: " + team.getName() + " " + '\n';
        for (Racer racer : team.getRacers()) {
            result += "Name Racer: " + racer.getName() + " " + '\n';
            int speed = racer.getMaxSpeed();
            int brakingTime = racer.getBrakingTime();
            int reaction = racer.getReaction();
            testMaxSpeedTrack(speed);
            testMaxBrakingTime(brakingTime);
            testMaxReaction(reaction);
        }
        return result;
    }

    private void testMaxSpeedTrack(int value) {
        if (value < MaxSpeedTrack) result = result + "Трасса: Проходит квалификацию " + '\n';
        else result += "Трасса: Не проходит квалификацию " + '\n';
    }
    private void testMaxBrakingTime(int value) {
        if (value<MaxBrakingTime) result = result + "Трасса: Проходит квалификацию " + '\n';
        else result += "Трасса: Не проходит квалификацию " + '\n';
    }
    private void testMaxReaction(int value) {
        if (value<MaxReaction) result = result + "Трасса: Проходит квалификацию " + '\n';
        else result += "Трасса: Не проходит квалификацию " + '\n';
    }

}
