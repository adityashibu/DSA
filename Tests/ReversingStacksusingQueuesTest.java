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

}
