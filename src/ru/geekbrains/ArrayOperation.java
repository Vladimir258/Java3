package ru.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOperation {
    // Метод, который меняет два элемента массива местами
    public static <T> void swapElementArray(T[]arr, int n1, int n2){
        System.out.println("Source Array:        " + Arrays.toString(arr));
        T sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("Permutation result:  " + Arrays.toString(arr));
    }
    // Метод, который преобразует массив в ArrayList
    public static <T> void arrayToList(T[]arr){
        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Array to ArrayList: " + alt);
    }
}
