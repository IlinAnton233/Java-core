package dz1;

public class Racer {

        private String name;
        private int maxSpeed;
        private int brakingTime;
        private int reaction;

        public Racer(String name, int maxSpeed, int brakingTime, int reaction) {
            this.name = name;
            this.maxSpeed = maxSpeed;
            this.brakingTime = brakingTime;
            this.reaction = reaction;
        }

    public String getName() {
            return name;
        }
        public int getMaxSpeed() {
            return maxSpeed;
        }
        public int getBrakingTime() {
            return brakingTime;
        }
        public int getReaction() {
            return reaction;
        }
    }
