package by.epam.javaTraining.lomat.model.logic.searcher.range;

import by.epam.javaTraining.lomat.model.container.Disks;
import by.epam.javaTraining.lomat.model.data.RapSong;
import by.epam.javaTraining.lomat.model.data.RockSong;
import by.epam.javaTraining.lomat.model.data.Song;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class DurationRangeSearcherTest {

    private Disks disks;
    private int expected;


    public DurationRangeSearcherTest(Disks disks, Song[] elements, int expected) {
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
                {disks, new Song[]{rockSong, rapSong}, 1},
                {disks, null, -1},
                {disks, new Song[]{}, -1},
        });
    }

    @Test
    public void durationRangeSearcherTest() {
        assertEquals(expected, new DurationRangeSearcher().searchInRange(disks, 6, 40));
    }
}