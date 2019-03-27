/**
 * Created by Alexander Lomat on 23.03.19.
 * Version 1.0
 * EPAM Main Task 02: Object-Oriented Programming with Java
 * Model part - DATA: Symphonic Song Class
 */

package by.epam.javaTraining.lomat.model.data;

public class SymphonicSong extends Song {

    private String compositorName;
    private int orchestraAmount;

    public SymphonicSong(String compositorName, int orchestraAmount) {
        this.compositorName = compositorName;
        this.orchestraAmount = orchestraAmount;
    }

    public SymphonicSong(String name, int durationInSeconds, double cost, String country, int establishmentYear, String compositorName, int orchestraAmount) {
        super(name, durationInSeconds, cost, country, establishmentYear);
        this.compositorName = compositorName;
        this.orchestraAmount = orchestraAmount;
    }

    public String getCompositorName() {
        return compositorName;
    }

    public void setCompositorName(String compositorName) {
        this.compositorName = compositorName;
    }

    public int getOrchestraAmount() {
        return orchestraAmount;
    }

    public void setOrchestraAmount(int orchestraAmount) {
        this.orchestraAmount = orchestraAmount;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\nSymphonic Song: \n").append
                ("Artist name:  ").append(name).append("\nCompositor name: ").append(compositorName).append
                ("\nDuration: ").append(durationInSeconds / 60).append(":").append(durationInSeconds % 60).append
                ("\nOrchestra amount:").append(orchestraAmount).append
                ("\nCost: ").append(cost).append("$").append("\nCountry: ").append
                (country).append("\nYear: ").append(establishmentYear);
        return stringBuilder.toString();
    }

}
