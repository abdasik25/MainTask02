/**
 * Created by Alexander Lomat on 23.03.19.
 * Version 1.0
 * EPAM Main Task 02: Object-Oriented Programming with Java
 * Model part - DATA: Abstract Class SONG
 */


package by.epam.javaTraining.lomat.model.data;

public abstract class Song {

    protected String name;
    protected int durationInSeconds;
    protected double cost;
    protected String country;
    protected int establishmentYear;

    public Song(){}

    public Song(String name, int durationInSeconds, double cost, String country, int establishmentYear) {
        this.name = name;
        this.durationInSeconds = durationInSeconds;
        this.cost = cost;
        this.country = country;
        this.establishmentYear = establishmentYear;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getArtist() {
        return name;
    }

    public void setArtist(String artist) {
        this.name = artist;
    }

    public int getDuration() {
        return durationInSeconds;
    }

    public void setDuration(int duration) {
        this.durationInSeconds = duration;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getEstablishmentYear() {
        return establishmentYear;
    }

    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }
}


