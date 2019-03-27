package by.epam.javaTraining.lomat.model.logic.sorter;

import by.epam.javaTraining.lomat.model.container.Disks;

public class isSortedAscending {
    //checks if array is sorted acceding
    public static boolean isSortedAccedingByCost(Disks disks) {
        if (disks.size() == 0 || disks == null){
            return false;
        }
        boolean isSortedAcceding = true;
        for (int i = 0; i < disks.size() - 1; i++) {
            if (disks.getElement(i).getCost() > disks.getElement(i + 1).getCost()) {
                return !isSortedAcceding;
            }
        }
        return isSortedAcceding;
    }

    public static boolean isSortedAccendingByDuration(Disks disks) {
        if (disks.size() == 0 || disks == null){
            return false;
        }
        boolean isSortedAcceding = true;
        for (int i = 0; i < disks.size() - 1; i++) {
            if (disks.getElement(i).getDuration() > disks.getElement(i + 1).getDuration()) {
                return !isSortedAcceding;
            }
        }
        return isSortedAcceding;
    }
}
