package ua.epam.hw5;

import java.util.Collections;
import java.util.LinkedList;
//Task 1
//Given a linked list, rotate the list to the right by k places, where k is non-negative.
//Example 1:
//Input: 1->2->3->4->5->NULL, k = 2
//Output: 4->5->1->2->3->NULL

public class RotateList<T> {
    static final String ORIGINAL_LIST_TEXT = "Original List: ";
    static final String ROTATED_LIST_TEXT = "Rotated List :";

    public LinkedList linkedListRotate(LinkedList<T> linkedList, int k) {
        if (linkedList == null) {
            return new LinkedList();
        }
        System.out.println(ORIGINAL_LIST_TEXT + linkedList);
        Collections.rotate(linkedList, k);
        System.out.println(ROTATED_LIST_TEXT + linkedList);
        return linkedList;
    }
}