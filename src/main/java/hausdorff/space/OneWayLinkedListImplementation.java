package hausdorff.space;

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
        return removedElement;
    }

    @Override
    public void addLast(int value) {
        if (size() == 0) {
            addFirst(value);
        } else {

        }
    }

    @Override
    public void insert(int value, int index) {

    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int removeLast() {
        return 0;
    }

    @Override
    public int remove() {
        return 0;
    }
}
