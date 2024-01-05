package Tests;

import org.junit.Before;
import org.junit.Test;
import Stacks.*;

import static org.junit.Assert.*;

public class StacksTest {
    Stacks st;

    @Before
    public void setup() {
        st = new Stacks(2);
    }

    @Test
    public void testcaseEmptySize() {
        assertEquals(0, st.size());
    }

    @Test
    public void testcasePushNonEmptySize() {
        st.push("A");
        st.push("B");

        assertEquals(2, st.size());
    }

    @Test
    public void testcaseTopTwo() {
        st.push("A");

        assertEquals("A", st.top());
        assertEquals("A", st.top());
    }

    @Test (expected = StackException.class)
    public void testcaseEmptyPop() {
        st.pop();
    }

    @Test (expected = StackException.class)
    public void testcaseFullPush() {
        st.push(1);
        st.push(2);
        st.push(3);
    }
}
