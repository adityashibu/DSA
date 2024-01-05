package Tests;

import LinkedLists.DoublyLinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoublyLinkedListTest {

    DoublyLinkedList dll;

    @Before
    public void setup() {
        dll = new DoublyLinkedList();
    }

    @Test
    public void testcaseAddAtHead() {
        dll.addAtHead("A");
        assertEquals("A", (String) dll.getHeadValue());
        assertEquals("A", (String) dll.getTailValue());

        dll.addAtHead("B");
        assertEquals("B", (String) dll.getHeadValue());
        assertEquals("A", (String) dll.getTailValue());
    }

    @Test
    public void testcaseAddAtTail() {
        dll.addAtTail("A");
        assertEquals("A", (String) dll.getHeadValue());
        assertEquals("A", (String) dll.getTailValue());

        dll.addAtTail("B");
        assertEquals("A", (String) dll.getHeadValue());
        assertEquals("B", (String) dll.getTailValue());
    }

}
