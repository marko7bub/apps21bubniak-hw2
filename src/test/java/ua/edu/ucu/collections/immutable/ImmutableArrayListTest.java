package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImmutableArrayListTest {

    @Test
    public void testAddAll() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableArrayList imArList = new ImmutableArrayList(object);
        Object[] expResult = {"arman", "loves", "himself", "not", "you"};
        ImmutableArrayList actualResult = imArList.addAll(2, new Object[]{"himself", "not"});
        assertArrayEquals(expResult, actualResult.toArray());
    }

    @Test
    public void testAdd() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableArrayList imArList = new ImmutableArrayList(object);
        Object[] expResult = {"arman", "loves", "you", "too"};
        ImmutableArrayList actualResult = imArList.add("too");
        assertArrayEquals(expResult, actualResult.toArray());
    }

    @Test
    public void testAddIndex() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableArrayList imArList = new ImmutableArrayList(object);
        Object[] expResult = {"arman", "knows and", "loves", "you"};
        ImmutableArrayList actualResult = imArList.add(1, "knows and");
        assertArrayEquals(expResult, actualResult.toArray());
    }

    @Test
    public void testAddAllEnd() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableArrayList imArList = new ImmutableArrayList(object);
        Object[] expResult = {"arman", "loves", "you", "not", "him"};
        ImmutableArrayList actualResult = imArList.addAll(new Object[]{"not", "him"});
        assertArrayEquals(expResult, actualResult.toArray());
    }

    @Test
    public void testGet() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableArrayList imArList = new ImmutableArrayList(object);
        String expResult = "loves";
        Object actualResult = imArList.get(1);
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testRemove() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableArrayList imArList = new ImmutableArrayList(object);
        Object[] expResult = {"arman", "you"};
        ImmutableArrayList actualResult = imArList.remove(1);
        assertArrayEquals(expResult, actualResult.toArray());
    }

    @Test
    public void testSet() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableArrayList imArList = new ImmutableArrayList(object);
        Object[] expResult = {"arman", "knows", "you"};
        ImmutableArrayList actualResult = imArList.set(1, "knows");
        assertArrayEquals(expResult, actualResult.toArray());
    }

    @Test
    public void testIndexOf() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableArrayList imArList = new ImmutableArrayList(object);
        int expResult = 1;
        int actualResult = imArList.indexOf("loves");
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testSize() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableArrayList imArList = new ImmutableArrayList(object);
        int expResult = 3;
        int actualResult = imArList.size();
        assertEquals(expResult, actualResult);
    }

    @Test
    public void testClear() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableArrayList imArList = new ImmutableArrayList(object);
        Object[] expResult = {};
        ImmutableArrayList actualResult = imArList.clear();
        assertArrayEquals(expResult, actualResult.toArray());
    }

    @Test
    public void testEmpty() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableArrayList imArList = new ImmutableArrayList(object);
        assertFalse(imArList.isEmpty());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void indexErrorTest() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableArrayList imArList = new ImmutableArrayList(object);
        ImmutableArrayList actualResult = imArList.addAll(5, new Object[]{"so", "many", "people", "but"});
    }

    @Test
    public void testString() {
        Object[] object = new Object[]{"arman", "loves", "you"};
        ImmutableArrayList imArList = new ImmutableArrayList(object);
        Object expResult = "arman, loves, you";
        Object actualResult = imArList.toString();
        assertEquals(expResult, actualResult);
    }
}
