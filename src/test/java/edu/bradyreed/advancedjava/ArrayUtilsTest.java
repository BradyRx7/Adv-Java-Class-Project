package edu.bradyreed.advancedjava;

import static org.junit.Assert.*;
import org.junit.*;
        

import edu.bradyreed.advancedjava.exception.BadArrayException;

/**
 * @author Brady Reed <Brady_Reed@student.uml.edu>
 * Test Created for Umass Lowell INFO3030
 * ArrayUtils Re-purposed from INFO2970 
 * to demonstrate DI with maven and simple jUnit tests
 */

public class ArrayUtilsTest {
    // Total of 4 methods to test minValue, copyRange, lastIndexOf, and indexOf
    // First four tests are positive tests, next four are negative tests

    //Begin Positive Tests
    @Test
    public void testMinValue() {
        int[] testArray = {5,10,14,1,22,87,16,12,77,46,29,33,-9,17,87,77};
        int result = -9999;
        int expectedResult = -9;
        
        try {
        result = ArrayUtils.minValue(testArray);
        }
        catch (BadArrayException e) {
            fail("Bad Array exception thrown. Write better tests! lol");
        }
        
        assertEquals(expectedResult, result);       
    }
    
    @Test
    public void testCopyRange(){
        int[] testArray = {5,10,14,1,22,87,16,12,77,46,29,33,-9,17,87,77};
        int copyPosition = 5;
        int[] result = null;
        int[] expectedResult = {87,16,12,77,46,29,33,-9,17,87,77};
        
        try {
            result = ArrayUtils.copyRange(testArray, copyPosition);
        }
        catch (BadArrayException e) {
            fail("Bad Array exception thrown. Write better tests! lol");
        }
        
        assertArrayEquals( expectedResult, result );
    }
    
    @Test
    public void testIndexOf() {
        int[] testArray = {5,10,14,1,22,87,16,12,77,46,29,33,-9,17,87,77};
        int searchValue = 77;
        int result = -9999;
        int expectedResult = 8;
        
        try {
        result = ArrayUtils.indexOf(testArray, searchValue);
        }
        catch (BadArrayException e) {
            fail("Bad Array exception thrown. Write better tests! lol");
        }
        
        assertEquals(expectedResult, result);
    }
    
    @Test
    public void testLastIndexOf() {
        int[] testArray = {5,10,14,1,22,87,16,12,77,46,29,33,-9,17,87,77};
        int searchValue = 77;
        int result = -9999;
        int expectedResult = 15;
        
        try {
        result = ArrayUtils.lastIndexOf(testArray, searchValue);
        }
        catch (BadArrayException e) {
            fail("Bad Array exception thrown. Write better tests! lol");
        }
        
        assertEquals(expectedResult, result);
    }
    
    //Begin Negative Tests
    @Test(expected = BadArrayException.class)
    public void testExceptionMinValue() throws BadArrayException {
        int[] testArray = null;
        int result = -9999;
        
        result = ArrayUtils.minValue(testArray);
             
}
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testOutOfBoundsCopyRange(){
        int[] testArray = {5,10,14,1,22,87,16,12,77,46,29,33,-9,17,87,77};
        int copyPosition = 22;
        int[] result = null;
        int[] expectedResult = {87,16,12,77,46,29,33,-9,17,87,77};
        
        try {
            result = ArrayUtils.copyRange(testArray, copyPosition);
        }
        catch (BadArrayException e) {}
    }
    
    @Test
    public void testNotInArrayIndexOf() {
        int[] testArray = {5,10,14,1,22,87,16,12,77,46,29,33,-9,17,87,77};
        int searchValue = 462;
        int result = -9999;
        int expectedResult = -1;
        
        try {
        result = ArrayUtils.indexOf(testArray, searchValue);
        }
        catch (BadArrayException e) {
            fail("Bad Array exception thrown. Write better tests! lol");
        }
        
        assertEquals(expectedResult, result);
    }
    
    @Test
    public void testNotInArrayLastIndexOf() {
        int[] testArray = {5,10,14,1,22,87,16,12,77,46,29,33,-9,17,87,77};
        int searchValue = 462;
        int result = -9999;
        int expectedResult = -1;
        
        try {
        result = ArrayUtils.lastIndexOf(testArray, searchValue);
        }
        catch (BadArrayException e) {
            fail("Bad Array exception thrown. Write better tests! lol");
        }
        
        assertEquals(expectedResult, result);
    }
    
}
