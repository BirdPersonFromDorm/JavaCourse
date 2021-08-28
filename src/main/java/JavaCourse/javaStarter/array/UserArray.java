package JavaCourse.javaStarter.array;

public class UserArray {
    public static int[] addElement(int[] array, int value) {
        int[] temp = new int[array.length + 1];
        for (int i = 0; i < temp.length; i++) {
            if (i == 0) {
                temp[i] = value;
                continue;
            }
            temp[i] = array[i - 1];

        }

        return temp;
    }


    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] newArray = addElement(array, 35);
        for (int arrayForConsole : newArray) {
            System.out.println(arrayForConsole + " ");
        }
    }
}
