package lesson2_HW;
//Написать функцию, возвращающую разницу между самым большим и
// самым маленьким элементами переданного не пустого массива.

import java.util.stream.IntStream;

public class Task2 {

    public static int difference(int[] array){


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i =0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
            if(min > array[i]){
                min = array[i];
            }
        }

        return max - min;

        //return IntStream.of(array).max().getAsInt() - IntStream.of(array).min().getAsInt();

    }

}
