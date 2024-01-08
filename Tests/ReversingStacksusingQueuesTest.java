package Tests;

import Implementations.ReversingStacksusingQueues;
import Stacks.Stacks;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversingStacksusingQueuesTest {

    @Test
    public void reverseStackStringsTest() {
        Stacks st = new Stacks(5);
        st.push("A");
        st.push("B");
        st.push("C");

        ReversingStacksusingQueues.reverseStack(st);
        assertEquals("A", st.pop());
        assertEquals("B", st.pop());
        assertEquals("C", st.pop());
    }

    @Test
    public void reverseStackIntegersTest() {
        Stacks st = new Stacks(5);
        st.push(1);
        st.push(2);
        st.push(3);

        ReversingStacksusingQueues.reverseStack(st);
        assertEquals(1, st.pop());
        assertEquals(2, st.pop());
        assertEquals(3, st.pop());
    }

}
