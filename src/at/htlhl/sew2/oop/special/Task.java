package at.htlhl.sew2.oop.special;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    int id;
    boolean completed;
    String title;
    LocalDateTime dueDate;
    private final static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    public Task(int id, boolean completed, String title, LocalDateTime dueDate) {
        this.id = id;
        this.completed = completed;
        this.title = title;
        this.dueDate = dueDate;
    }

    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Task)) return false;

        Task task = (Task) obj;
        return this.id == task.id && this.completed == task.completed && this.title.equals(task.title) && this.dueDate == task.dueDate;
    }

    @Override
    public String toString() {
        String hour = String.valueOf(this.dueDate.getHour()).length() == 1 ? this.dueDate.getHour() + "0" : String.valueOf(this.dueDate.getHour());
        String minute = String.valueOf(this.dueDate.getMinute()).length() == 1 ? this.dueDate.getMinute() + "0" : String.valueOf(this.dueDate.getMinute());
        String second = String.valueOf(this.dueDate.getSecond()).length() == 1 ? this.dueDate.getSecond() + "0" : String.valueOf(this.dueDate.getSecond());
        return this.id + ", " + this.title + ", " + this.completed + ", " + this.dueDate.getDayOfMonth() + ". " + this.dueDate.getMonthValue() + ". " + this.dueDate.getYear() + " " + hour + ":" + minute + ":" + second;
    }
}
