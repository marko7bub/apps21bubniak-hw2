package ua.edu.ucu.collections.immutable;


public class ImmutableArrayList implements ImmutableList {


    private final Object[] array;
    private final int length;

    public ImmutableArrayList() {
        this.array = new Object[0];
        this.length = 0;
    }

    public ImmutableArrayList(Object[] array) {
        this.array = array;
        this.length = array.length;
    }

    @Override
    public ImmutableArrayList add(Object e) {
        Object[] element = {e};
        return addAll(this.length, element);
    }

    @Override
    public ImmutableArrayList add(int index, Object e) {
        if (index > this.length) {
            throw new IndexOutOfBoundsException();
        }
        Object[] element = {e};
        return addAll(index, element);
    }

    @Override
    public ImmutableArrayList addAll(Object[] c) {
        return addAll(this.length, c);
    }

    @Override
    public ImmutableArrayList addAll(int index, Object[] c) {
        if (index > this.length) {
            throw new IndexOutOfBoundsException();
        }
        Object[] finArray = new Object[this.length + c.length];
        System.arraycopy(this.array, 0, finArray, 0, index);
        System.arraycopy(c, 0, finArray, index, c.length);
        System.arraycopy(this.array, index, finArray,
                index+c.length, this.length - index);
        return new ImmutableArrayList(finArray);
    }

    @Override
    public Object get(int index) {
        if (index > this.length) {
            throw new IndexOutOfBoundsException();
        }
        return this.array[index];
    }

    @Override
    public ImmutableArrayList remove(int index) {
        if (index > this.length) {
            throw new IndexOutOfBoundsException();
        }
        Object[] finArray = new Object[this.length - 1];
        System.arraycopy(this.array, 0, finArray, 0, index);
        System.arraycopy(this.array, index + 1,
                finArray, index, this.length - 1 - index);
        return new ImmutableArrayList(finArray);
    }

    @Override
    public ImmutableArrayList set(int index, Object e) {
        if (index > this.length) {
            throw new IndexOutOfBoundsException();
        }
        Object[] finArray = new Object[this.length];
        System.arraycopy(this.array, 0, finArray, 0, index);
        finArray[index] = e;
        System.arraycopy(this.array, index + 1, finArray,
                index + 1, this.length - 1 - index);
        return new ImmutableArrayList(finArray);
    }

    @Override
    public int indexOf(Object e) {
        int counter = 0;
        for (Object element: this.array) {
            if (element == e) {
                return counter;
            }
            counter += 1;
        }
        return -1;
    }

    @Override
    public int size() {
        return this.length;
    }

    @Override
    public ImmutableArrayList clear() {
        return new ImmutableArrayList();
    }

    @Override
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override
    public Object[] toArray() {
        return this.array;
    }

    public String toString() {
        StringBuffer arrayString = new StringBuffer();
        for (Object element: this.array) {
            if (element == this.array[this.length - 1]) {
                arrayString.append(element);
            } else {
                arrayString.append(element + ", ");
            }
        }
        return arrayString.toString();
    }
}
