package JavaCourse.javaEssential.Object.task;

public class Main {
    public static void main(String[] args) {
        Device someDevice = new Device("Apple", 1200, "AB1234567CD ");
        Device someMonitor = new Monitor(1280, 1024, "Samsung", 1200, "AB1234567CD");
        Device someMonitor2 = new Monitor(1280, 1024, "Samsung", 1200, "AB1234567CD");
        Device someEthernetAdapter = new EthernetAdapter(12, "Something", "Apple", 200, "BB1234567CD");
        Device someEthernetAdapter2 = new EthernetAdapter(12, "Something", "Apple", 200, "BB1234567CD");

        System.out.println(someDevice.toString());
        System.out.println(someMonitor.toString());

        //Сравнение по manufacturer
        System.out.println(someDevice.equals(someMonitor));
        //Сравнение по resolutionX
        System.out.println(someMonitor.equals(someMonitor2));
        //Сравнение по speed
        System.out.println(someEthernetAdapter.equals(someEthernetAdapter2));

        System.out.println("----------------------");

        System.out.println(someDevice.getManufacturer().hashCode());
        System.out.println(someMonitor.getManufacturer().hashCode());
        System.out.println(someMonitor2.getManufacturer().hashCode());
        System.out.println(someEthernetAdapter.getManufacturer().hashCode());
        System.out.println(someEthernetAdapter2.getManufacturer().hashCode());

    }
}
