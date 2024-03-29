package Tests;

import Queues.Queue;
import Queues.QueueException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueuesTest {
    Queue q;

    @Before
    public void setup() {
        q = new Queue();
    }

    @Test
    public void testcaseEmpty() {
        assertEquals(true, q.isEmpty());
    }

    @Test
    public void testcaseEmptyFalse() {
        q.enqueue(10);
        q.enqueue(20);

        assertEquals(false, q.isEmpty());
    }

    @Test
    public void testcaseSizeEmpty() {
        assertEquals(0, q.size());
    }

    @Test
    public void testcaseSizeNonEmpty() {
        q.enqueue(10);
        q.enqueue(20);

        assertEquals(2, q.size());
    }

    @Test
    public void testcaseEnqueue() {
        q.enqueue(10);
        q.enqueue(20);

        assertEquals(10, q.front());
    }

    @Test
    public void testcaseDequeue() {
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        assertEquals(10, q.dequeue());
    }

    @Test(expected = QueueException.class)
    public void testcaseEmptyDequeue() {
        q.dequeue();
    }

    @Test(expected = QueueException.class)
    public void testcaseEmptyFront() {
        q.front();
    }
}
