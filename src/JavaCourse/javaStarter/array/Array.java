package JavaCourse.javaStarter.array;

public class Array {
    public static void main(String[] args) {
        int[] list = {5, 6, 7, -7, -9, 2, 0, 11, -35, 5};

        for(int i = list.length-1; i>=0; i--){
            System.out.print(list[i] + " ");
        }
    }
}
