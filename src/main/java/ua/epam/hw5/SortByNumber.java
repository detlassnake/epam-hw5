package ua.epam.hw5;

import java.util.Collections;
import java.util.LinkedList;
//Task 2
//Given a linked list and a value x,
// partition it such that all nodes less than x come before nodes greater than or equal to x.

//You should preserve the original relative order of the nodes in each of the two partitions.
//Example:
//Input: head = 1->4->3->2->5->2, x = 3
//Output: 1->2->2->3->4->5

public class SortByNumber {
    static final String ORIGINAL_LIST_TEXT = "Original List: ";
    static final String SORTED_LIST_TEXT = "Sorted List by ";
    static final String SEMICOLON_TEXT = ": ";

    public LinkedList linkedListPartitionByNumber(LinkedList linkedList, int x) {
        System.out.println(ORIGINAL_LIST_TEXT + linkedList);
        Collections.sort(linkedList);
        System.out.println(SORTED_LIST_TEXT + x + SEMICOLON_TEXT + linkedList);
        return linkedList;
    }
}
