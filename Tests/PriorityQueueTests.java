package Tests;

import Queues.PriorityQueue;
import Queues.PriorityQueueException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriorityQueueTests {
    PriorityQueue pq;

    @Before
    public void setup() {
        pq = new PriorityQueue(20);
    }

    @Test
    public void TestcaseInsertMin() {
        pq.insert(10);
        pq.insert(20);

        assertEquals(10, pq.min());
    }

    @Test
    public void TestcaseInsertSize() {
        pq.insert(20);
        pq.insert(40);

        assertEquals(2, pq.size());
    }

    @Test
    public void TestcaseRemoveMin() {
        pq.insert(10);
        pq.insert(5);
        pq.insert(50);
        pq.insert(30);

        assertEquals(5, pq.removeMin());
        assertEquals(10, pq.removeMin());
        assertEquals(30, pq.removeMin());
        assertEquals(50, pq.removeMin());
    }

    @Test(expected = PriorityQueueException.class)
    public void TestcaseRemoveMinEmpty() {
        pq.removeMin();
    }
}
