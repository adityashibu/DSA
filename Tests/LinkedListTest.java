package Tests;

import static org.junit.Assert.*;
import LinkedLists.LinkedList;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

    LinkedList l;

    @Before
    public void setup() {
        l = new LinkedList();
    }

    @Test
    public void testcaseSizeEmpty() {
        assertEquals(0, l.size());
    }

    @Test
    public void testcaseSizeMany() {
        l.addAtHead(10);
        l.addAtHead(20);
        assertEquals(2, l.size());
    }

    @Test
    public void testcaseSizeTwice() {
        l.addAtHead(10);
        assertEquals(1, l.size());

        l.addAtHead(20);
        assertEquals(2, l.size());
    }

    @Test
    public void testcaseTotalEmpty() {
        assertEquals(0, l.total());
    }

    @Test
    public void testcaseTotalMany() {
        l.addAtHead(10);
        l.addAtHead(20);
        l.addAtHead(30);

        assertEquals(60, l.total());
    }

    public void testcaseTotalTwice() {
        l.addAtHead(50);
        assertEquals(50, l.total());

        l.addAtHead(60);
        assertEquals(110, l.total());
    }
}
