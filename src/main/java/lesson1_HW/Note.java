package lesson1_HW;

import java.time.LocalDate;

public class Note {

    private String message;
    private LocalDate date;

    public Note(String message) {
        this.message = message;
        this.date = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Note{" +
                "message='" + message + '\'' +
                ", date=" + date +
                '}';
    }
}
