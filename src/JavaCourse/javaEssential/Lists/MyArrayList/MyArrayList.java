package JavaCourse.javaEssential.Lists.MyArrayList;

import java.util.Arrays;

public class MyArrayList {
    private int[] array = new int[3];
    private int size;

    public void add(int element) {
        if (size == array.length) {
            int[] newArray = new int[size * 2];

            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        array[size] = element;
        size++;
    }

    public void add(int index, int element) {
        System.arraycopy(array, index, array,index + 1, size - index );
        for (int i = 0; i < size; i++) {
            if (i == index &&  i < array.length) {
                array[i] = element;
            }
        }

    }

    public void remove(int index) {

        for (int i = 0; i < size; i++) {
            if (i >= index && i < array.length) {
                array[i] = array[i + 1];
            }
        }
        size--;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = 0;
        }
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
