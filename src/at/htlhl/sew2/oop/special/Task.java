package at.htlhl.sew2.oop.special;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Task implements Comparable<Task> {
    private int id;
    // boolean completed;
    private State state;
    private String title;
    private LocalDateTime dueDate;
    private final static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
    private final static int INITIAL_ID = 1000;
    private static int currentId = INITIAL_ID;

    public Task(State state, String title, LocalDateTime dueDate) {
        this.id = ++currentId;
        this.state = state;
        this.title = title;
        this.dueDate = dueDate;
    }

    public Task(String title) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime endofDate = LocalDateTime.of(now.toLocalDate(), LocalTime.of(23, 59, 59));
        this(State.INITIAL, title, endofDate);
    }

    public static Task valueOf(String input) {
        String[] parts = input.split(";");
        return new Task(Boolean.parseBoolean(parts[1]) ? State.COMPLETED : State.INITIAL, parts[2], LocalDateTime.parse(parts[3], FORMATTER));
    }

    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Task)) return false;

        Task task = (Task) obj;
        return this.id == task.id && this.state == task.state && this.title.equals(task.title) && this.dueDate == task.dueDate;
    }

    @Override
    public String toString() {
        return this.id + ", " + this.title + ", " + this.state.getDisplayName() + ", " + FORMATTER.format(this.dueDate);
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

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
