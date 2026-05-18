package at.htlhl.sew2.oop.special;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task implements Comparable<Task> {
    int id;
    // boolean completed;
    State state;
    String title;
    LocalDateTime dueDate;
    private final static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    public Task(int id, State state, String title, LocalDateTime dueDate) {
        this.id = id;
        this.state = state;
        this.title = title;
        this.dueDate = dueDate;
    }

    public static Task valueOf(String input) {
        String[] parts = input.split(";");
        return new Task(Integer.parseInt(parts[0]), Boolean.parseBoolean(parts[1]) ? State.COMPLETED : State.INITIAL, parts[2], LocalDateTime.parse(parts[3], FORMATTER));
    }

    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Task)) return false;

        Task task = (Task) obj;
        return this.id == task.id && this.state == task.state && this.title.equals(task.title) && this.dueDate == task.dueDate;
    }

    @Override
    public String toString() {
        return this.id + ", " + this.title + ", " + this.state + ", " + FORMATTER.format(this.dueDate);
    }

    public int compareTo(Task other) {
        int diff = Integer.compare(this.state.ordinal(), other.state.ordinal());
        if (diff == 0) {
            diff = this.dueDate.compareTo(other.dueDate);
            if (diff == 0) {
                diff = this.title.compareTo(other.title);
            }
        }
        return diff;
    }
}
