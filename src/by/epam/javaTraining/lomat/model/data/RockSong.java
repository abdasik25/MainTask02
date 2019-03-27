/**
 * Created by Alexander Lomat on 23.03.19.
 * Version 1.0
 * EPAM Main Task 02: Object-Oriented Programming with Java
 * Model part - DATA: Rock Song Class
 */


package by.epam.javaTraining.lomat.model.data;

public class RockSong extends Song {

    private boolean hasSolo;
    private int soloDurationInSeconds;


    public RockSong(boolean hasSolo, int soloDurationInSeconds) {
        this.hasSolo = hasSolo;
        if (hasSolo) {
            this.soloDurationInSeconds = soloDurationInSeconds;
        } else {
            this.soloDurationInSeconds = 0;
        }
    }

    public RockSong(String name, int durationInSeconds, double cost, String country, int establishmentYear, boolean hasSolo, int soloDurationInSeconds) {
        super(name, durationInSeconds, cost, country, establishmentYear);
        this.hasSolo = hasSolo;
        if (hasSolo) {
            this.soloDurationInSeconds = soloDurationInSeconds;
        } else {
            this.soloDurationInSeconds = 0;
        }
    }

    public boolean isHasSolo() {
        return hasSolo;
    }

    public void setHasSolo(boolean hasSolo) {
        this.hasSolo = hasSolo;
    }

    public int getSoloDuration() {
        return soloDurationInSeconds;
    }

    public void setSoloDuration(int soloDuration) {
        this.soloDurationInSeconds = soloDuration;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\nRock Song: \n").append("Artist name:  ").append(name).append("\nHas solo?:").append
                (hasSolo ? " Yes" : " No").append
                (hasSolo ? ("\nSolo duration: " + soloDurationInSeconds / 60 + ":" + durationInSeconds % 60) : "").
                append("\nDuration: ").append(durationInSeconds / 60).append(":").append(durationInSeconds % 60).append
                ("\nCost: ").append(cost).append("$").append("\nCountry: ").append
                (country).append("\nYear: ").append(establishmentYear);
        return stringBuilder.toString();
    }

}
