package at.htlhl.sew2.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Score {
    private final int DEFAULT_SCORE = 0;
    private String filename;
    private int currentScore;

    public Score(String filename) {
        this.filename = filename;
        this.currentScore = DEFAULT_SCORE;
    }

    public int getCurrentScore() {
        return this.currentScore;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setCurrentScore(int score) throws IllegalArgumentException {
        if (score >= 1) {
            this.currentScore = score;
        } else {
            throw new IllegalArgumentException("Score needs to be >= 1");
        }
    }


    public void readScore() throws IOException {
        List<String> fileContent = Files.readAllLines(Paths.get(this.filename));
        try {
            setCurrentScore(Integer.parseInt(fileContent.getFirst()));
        } catch (NumberFormatException nfex) {
            IO.println(String.format("Dateiinhalt von %s konnte nicht in Zahl umgewandelt werden!", fileContent.getFirst()));
            currentScore = DEFAULT_SCORE;
        }
    }
}
