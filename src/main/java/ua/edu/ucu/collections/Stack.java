package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList stack;

    public Stack() {
        stack = new ImmutableLinkedList();
    }

    public Stack(Object e) {
        stack = new ImmutableLinkedList(e);
    }

    public Stack(Object[] elements) {
        stack = new ImmutableLinkedList(elements);
    }

    public Object peek() {
        return stack.getFirst();
    }

    public void push(Object e) {
        stack = stack.addFirst(e);
    }

    public Object pop() {
        Object element = stack.getFirst();
        stack = stack.removeFirst();
        return element;
    }

    public Object[] toArray() {
        return stack.toArray();
    }
}
