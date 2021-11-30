package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImmutableLinkedListTest {

    @Test
    public void testToArray() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableLinkedList imLinList = new ImmutableLinkedList(object);
        Object[] expResult = {"arman", "loves", "you"};
        Object[] actualResult = imLinList.toArray();
        assertArrayEquals(expResult, actualResult);
    }

    @Test
    public void testAddAll() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableLinkedList imLinList = new ImmutableLinkedList(object);
        Object[] expResult = {"arman", "loves", "so", "many", "people", "but", "you"};
        ImmutableLinkedList actualResult = imLinList.addAll(2, new Object[]{"so", "many", "people", "but"});
        assertArrayEquals(expResult, actualResult.toArray());
    }

    @Test
    public void testAdd() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableLinkedList imLinList = new ImmutableLinkedList(object);
        Object[] expResult = {"arman", "loves", "you", "too"};
        ImmutableLinkedList actualResult = imLinList.add("too");
        assertArrayEquals(expResult, actualResult.toArray());
    }

    @Test
    public void testAddIndex() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableLinkedList imLinList = new ImmutableLinkedList(object);
        Object[] expResult = {"arman", "knows and", "loves", "you"};
        ImmutableLinkedList actualResult = imLinList.add(1, "knows and");
        assertArrayEquals(expResult, actualResult.toArray());
    }

    @Test
    public void testGet() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableLinkedList imLinList = new ImmutableLinkedList(object);
        Object expResult = "loves";
        Object actualResult = imLinList.get(1);
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testRemove() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableLinkedList imLinList = new ImmutableLinkedList(object);
        Object[] expResult = {"arman", "you"};
        ImmutableLinkedList actualResult = imLinList.remove(1);
        assertArrayEquals(expResult, actualResult.toArray());
    }

    @Test
    public void testSet() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableLinkedList imLinList = new ImmutableLinkedList(object);
        Object[] expResult = {"arman", "hates", "you"};
        ImmutableLinkedList actualResult = imLinList.set(1, "hates");
        assertArrayEquals(expResult, actualResult.toArray());
    }

    @Test
    public void testIndexOf() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableLinkedList imLinList = new ImmutableLinkedList(object);
        int expResult = 2;
        int actualResult = imLinList.indexOf("you");
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testSize() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableLinkedList imLinList = new ImmutableLinkedList(object);
        int expResult = 3;
        int actualResult = imLinList.size();
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testClear() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableLinkedList imLinList = new ImmutableLinkedList(object);
        Object[] expResult = {};
        ImmutableLinkedList actualResult = imLinList.clear();
        assertArrayEquals(expResult, actualResult.toArray());
    }

    @Test
    public void testEmpty() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableLinkedList imLinList = new ImmutableLinkedList(object);
        assertFalse(imLinList.isEmpty());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void indexErrorTest() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableLinkedList imLinList = new ImmutableLinkedList(object);
        ImmutableLinkedList actualResult = imLinList.addAll(5, new Object[]{"so", "many", "people", "but"});
    }

    @Test
    public void testAddFirst() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableLinkedList imLinList = new ImmutableLinkedList(object);
        Object[] expResult = {"today", "arman", "loves", "you"};
        ImmutableLinkedList actualResult = imLinList.addFirst("today");
        assertArrayEquals(expResult, actualResult.toArray());
    }

    @Test
    public void testAddLast() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableLinkedList imLinList = new ImmutableLinkedList(object);
        Object[] expResult = {"arman", "loves", "you", "too"};
        ImmutableLinkedList actualResult = imLinList.addLast("too");
        assertArrayEquals(expResult, actualResult.toArray());
    }

    @Test
    public void testGetFirst() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableLinkedList imLinList = new ImmutableLinkedList(object);
        Object expResult = "arman";
        Object actualResult = imLinList.getFirst();
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testGetLast() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableLinkedList imLinList = new ImmutableLinkedList(object);
        Object expResult = "you";
        Object actualResult = imLinList.getLast();
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testRemoveFirst() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableLinkedList imLinList = new ImmutableLinkedList(object);
        Object[] expResult = {"loves", "you"};
        ImmutableLinkedList actualResult = imLinList.removeFirst();
        assertArrayEquals(expResult, actualResult.toArray());
    }

    @Test
    public void testRemoveLast() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableLinkedList imLinList = new ImmutableLinkedList(object);
        Object[] expResult = {"arman", "loves"};
        ImmutableLinkedList actualResult = imLinList.removeLast();
        assertArrayEquals(expResult, actualResult.toArray());
    }

    @Test
    public void testString() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableLinkedList imLinList = new ImmutableLinkedList(object);
        Object expResult = "arman, loves, you";
        Object actualResult = imLinList.toString();
        assertEquals(expResult, actualResult);
    }
}
