package ua.epam.hw5Test;

import org.junit.Test;
import ua.epam.hw5.RotateList;
import java.util.LinkedList;
import static org.junit.Assert.assertEquals;

public class RotateListTest {
    @Test
    public void testRotateListByInteger() {
        LinkedList<Integer> rotatedLinkedList = new LinkedList<Integer>();
        rotatedLinkedList.add(4);
        rotatedLinkedList.add(5);
        rotatedLinkedList.add(1);
        rotatedLinkedList.add(2);
        rotatedLinkedList.add(3);

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        int k = 2;
        RotateList rl = new RotateList();
        LinkedList result = rl.linkedListRotate(linkedList, k);
        assertEquals(result, rotatedLinkedList);
    }
    @Test
    public void testRotateListByString() {
        LinkedList<String> rotatedLinkedList = new LinkedList<String>();
        rotatedLinkedList.add("4");
        rotatedLinkedList.add("5");
        rotatedLinkedList.add("1");
        rotatedLinkedList.add("2");
        rotatedLinkedList.add("3");

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");
        int k = 2;
        RotateList rl = new RotateList();
        LinkedList result = rl.linkedListRotate(linkedList, k);
        assertEquals(result, rotatedLinkedList);
    }
}
