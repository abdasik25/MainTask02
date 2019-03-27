package by.epam.javaTraining.lomat.model.logic.sorter;

import by.epam.javaTraining.lomat.model.container.Disks;
import by.epam.javaTraining.lomat.model.data.RapSong;
import by.epam.javaTraining.lomat.model.data.RockSong;
import by.epam.javaTraining.lomat.model.data.Song;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;


@RunWith(Parameterized.class)
public class CostSorterDescendingTest {

    private Disks disks;
    private Song[] expected;


    public CostSorterDescendingTest(Disks disks, Song[] elements, Song[] expected) {
        this.disks = disks;
        this.expected = expected;
        disks.setElements(elements);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        RockSong rockSong = new RockSong("1", 300, 10, "2", 1991, true, 20);
        RapSong rapSong = new RapSong("2", 320, 30, "2", 1995, "2", "3");
        Disks disks = new Disks();
        return Arrays.asList(new Object[][]{
                {disks, new Song[]{rockSong, rapSong}, new Song[]{rapSong, rockSong}},
                {disks, new Song[]{}, new Song[]{}},
        });
    }

    @Test
    public void costSorterDescendingTest() {
        CostSorter.costSort(disks, 0, disks.size() - 1, false);
        assertArrayEquals(expected, disks.getElements());
    }
}