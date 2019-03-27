package by.epam.javaTraining.lomat.model.logic.searcher.range;

import by.epam.javaTraining.lomat.model.container.Disks;

public interface RangeSearcher {
    int searchInRange(Disks disks, int approximateValue, int delta);
}
