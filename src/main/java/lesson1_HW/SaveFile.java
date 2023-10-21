package lesson1_HW;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {

    public void fileWriter(Note note){
        File file = new File("Note.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(note.toString());
            bw.newLine();
            bw.flush();

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
