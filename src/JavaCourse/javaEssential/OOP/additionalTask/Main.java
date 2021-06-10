package JavaCourse.javaEssential.OOP.additionalTask;

public class Main {
    public static void main(String[] args) {
        Address firstAdress = new Address();
        firstAdress.setCity("Donetsk");
        firstAdress.setApartment("512B");
        firstAdress.setCountry("Bad country");
        firstAdress.setHouse("12");
        firstAdress.setIndex(1);
        firstAdress.setStreet("Hurova Ave");

        System.out.println("City: " + firstAdress.getCity() +
                            "\nApartment: " + firstAdress.getApartment() +
                            "\nCountry: " + firstAdress.getCountry() +
                            "\nHouse: " + firstAdress.getHouse() +
                            "\nIndex: " + firstAdress.getIndex() +
                            "\nStreet: " + firstAdress.getStreet());

    }
}
