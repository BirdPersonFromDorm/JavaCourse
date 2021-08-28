package JavaCourse.javaProfessional.IteratorAndComparator.additionalTask;


public class Animal implements Comparable<Animal> {
    private String breed;
    private int weight;
    private int speed;
    private int price;

    Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }

    @Override
    public int compareTo(Animal animal) {
        int tmp = this.speed - animal.speed;
        if (tmp == 0) {
            tmp = this.price - animal.price;
        }
        if (tmp == 0){
            tmp =  this.weight - animal.weight;
        }
        if (tmp == 0){
            tmp =  this.breed.compareTo(animal.breed);
        }
            return tmp;

    }

}