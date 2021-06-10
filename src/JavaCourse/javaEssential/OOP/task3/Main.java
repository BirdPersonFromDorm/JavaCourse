package JavaCourse.javaEssential.OOP.task3;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        computers[0] = new Computer("Dell");
        computers[1] = new Computer("Lenovo");
        computers[2] = new Computer("Asua");
        computers[3] = new Computer("Mac");
        computers[4] = new Computer("And some other");

        for (Computer someComputer : computers) {
            System.out.println("Name: " + someComputer.name);
        }

    }
}
