/**
 * Created by Alexander Lomat on 23.03.19.
 * Version 1.0
 * EPAM Main Task 02: Object-Oriented Programming with Java
 * Model part - DATA:  Rap Song Class
 */


package by.epam.javaTraining.lomat.model.data;

public class RapSong extends Song {

    private String beatmaker;
    private String sampleSong;

    public RapSong(String beatmaker, String sampleSong) {
        this.beatmaker = beatmaker;
        this.sampleSong = sampleSong;
    }

    public RapSong(String name, int durationInSeconds, double cost, String country, int establishmentYear, String beatmaker, String sampleSong) {
        super(name, durationInSeconds, cost, country, establishmentYear);
        this.beatmaker = beatmaker;
        this.sampleSong = sampleSong;
    }

    public String getBeatmaker() {
        return beatmaker;
    }

    public void setBeatmaker(String beatmaker) {
        this.beatmaker = beatmaker;
    }

    public String getSampleSong() {
        return sampleSong;
    }

    public void setSampleSong(String sampleSong) {
        this.sampleSong = sampleSong;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\nRap Song: \n").append("Artist name:  ").append(name).append("\nBeatmaker: ").append
                (beatmaker).append("\nSample song: ").append(sampleSong).append("\nDuration: ").append
                (durationInSeconds / 60).append(":").append(durationInSeconds % 60).append("\nCost: ").append
                (cost).append("$").append("\nCountry: ").append(country).append("\nYear: ").append(establishmentYear);
        return stringBuilder.toString();
    }
}
