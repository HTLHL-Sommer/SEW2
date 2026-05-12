package at.htlhl.sew2.oop.enums;

public enum Note {
    SEHR_GUT(90, 100),
    GUT(76,89),
    BEFRIEDIGEND(63, 75),
    GENUEGEND(51, 62),
    NICHT_GENUEGEND(0, 50);

    private final int lower;
    private final int upper;

    private Note(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }

    @Override
    public String toString() {
        String result = "";
        switch (this) {
            case SEHR_GUT:
                result = "Sehr Gut";
                break;
            case GUT:
                result = "Gut";
                break;
            case BEFRIEDIGEND:
                result = "Befriedigend";
                break;
            case GENUEGEND:
                result = "Genügend";
                break;
            case NICHT_GENUEGEND:
                result = "Nicht Genügend";
                break;
        }
        if (!result.equals("")) result += " (" + lower + "/" + upper + ")";
        return result;
    }

    public static Note findByPoints(int points) {
        if (points >= 0 && points <= 100) {
            for (Note note : Note.values()) {
                if (note.lower <= points && points <= note.upper) {
                    return note;
                }
            }
        }
        return null;
    }
}
