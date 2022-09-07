package dz1;

public class Team {

    private String name;
    private Racer[] racers;

    public Team(String name, Racer[] racers) {
        this.name = name;
        this.racers = racers;
    }

    public String getName() {
        return name;
    }

    public Racer[] getRacers() {
        return racers;
    }
}