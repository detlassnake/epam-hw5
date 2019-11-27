package ua.epam.hw5Test;

import org.junit.Test;
import ua.epam.hw5.SortByNumber;
import java.util.LinkedList;
import static org.junit.Assert.assertEquals;

public class SortByNumberTest {
    @Test
    public void testSortByNumber() {
        LinkedList<Integer> sortedByNumberList = new LinkedList<Integer>();
        sortedByNumberList.add(1);
        sortedByNumberList.add(2);
        sortedByNumberList.add(2);
        sortedByNumberList.add(3);
        sortedByNumberList.add(4);
        sortedByNumberList.add(5);

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(2);
        int x = 3;
        SortByNumber sbn = new SortByNumber();
        LinkedList result = sbn.linkedListPartitionByNumber(linkedList,x);
        assertEquals(result,sortedByNumberList);
    }
    @Test
    public void testSortByNumberNoNull() {
        int x = 3;
        SortByNumber sbn = new SortByNumber();
        LinkedList result = sbn.linkedListPartitionByNumber(null,x);
        assertEquals(result,new LinkedList());
    }
}
