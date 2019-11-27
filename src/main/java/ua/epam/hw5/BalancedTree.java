package ua.epam.hw5;

import java.util.ArrayList;
import java.util.TreeSet;
//Task 4
// Given an array where elements are sorted in ascending order,
// convert it to a height balanced BST.
//For this problem, a height-balanced binary tree is defined as a binary tree
//in which the depth of the two subtrees of every node never differ by more than 1.

public class BalancedTree<T> {
    static final String ORIGINAL_LIST_TEXT = "Original List: ";
    static final String TREE_TEXT = "Tree: ";

    public TreeSet balancedBinaryTree(ArrayList<T> arrayList) {
        if (arrayList == null) {
            return new TreeSet();
        }
        System.out.println(ORIGINAL_LIST_TEXT + arrayList);
        TreeSet<T> treeSet = new TreeSet<T>(arrayList);//TreeSet is basically implementation of a self-balancing binary search tree like Red-Black Tree.
        System.out.println(TREE_TEXT + treeSet);
        return treeSet;
    }
}
