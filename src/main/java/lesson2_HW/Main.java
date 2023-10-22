package lesson2_HW;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[random.nextInt(5) + 5];

            for (int i = 0; i < array.length; i++){
                array[i] = random.nextInt(9) + 1;
                System.out.print(array[i] + " ");
            }
        System.out.println();
        System.out.println(Task1.evenElement(array));

        System.out.println(Task2.difference(array));

        int[] array1 = {1, 3, 6, 6, 9, 4, 0, 0};
        System.out.println(Task3.nullElements(array1));

    }







}
