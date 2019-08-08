package hausdorff.space;

public interface InterfaceOneWayList {
    int size();
    int removeFirst();
    void addFirst(int value);
    void addLast(int value);
    void insert(int value, int index);
    int get(int index);
    int removeLast();
    int remove();
}
