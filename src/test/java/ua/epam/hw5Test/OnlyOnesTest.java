package ua.epam.hw5Test;

import org.junit.Test;
import ua.epam.hw5.OnlyOnes;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class OnlyOnesTest {
    @Test
    public void testOnlyOnesByInteger() {
        ArrayList<Integer> output = new ArrayList<Integer>();
        output.add(1);
        output.add(2);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        OnlyOnes on = new OnlyOnes();
        ArrayList result = on.noDuplicates(arrayList);
        assertEquals(output,result);
    }
    @Test
    public void testOnlyOnesByString() {
        ArrayList<String> output = new ArrayList<String>();
        output.add("one");
        output.add("two");
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("one");
        arrayList.add("one");
        arrayList.add("two");
        OnlyOnes on = new OnlyOnes();
        ArrayList result = on.noDuplicates(arrayList);
        assertEquals(output,result);
    }
}
