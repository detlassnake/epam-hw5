package ua.epam.hw5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
//Task 3
//Given a sorted array nums,
//remove the duplicates
// in-place such that each element appear only once
// and return the new length.
//Example 1:
//Given nums = [1,1,2],Your function should return length = 2,
// with the first two elements of nums being 1 and 2 respectively.

public class OnlyOnes {
    static final String ORIGINAL_LIST_TEXT = "Original List: ";
    static final String SORTED_LIST_TEXT = "Sorted List: ";
    static final String LIST_SIZE_TEXT = "List size: ";

    public ArrayList noDuplicates(ArrayList arrayList) {
        if (arrayList == null) {
            return new ArrayList();
        }
        Collections.sort(arrayList);
        System.out.println(ORIGINAL_LIST_TEXT + arrayList);
        arrayList = new ArrayList<Integer>(new HashSet<Integer>(arrayList));
        System.out.println(SORTED_LIST_TEXT + arrayList);
        System.out.println(LIST_SIZE_TEXT + arrayList.size());
        return arrayList;
    }
}
