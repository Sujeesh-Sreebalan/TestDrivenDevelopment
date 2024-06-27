package TestDrivenDevelopment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class ComputationTest {
	
	// Junit test of calculateLongestMirrorSize function
	@Test
	public void calculateLongestMirrorSizeTest() {
		Computation comp = new Computation();
		int maxMirror[] = {1, 2, 3, 4, 3, 2, 1};
		int result = comp.calculateLongestMirrorSize(maxMirror);
		assertEquals(7, result);
	}
	
	@Test
	public void calculateLongestMirrorSizeTest1() {
		Computation comp = new Computation();
		int maxMirror[] = {1, 2, 1, 4};
		int result = comp.calculateLongestMirrorSize(maxMirror);
		assertEquals(3, result);
		
	}
	
	@Test
	public void calculateLongestMirrorSizeTest3() {
		Computation comp = new Computation();
		int maxMirror[] = new int[0];
		AssertionError exception = assertThrows(AssertionError.class, () -> comp.calculateLongestMirrorSize(maxMirror));
		assertEquals("Cannot Compute on empty array", exception.getMessage());	
	}
	
	// Junit test of calculateClumps
	@Test
	public void calculateClumpsTest() {
		Computation comp = new Computation();
		int countClumps[] = {1, 2, 2, 3, 4, 4};
		int result = comp.calculateClumps(countClumps);
		assertEquals(2, result);
	}
	
	@Test
	public void calculateClumpsTest1() {
		Computation comp = new Computation();
		int countClumps[] = {1, 1, 1, 1, 1};
		int result = comp.calculateClumps(countClumps);
		assertEquals(1, result);
	}
	
	@Test
	public void calculateClumpsTest2() {
		Computation comp = new Computation();
		int countClumps[] = new int[0];
		AssertionError exception = assertThrows(AssertionError.class, () -> comp.calculateLongestMirrorSize(countClumps));
		assertEquals("Cannot Compute on empty array", exception.getMessage());
	}
	
	
	// Junit test of fixXY function
	@Test
	public void fixArrayTest() {
		Computation comp = new Computation();
		int x = 4;
		int y = 5;
		int fix[] = {5, 4, 9, 4, 9, 5};
		int fix1[] = {9, 4, 5, 4, 5, 9};
 		int result[] = comp.fixArray(fix, x, y);
		Assert.assertArrayEquals(fix1, result);
	}
	
	@Test
	public void fixArrayTest1() {
		Computation comp = new Computation();
		int x = 4;
		int y = 5;
		int fix[] = new int[0];
		AssertionError exception = assertThrows(AssertionError.class, () -> comp.fixArray(fix,x,y));
		assertEquals("Cannot Compute on empty array", exception.getMessage());			
	}
	
	@Test
	public void fixArrayTest2() {
		Computation comp = new Computation();
		int x = 4;
		int y = 5;
		int fix[] = {3,5,4,2,4,5,4};
		AssertionError exception = assertThrows(AssertionError.class, () -> comp.fixArray(fix,x,y));
		assertEquals("X cannot occurs at the last index of array", exception.getMessage());
	}
	
	@Test
	public void fixArrayTest3() {
		Computation comp = new Computation();
		int x = 4;
		int y = 5;
		int fix[] = {2,3,4,5,6,4,4,7,5,5};
		AssertionError exception = assertThrows(AssertionError.class, () -> comp.fixArray(fix,x,y));
		assertEquals("Two adjacents X values are there", exception.getMessage());
	}
	
	@Test
	public void fixArrayTest4() {
		Computation comp = new Computation();
		int x = 4;
		int y = 5;
		int fix[] = {2,3,4,5,4,7};
		AssertionError exception = assertThrows(AssertionError.class, () -> comp.fixArray(fix,x,y));
		assertEquals("There are unequal numbers of X and Y in input array", exception.getMessage());
		
	}
	
	// Junit test for calculateSum function
	@Test
	public void calculateSumTest() {
		Computation comp = new Computation();
		int splitArray[] = {1, 1, 1, 2, 1};
		int result = comp.calculateSum(splitArray);
		assertEquals(3, result);
	}
	
	@Test
	public void calculateSumTest1() {
		Computation comp = new Computation();
		int splitArray[] = {2, 1, 1, 2, 1};
		int result = comp.calculateSum(splitArray);
		assertEquals(-1, result);
	}
	
	@Test
	public void calculateSumTest2() {
		Computation comp = new Computation();	
		int splitArray[] = new int[0];
		AssertionError exception = assertThrows(AssertionError.class, () -> comp.calculateSum(splitArray));
		assertEquals("Cannot Compute on empty array", exception.getMessage());
		
	}
	

}
