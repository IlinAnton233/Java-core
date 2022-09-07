package dz1;

public class RunDz1 {
    public static void main(String[] args) {
        Racer[] racer = new Racer[4];
        racer[0] = new Racer ("Garry", 220, 3, 2);
        racer[1] = new Racer ("Ron", 270, 2,5);
        racer[2] = new Racer ("Germiona", 245, 4, 9);
        racer[3] = new Racer ("Hagrid", 190, 7, 10);
        Team team = new Team("McLaren", racer);
        Course course = new Course(240, 5,9);
        String result = course.doIt(team);
        System.out.println(result);
    }
}
