package hausdorff.space;

import org.junit.Test;

import static org.junit.Assert.*;

public class OneWayLinkedListImplementationTest {
    OneWayLinkedListImplementation underTest = new OneWayLinkedListImplementation();

    @Test
    public void addFirstTest(){
        underTest.addFirst(1);
        underTest.addFirst(2);
        underTest.addFirst(3);
        underTest.addFirst(4);
        assertEquals(4,underTest.size());
    }

    @Test
    public void removeFirstTest(){
        underTest.addFirst(12453);
        underTest.addFirst(1236);
        underTest.addFirst(1643);
        underTest.addFirst(91);
        int removeElement = underTest.removeFirst();
        assertEquals(91,removeElement);
    }

    @Test
    public void removefirstIfListisEmpty(){
        underTest.removeFirst();
    }
}