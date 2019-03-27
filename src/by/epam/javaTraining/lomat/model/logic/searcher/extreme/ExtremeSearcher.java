package by.epam.javaTraining.lomat.model.logic.searcher.extreme;

import by.epam.javaTraining.lomat.model.container.Disks;

public interface ExtremeSearcher {
    int search(Disks disks, int value, int leftBorder, int rightBorder);
}
