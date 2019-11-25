package ua.epam.hw5Test;

import org.junit.Test;
import ua.epam.hw5.BalancedTree;
import java.util.ArrayList;
import java.util.TreeSet;
import static org.junit.Assert.assertEquals;

public class BalancedTreeTest {
    @Test
    public void tesTBalancedTreeByInteger() {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(1);
        treeSet.add(2);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        BalancedTree bt = new BalancedTree();
        TreeSet result = bt.balancedBinaryTree(arrayList);
        assertEquals(result,treeSet);
    }
    @Test
    public void tesTBalancedTreeByString() {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("one");
        treeSet.add("two");
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("one");
        arrayList.add("one");
        arrayList.add("two");
        BalancedTree bt = new BalancedTree();
        TreeSet result = bt.balancedBinaryTree(arrayList);
        assertEquals(result,treeSet);
    }
}
