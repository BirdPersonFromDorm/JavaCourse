package JavaCourse.javaEssential.Lists.MyArrayList;

import java.util.Arrays;

public class MyArrayList {
    private int[] array = new int[3];
    private int size;

    public void add(int element) {
        if (size == array.length) {
            int[] newArray = new int[(size * 3)/2];

            System.arraycopy(array, 0, newArray,0, size);

            array = newArray;
        }

        array[size] = element;
        size++;
    }

    public void add(int index, int element) {
        if (size == array.length) {
            int[] newArray = new int[(size * 3)/2];

            System.arraycopy(array, 0, newArray, 0, size);

            array = newArray;
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        for (int i = 0; i < size; i++) {
            if (i == index && i < size()) {
                array[i] = element;
            }

        }
    }

    public void remove(int index) {
        System.arraycopy(array, index + 1, array, index, size);
        size --;
    }

    public void clear() {
        array = new int[3];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean contains(int o) {
        for (int i = 0; i < size; i++) {
            if (array[i] == o){
                return true;
            }
        }
        return false;
    }

    public int get(int index) {

        if (index >= 0 && index < array.length) {
            return array[index];
        }
        throw new IndexOutOfBoundsException("Error");
    }


    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
