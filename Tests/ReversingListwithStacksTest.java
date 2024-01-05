package Tests;

import org.junit.Test;
import Implementations.ReversingListswithStacks;

import static org.junit.Assert.assertEquals;

public class ReversingListwithStacksTest {
    @Test
    public void testReverse() {
        String[] empty = {};
        String[] one = {"A"};
        String[] three = {"A", "B", "C"};

        String[] revEmpty = {};
        String[] revOne = {"A"};
        String[] revThree = {"C", "B", "A"};

        ReversingListswithStacks.reverse(empty);
        ReversingListswithStacks.reverse(one);
        ReversingListswithStacks.reverse(three);

        assertEquals(revEmpty, empty);
        assertEquals(revOne, one);
        assertEquals(revThree, three);
    }
}
