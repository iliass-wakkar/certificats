import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CustomIntegerArrayListTest {

    @Test
    void testGetArrayList() {

        //create a new empty CustomIntegerArrayList
        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
        arr1.add(2);
        arr1.add(0, 5);
        arr1.add(1, 5);

        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        lst1.add(2);
        lst1.add(0, 5);
        lst1.add(1, 5);
        assertEquals(lst1, arr1.getArrayList());

        ArrayList<Integer> arr4Elements = new ArrayList<Integer>();
        arr4Elements.add(100);
        arr4Elements.add(200);
        arr4Elements.add(500);

        //create a new CustomIntegerArrayList with the elements in the given ArrayList
        CustomIntegerArrayList arr4 = new CustomIntegerArrayList(arr4Elements);

        ArrayList<Integer> lst4 = new ArrayList<Integer>();
        lst4.add(100);
        lst4.add(200);
        lst4.add(500);

        assertEquals(lst4, arr4.getArrayList());

        // TODO write at least 3 additional test cases
        CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
        arr2.add(10);
        arr2.add(0, 5);
        arr2.add(0, 6);

        ArrayList<Integer> lst2 = new ArrayList<Integer>();
        lst2.add(10);
        lst2.add(0, 5);
        lst2.add(0, 6);
        assertEquals(lst2, arr2.getArrayList());


        CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
        arr3.add(2);
        arr3.add(0, 7);
        arr3.add(1, 8);

        ArrayList<Integer> lst3 = new ArrayList<Integer>();
        lst3.add(2);
        lst3.add(0, 7);
        lst3.add(1, 8);
        assertEquals(lst3, arr3.getArrayList());


        CustomIntegerArrayList arr5 = new CustomIntegerArrayList();
        arr5.add(2);
        arr5.add(0, 9);
        arr5.add(1, 10);

        ArrayList<Integer> lst5 = new ArrayList<Integer>();
        lst5.add(2);
        lst5.add(0, 9);
        lst5.add(1, 10);
        assertEquals(lst5, arr5.getArrayList());
    }

    @Test
    void testGet() {
        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
        arr1.add(2);
        arr1.add(0, 5);
        arr1.add(1, 5);

        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        lst1.add(2);
        lst1.add(0, 5);
        lst1.add(1, 5);

        assertEquals(lst1.get(0).intValue(), arr1.get(0));
        assertEquals(lst1.get(1).intValue(), arr1.get(1));
        assertEquals(lst1.get(2).intValue(), arr1.get(2));

        // TODO write at least 3 additional test cases
        CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
        arr2.add(2);
        arr2.add(0, 10);
        arr2.add(0, 11);

        ArrayList<Integer> lst2 = new ArrayList<Integer>();
        lst2.add(2);
        lst2.add(0, 10);
        lst2.add(0, 11);

        assertEquals(lst2.get(0).intValue(), arr2.get(0));
        assertEquals(lst2.get(1).intValue(), arr2.get(1));
        assertEquals(lst2.get(2).intValue(), arr2.get(2));
    }

    @Test
    void testAddInt() {

        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);

        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);

        assertEquals(lst1.get(0).intValue(), arr1.get(0));
        assertEquals(lst1.get(1).intValue(), arr1.get(1));
        assertEquals(lst1.get(2).intValue(), arr1.get(2));

        // TODO write at least 3 additional test cases
        CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
        arr2.add(10);
        arr2.add(12);
        arr2.add(20);

        ArrayList<Integer> lst2 = new ArrayList<Integer>();
        lst2.add(10);
        lst2.add(12);
        lst2.add(20);

        assertEquals(lst2.get(0).intValue(), arr2.get(0));
        assertEquals(lst2.get(1).intValue(), arr2.get(1));
        assertEquals(lst2.get(2).intValue(), arr2.get(2));
    }

    @Test
    void testAddIntInt() {

        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
        arr1.add(0, 2);
        arr1.add(0, 3);
        arr1.add(0, 4);


        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        lst1.add(0, 2);
        lst1.add(0, 3);
        lst1.add(0, 4);

        assertEquals(lst1.get(0).intValue(), arr1.get(0));
        assertEquals(lst1.get(1).intValue(), arr1.get(1));
        assertEquals(lst1.get(2).intValue(), arr1.get(2));

        // TODO write at least 3 additional test cases
        CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
        arr2.add(0, 3);
        arr2.add(1, 4);
        arr2.add(0, 5);


        ArrayList<Integer> lst2 = new ArrayList<Integer>();
        lst2.add(0, 3);
        lst2.add(1, 4);
        lst2.add(0, 5);

        assertEquals(lst2.get(0).intValue(), arr2.get(0));
        assertEquals(lst2.get(1).intValue(), arr2.get(1));
        assertEquals(lst2.get(2).intValue(), arr2.get(2));
    }

    @Test
    void testRemoveInt() {

        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
        arr1.add(0, 2);
        arr1.add(0, 3);
        arr1.add(0, 4);
        arr1.remove(0);
        arr1.remove(1);

        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        lst1.add(0, 2);
        lst1.add(0, 3);
        lst1.add(0, 4);
        lst1.remove(0);
        lst1.remove(1);

        assertEquals(lst1.get(0).intValue(), arr1.get(0));

        // TODO write at least 3 additional test cases
    }

    @Test
    void testRemoveIntInt() {

        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
        arr1.add(0, 2);
        arr1.add(0, 3);
        arr1.add(0, 3);
        arr1.add(0, 3);
        arr1.add(0, 3);
        arr1.add(0, 4);
        arr1.remove(3, 3);

        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        lst1.add(0, 2);
        lst1.add(0, 3);
        lst1.add(0, 4);

        assertEquals(lst1, arr1.getArrayList());

        // TODO write at least 3 additional test cases
        CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
        arr2.add(0, 2);
        arr2.add(0, 3);
        arr2.add(0, 3);
        arr2.add(0, 3);
        arr2.add(0, 3);
        arr2.add(0, 5);
        arr2.remove(3, 3);

        ArrayList<Integer> lst2 = new ArrayList<Integer>();
        lst2.add(0, 2);
        lst2.add(0, 3);
        lst2.add(0, 5);

        assertEquals(lst2, arr2.getArrayList());

        CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
        arr3.add(0, 4);
        arr3.add(0, 3);
        arr3.add(0, 3);
        arr3.add(0, 3);
        arr3.add(0, 3);
        arr3.add(0, 6);
        arr3.remove(3, 3);

        ArrayList<Integer> lst3 = new ArrayList<Integer>();
        lst3.add(0, 4);
        lst3.add(0, 3);
        lst3.add(0, 6);

        assertEquals(lst3, arr3.getArrayList());


        CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
        arr4.add(0, 8);
        arr4.add(0, 1);
        arr4.add(0, 1);
        arr4.add(0, 1);
        arr4.add(0, 1);
        arr4.add(0, 10);
        arr4.remove(3, 1);

        ArrayList<Integer> lst4 = new ArrayList<Integer>();
        lst4.add(0, 8);
        lst4.add(0, 1);
        lst4.add(0, 10);

        assertEquals(lst4, arr4.getArrayList());
    }

    @Test
    void testSpliceIntInt() {

        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr1.add(6);
        arr1.splice(3, 2);

        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);

        assertEquals(lst1.get(0).intValue(), arr1.get(0));
        assertEquals(lst1.get(1).intValue(), arr1.get(1));
        assertEquals(lst1.get(2).intValue(), arr1.get(2));

        // TODO write at least 3 additional test cases

        CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
        arr2.add(0);
        arr2.add(1);
        arr2.add(2);
        arr2.add(7);
        arr2.add(8);
        arr2.splice(3, 2);

        ArrayList<Integer> lst2 = new ArrayList<Integer>();
        lst2.add(0);
        lst2.add(1);
        lst2.add(2);

        assertEquals(lst2.get(0).intValue(), arr2.get(0));
        assertEquals(lst2.get(1).intValue(), arr2.get(1));
        assertEquals(lst2.get(2).intValue(), arr2.get(2));

    }

    @Test
    void testSpliceIntIntIntArray() {

        CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr1.add(6);
        arr1.splice(3, 1, new int[]{4, 5});

        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);
        lst1.add(4);
        lst1.add(5);
        lst1.add(6);

        assertEquals(lst1, arr1.getArrayList());

        // TODO write at least 3 additional test cases
        CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);
        arr2.splice(3, 1, new int[]{4, 5, 7, 8});

        ArrayList<Integer> lst2 = new ArrayList<Integer>();
        lst2.add(2);
        lst2.add(3);
        lst2.add(4);
        lst2.add(4);
        lst2.add(5);
        lst2.add(7);
        lst2.add(8);
        lst2.add(6);

        assertEquals(lst2, arr2.getArrayList());

        CustomIntegerArrayList arr3 = new CustomIntegerArrayList();
        arr3.add(2);
        arr3.add(3);
        arr3.add(4);
        arr3.add(5);
        arr3.add(6);
        arr3.splice(2, 2, new int[]{});

        ArrayList<Integer> lst3 = new ArrayList<Integer>();
        lst3.add(2);
        lst3.add(3);
        lst3.add(6);

        assertEquals(lst3, arr3.getArrayList());

        CustomIntegerArrayList arr4 = new CustomIntegerArrayList();
        arr4.add(2);
        arr4.add(3);
        arr4.add(4);
        arr4.add(5);
        arr4.add(6);
        arr4.splice(2, 3, new int[]{10});

        ArrayList<Integer> lst4 = new ArrayList<Integer>();
        lst4.add(2);
        lst4.add(3);
        lst4.add(10);

        assertEquals(lst4, arr4.getArrayList());
    }

}