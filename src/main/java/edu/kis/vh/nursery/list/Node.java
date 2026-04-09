package edu.kis.vh.nursery.list;

/**
 * Klasa reprezentująca pojedynczy element (węzeł) listy dwukierunkowej.
 * Każdy węzeł przechowuje wartość oraz referencje do poprzedniego
 * i następnego elementu listy.
 */
public class Node {

    private final int value;
    private Node prev;
    private Node next;

    public Node(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
