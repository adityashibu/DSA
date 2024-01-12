package Tests;

import Queues.PriorityQueue;
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

    }
}
