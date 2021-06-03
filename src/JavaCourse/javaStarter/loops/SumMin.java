package JavaCourse.javaStarter.loops;

public class SumMin {
    public static void main(String[] args) {
        //Part 1
        {
            int a = 20;
            int b = 40;

            for (int i = a; i < b; i++) {
                a += i;
            }
            System.out.println("Сумма всех чисел, расположенных между промежутками a и b равна: " + a);
        }

        //Part 2
        {
            int a = 20;
            int b = 40;
            for (int i = a; i < b; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }

    }
}
