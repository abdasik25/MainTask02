/**
 * Created by Alexander Lomat on 23.03.19.
 * Version 1.0
 * EPAM Main Task 02: Object-Oriented Programming with Java
 * Model part - COUNTER: Counts total disk duration
 */

package by.epam.javaTraining.lomat.model.logic.counter;

import by.epam.javaTraining.lomat.model.container.Disks;

public class DiskTotalDuration {

    public static int countTotalDurationMinutes(Disks disk) {
        int totalDuration = 0;
        if (disk.size() == 0 || disk == null) {
            return totalDuration;
        }

        for (int i = 0; i < disk.size(); i++) {
            totalDuration += disk.getElement(i).getDuration();
        }
        return totalDuration / 60;
    }
}

