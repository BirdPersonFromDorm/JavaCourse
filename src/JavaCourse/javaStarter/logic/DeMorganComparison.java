package JavaCourse.javaStarter.logic;

public class DeMorganComparison {
    public static void main(String[] args) {
        boolean test1 = false;
        boolean test2 = false;

        boolean result1 = test1|test2;
        boolean result2 = !(!test1 & !test2);

        System.out.println(result1);
        System.out.println(result2);

    }

}
