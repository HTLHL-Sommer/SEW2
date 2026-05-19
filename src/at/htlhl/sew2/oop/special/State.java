package at.htlhl.sew2.oop.special;

public enum State {
    INITIAL("Init"),
    COMPLETED("completed");

    private final String displayName;

    State(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }
}
