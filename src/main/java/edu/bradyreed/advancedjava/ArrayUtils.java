/**
 * @author Brady Reed <Brady_Reed@student.uml.edu>
 * Created for Umass Lowell INFO2970
 * Re-purposed for INFO3030 to demonstrate DI with maven and simple jUnit tests
 * 
 */
package edu.bradyreed.advancedjava;

import edu.bradyreed.advancedjava.exception.BadArrayException;


public class ArrayUtils {
    
    /** Static method searches its parameter array to locate the minimum
     value, and returns it. */
    public static int minValue(int[] list) throws BadArrayException {
         
        if (list == null)
            throw new BadArrayException("Array is Null");
        if (list.length == 0)
            throw new BadArrayException("Array is empty");
        
        int idx = 0;
        int lowest = list[0];
        
        if (list.length == 1)
            return list[0];
        else {
            do {
                int next;
                next = list[idx + 1];

                if (lowest > next)
                    lowest = next;
                idx++;
            } while (idx < (list.length - 1));
        }
        return lowest;           
    }
    
    /** 
     * Static method copies the specified range of elements from the parameter 
     * array into a new array, and returns it.
     */
    public static int[] copyRange(int[] list, int startIndex) throws BadArrayException{
        if (list == null)
            throw new BadArrayException("Array is Null");
        if (startIndex > list.length || startIndex < 0)
            throw new ArrayIndexOutOfBoundsException(startIndex);
        
        // start loop/array position at startIndex & Initialize the copy array
        int[] copyList = new int[list.length - startIndex];
        int copyValue;
        if (startIndex == list.length)
            return copyList;
        
        for(int idx = 0; idx < copyList.length; idx++) {
            copyValue = list[startIndex + idx];  
            copyList[idx] = copyValue;
        }
        
        return copyList;
    }
    
    /**
     * Static method searches its parameter array to locate the first 
     * occurrence of the parameter searchValue, and returns its index position
     * if found, or -1 if not found
    */
    public static int indexOf(int[] list, int searchValue) throws BadArrayException {
        if (list == null)
            throw new BadArrayException("Array is Null");
        if (list.length == 0) 
            return -1;  
        
        int idx = 0;
        do {
            if (list[idx] == searchValue)
                return idx;
            idx++;
        } while (idx < list.length);
        
        return -1;
    }
    
    /** Static method searches its parameter array to locate the last occurrence 
        of the parameter searchValue, and returns its index position if found,
        or -1 if not found
     */
    public static int lastIndexOf(int[] list, int searchValue) throws BadArrayException {
        if (list == null)
            throw new BadArrayException("Array is Null");
        if (list.length == 0) 
            return -1;
        
        int lastPosition = 0;
        boolean found = false;
        
        int idx = 0;
        do {
            if (list[idx] == searchValue) {
                lastPosition = idx;
                found = true;
            }
            idx++;
        } while (idx < list.length);
        
        if (found)
            return lastPosition;
        else
            return -1;
    }
     
}
