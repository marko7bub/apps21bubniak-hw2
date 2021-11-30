package ua.edu.ucu.collections;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testPeek() {
        Object[] object = new Object[]{"ukrainian", "catholic", "university"};
        Stack s = new Stack(object);
        Object expResult = "ukrainian";
        Object actualResult = s.peek();
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testPush() {
        Object[] object = new Object[]{"ukrainian", "catholic", "university"};
        Stack s = new Stack(object);
        s.push("the incredible");
        Object[] expResult = {"the incredible", "ukrainian", "catholic", "university"};
        Object[] actualResult = s.toArray();
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testPop() {
        Object[] object = new Object[]{"the incredible", "ukrainian", "catholic", "university"};
        Stack s = new Stack(object);
        Object expResult = "the incredible";
        Object actualResult = s.pop();
        assertEquals(expResult, actualResult);
    }
}
