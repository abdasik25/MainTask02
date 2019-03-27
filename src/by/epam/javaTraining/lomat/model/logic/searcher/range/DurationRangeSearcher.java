package by.epam.javaTraining.lomat.model.logic.searcher.range;

import by.epam.javaTraining.lomat.model.container.Disks;

public class DurationRangeSearcher implements RangeSearcher {
    @Override
    public int searchInRange(Disks disks, int durationInMinutes, int deltaInSeconds) {
        for (int i = 0; i < disks.size(); i++) {
            if (disks.getElement(i).getDuration() >= durationInMinutes * 60 - deltaInSeconds ||
                    (disks.getElement(i).getDuration() <= durationInMinutes * 60 + deltaInSeconds
                            && disks.getElement(i).getDuration() > durationInMinutes * 60)) {
                return i;
            }
        }
        return -1;
    }
}
