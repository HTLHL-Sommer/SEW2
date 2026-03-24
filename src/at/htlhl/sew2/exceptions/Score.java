package at.htlhl.sew2.exceptions;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;

public class Score {
    private String filename;
    private int currentScore;

    public Score(String filename) {
        this.filename = filename;
        this.currentScore = 0;
    }

    public int getCurrentScore() {
        return this.currentScore;
    }

    public void setCurrentScore(int score) throws IllegalArgumentException {
        if (score >= 1) {
            this.currentScore = score;
        } else {
            throw new IllegalArgumentException("Score needs to be >= 1");
        }
    }

    public void readScore() throws IOException {
        Files.readAllLines(Path.of(this.filename));
    }
}
