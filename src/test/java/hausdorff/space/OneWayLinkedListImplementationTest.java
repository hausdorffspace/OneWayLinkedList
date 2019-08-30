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
        try {
            underTest.removeFirst();
            fail();
        } catch (ListIsEmptyException e){
            System.out.println("Array list ist empty, exception is catch");
        }
    }

    @Test
    public void addLastTest(){
        underTest.addLast(10);
        underTest.addLast(11);
        underTest.addLast(12);
        underTest.addLast(13);
        assertEquals(underTest.get(3),13);
    }

    @Test
    public void insertTest(){
        underTest.addLast(10);
        underTest.addLast(20);
        underTest.addLast(30);
        underTest.addLast(40);
        underTest.addLast(50);
        underTest.addLast(60);
        underTest.addLast(70);
        underTest.addLast(80);
        underTest.addLast(90);
        underTest.insert(55,5);
        assertEquals(55,underTest.get(5));
    }

    @Test
    public void getTest(){
        underTest.addFirst(10);
        underTest.addFirst(12);
        underTest.addFirst(14);
        underTest.addFirst(16);
        assertEquals(16,underTest.get(0));
        assertEquals(14,underTest.get(1));
        assertEquals(12,underTest.get(2));
        assertEquals(10,underTest.get(3));
    }

    @Test
    public void removeLastSizeTest(){
        underTest.addFirst(10);
        underTest.addFirst(12);
        underTest.addFirst(14);
        underTest.addFirst(16);
        underTest.removeLast();
        assertEquals(3,underTest.size());
    }

    @Test
    public void removeLastTest(){
        underTest.addFirst(10);
        underTest.addFirst(12);
        underTest.addFirst(14);
        underTest.addFirst(16);
        int i = underTest.removeLast();
        assertEquals(12,underTest.get(2));
    }

}