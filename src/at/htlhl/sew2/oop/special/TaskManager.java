package at.htlhl.sew2.oop.special;

import java.util.ArrayList;

public class TaskManager {
    static void main() {
        String inputString = """
                2001;false;Milch kaufen;13.05.2026 18:00
                2002;false;Glühbirne wechseln;13.05.2026 15:00
                2003;false;Müll entsorgen;08.06.2026 11:00
                2004;false;Auto laden;20.05.2026 08:00
                """;

        String[] stringList = inputString.split("\n");

        ArrayList<Task> tasks = new ArrayList<>();
        for (String string : stringList) {
            tasks.add(Task.valueOf(string));
        }

        tasks.add(new Task("simple Task"));

        IO.println("== Unsorted == ");
        for (Task element : tasks) {
            IO.println(element);
        }

        tasks.sort(null);

        IO.println("== Sorted == ");
        for (Task element : tasks) {
            IO.println(element);
        }
    }
}
