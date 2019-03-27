/**
 * Created by Alexander Lomat on 23.03.19.
 * Version 1.0
 * EPAM Main Task 02: Object-Oriented Programming with Java
 * Model part - SORTER: Sorting by song duration
 */


package by.epam.javaTraining.lomat.model.logic.sorter;

import by.epam.javaTraining.lomat.model.container.Disks;
import by.epam.javaTraining.lomat.model.data.Song;

public class DurationSorter {
    public static void lengthSort(Disks disks, boolean isAscending) {
        int n = disks.size();
        //one by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            //find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (disks.getElement(j).getDuration() < disks.getElement(min_idx).getDuration() && isAscending) {
                    min_idx = j;
                    continue;
                }
                else if (disks.getElement(j).getDuration() > disks.getElement(min_idx).getDuration() && !isAscending) {
                    min_idx = j;
                }
            }
            //swap the found minimum element with the first
            //element
            Song temp = disks.getElement(min_idx);
            disks.setElement(min_idx, disks.getElement(i));
            disks.setElement(i, temp);
        }
    }
}
