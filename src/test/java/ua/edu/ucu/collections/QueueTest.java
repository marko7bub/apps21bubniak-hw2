package ua.edu.ucu.collections;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void testPeek() {
        Object[] object = new Object[]{"ukrainian", "catholic", "university"};
        Queue q = new Queue(object);
        Object expResult = "university";
        Object actualResult = q.peek();
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testEnqueue() {
        Object[] object = new Object[]{"ukrainian", "catholic", "university"};
        Queue q = new Queue(object);
        q.enqueue("the incredible");
        Object[] expResult = {"the incredible", "ukrainian", "catholic", "university"};
        Object[] actualResult = q.toArray();
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testDequeue() {
        Object[] object = new Object[]{"the incredible", "ukrainian", "catholic", "university"};
        Queue q = new Queue(object);
        Object expResult = "university";
        Object actualResult = q.dequeue();
        assertEquals(expResult, actualResult);
    }
}
