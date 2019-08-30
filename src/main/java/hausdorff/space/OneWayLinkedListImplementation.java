package hausdorff.space;

import java.awt.*;

public class OneWayLinkedListImplementation implements InterfaceOneWayList {
    public int size;
    public Node head;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addFirst(int value) {
        Node newNode = new Node();
        newNode.value = value;
        if (size() == 0) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    @Override
    public int removeFirst() {
        int removedElement;
        if (size() == 0) {
            throw new ListIsEmptyException("list size is Empty");
        } else {
            removedElement = head.value;
            head = head.next.next;
        }
        size++;
        return removedElement;
    }

    @Override
    public void addLast(int value) {
        if (size() == 0) {
            addFirst(value);
        } else {
            Node temporary = head;
            while (temporary.next != null) {
                temporary = temporary.next;
            }
            Node newNode = new Node();
            newNode.value = value;
            temporary.next = newNode;
            size++;
        }
    }

    @Override
    public void insert(int value, int index) {
        if (index == 1) {
            addFirst(value);
        } else if (size() == index) {
            addLast(value);
        } else {
            Node current = head;
            while (index-- > 1) {
                current = current.next;
            }
            Node newNode = new Node(current.next, value);
            current.next = newNode;
            size++;
        }
    }

    @Override
    public int get(int index) {
        Node temporary = head;
        while (index-- > 0) {
            temporary = temporary.next;
        }
        return temporary.value;
    }

    @Override
    public int removeLast() {
        int returnElement = 0;
        if (size() == 0) {
            throw new ListIsEmptyException("List is empty");
        } else if (size() == 1) {
            removeFirst();
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            returnElement = current.value;
        }
        size--;
        return returnElement;
    }

    @Override
    public int remove(int index) {
        int removeElement = 0;
        Node current = head;
        while (index -- > 0){
            current = current.next;
        }

        size--;
        return removeElement;
    }
}
