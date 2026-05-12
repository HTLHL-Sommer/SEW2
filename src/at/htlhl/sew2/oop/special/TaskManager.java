package at.htlhl.sew2.oop.special;

import java.time.LocalDateTime;

public class TaskManager {
    static void main() {
        String input1 = "1001;false;Milch kaufen;12.05.2026 18:00";
        String input2 = "1002;false;Glühbirne wechseln;13.05.2026 15:00";

        LocalDateTime localDate1 = LocalDateTime.parse("2026-05-12T18:00:00");
        Task task1 = new Task(1, false, "Milch kaufen", localDate1);
        IO.println(task1.toString());

        LocalDateTime localDate2 = LocalDateTime.parse("2026-05-13T15:00:00");
        Task task2 = new Task(2, false, "Glühbirne wechseln", localDate2);
        IO.println(task2.toString());
    }
}
