package lesson2_HW;
//Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
public class Task3 {

    public static boolean nullElements(int[] array) {


        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i + 1] == 0) {
                return true;
            }
        }

        return false;
    }

}
