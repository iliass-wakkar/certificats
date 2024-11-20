import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayAndArrayListTest {

	// declare myArrayAndArrayList which is the object for testing
	ArrayAndArrayList myArrayAndArrayList;
	
	@BeforeEach
	void setUp() throws Exception {
		// initialize myArrayAndArrayList for testing
		this.myArrayAndArrayList = new ArrayAndArrayList();
	}
	
	/**
	 * Test howMany method in ArrayAndArrayList.
	 */
	@Test
	void testHowMany() {
        // element in the array
        int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
        assertEquals(2, this.myArrayAndArrayList.howMany(array, 1));
        
        // additional test case 1: no occurrences
        assertEquals(0, this.myArrayAndArrayList.howMany(array, 10));
        
        // additional test case 2: array has one element
        int[] array2 = {5};
        assertEquals(1, this.myArrayAndArrayList.howMany(array2, 5));
        
        // additional test case 3: empty array
        int[] array3 = {};
        assertEquals(0, this.myArrayAndArrayList.howMany(array3, 5));
    }
	
	/**
	 * Test findMax method in ArrayAndArrayList.
	 */
	@Test
	void testFindMax() {
        // findMax in a non-empty array
        int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
        assertEquals(9, this.myArrayAndArrayList.findMax(array));
        
        // additional test case 1: single element array
        int[] array2 = {5};
        assertEquals(5, this.myArrayAndArrayList.findMax(array2));
        
        // additional test case 2: all elements are the same
        int[] array3 = {5, 5, 5, 5};
        assertEquals(5, this.myArrayAndArrayList.findMax(array3));
        
        // additional test case 3: array with negative numbers
        int[] array4 = {-1, -3, -5, -7};
        assertEquals(-1, this.myArrayAndArrayList.findMax(array4));
    }

	/**
	 * Test maxArray method in ArrayAndArrayList.
	 */
	@Test
	void testMaxArray() {
        // test a valid array
        int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
        ArrayList<Integer> testArrayList = new ArrayList<>();
        testArrayList.add(9);
        assertEquals(testArrayList, this.myArrayAndArrayList.maxArray(array));
        
        // additional test case 1: array with multiple max values
        int[] array2 = {5, 5, 7, 7, 3, 4};
        ArrayList<Integer> testArrayList2 = new ArrayList<>();
        testArrayList2.add(7);
        testArrayList2.add(7);
        assertEquals(testArrayList2, this.myArrayAndArrayList.maxArray(array2));
        
        // additional test case 2: single element array
        int[] array3 = {10};
        ArrayList<Integer> testArrayList3 = new ArrayList<>();
        testArrayList3.add(10);
        assertEquals(testArrayList3, this.myArrayAndArrayList.maxArray(array3));
        
        // additional test case 3: empty array
        int[] array4 = {};
        ArrayList<Integer> testArrayList4 = new ArrayList<>();
        assertEquals(testArrayList4, this.myArrayAndArrayList.maxArray(array4));
    }

	/**
	 * Test swapZero method in ArrayAndArrayList.
	 */
	@Test
	 void testSwapZero() {
        // test an array containing 0
        int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
        int[] testArray = {1, 2, 3, 5, 0, 0, 0, 0};
        this.myArrayAndArrayList.swapZero(array);
        assertArrayEquals(testArray, array);
        
        // additional test case 1: no zeros in the array
        int[] array2 = {1, 2, 3, 4, 5};
        int[] testArray2 = {1, 2, 3, 4, 5};
        this.myArrayAndArrayList.swapZero(array2);
        assertArrayEquals(testArray2, array2);
        
        // additional test case 2: all elements are zeros
        int[] array3 = {0, 0, 0, 0};
        int[] testArray3 = {0, 0, 0, 0};
        this.myArrayAndArrayList.swapZero(array3);
        assertArrayEquals(testArray3, array3);
        
        // additional test case 3: single zero in the array
        int[] array4 = {0, 1, 2, 3};
        int[] testArray4 = {1, 2, 3, 0};
        this.myArrayAndArrayList.swapZero(array4);
        assertArrayEquals(testArray4, array4);
        
        // additional test case 4: empty array
        int[] array5 = {};
        int[] testArray5 = {};
        this.myArrayAndArrayList.swapZero(array5);
        assertArrayEquals(testArray5, array5);
    }

}