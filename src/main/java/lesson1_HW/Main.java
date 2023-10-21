package lesson1_HW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сообщение: ");
        String message = sc.nextLine();
        Note note = new Note(message);
        SaveFile sf = new SaveFile();
        sf.fileWriter(note);

    }
}
