package lesson2_HW;

import java.util.stream.IntStream;

//Написать метод, возвращающий количество чётных элементов массива.
// countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
public class Task1 {

    public static int evenElement(int[] array){

        int num = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                num ++;
            }
        }
        //return (int) IntStream.of(array).filter(value -> value % 2 == 0).count();
        return num;

    }
}
