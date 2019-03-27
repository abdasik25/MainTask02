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
public class NameSorterAscendingTest {

    private Disks disks;
    private Song[] expected;


    public NameSorterAscendingTest(Disks disks, Song[] elements, Song[] expected) {
        this.disks = disks;
        this.expected = expected;
        disks.setElements(elements);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        RockSong rockSong = new RockSong("Metallica", 300, 10, "2", 1991, true, 20);
        RapSong rapSong = new RapSong("Meballica", 320, 30, "2", 1995, "2", "3");
        RapSong rapSong1 = new RapSong("Mebcllica", 320, 30, "2", 1995, "2", "3");
        Disks disks = new Disks();
        return Arrays.asList(new Object[][]{
                {disks, new Song[]{rapSong, rockSong, rapSong1}, new Song[]{rockSong, rapSong1, rapSong}},
                {disks, new Song[]{}, new Song[]{}},
        });
    }

    @Test
    public void nameSorterAscendingTest() {
        NameSorter.nameSort(disks, true);
        assertArrayEquals(expected, disks.getElements());
    }
}