package _03_Sorting_With_Streams;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

/*
 * Use streams to complete both sort methods:
 * 1. Sort the array from smallest to largest
 *    Use the .toArray() stream method to return an array
 * 2. Sort the list alphabetically from a -> z.
 *    Use the .collect(Collectors.toList()) stream method to return a list
 */
public class StreamSorter {

    int[] sortArray(int[] arr) {
    	List<Integer> list = new ArrayList<Integer>();
    	 Arrays.stream(arr).sorted().forEach((num) -> list.add(num));
    		for (int i =0; i < list.size(); i++) { 
    			arr[i] = list.get(i);
    	 }
        return arr;
    }

    List<String> sortList(List<String> list) {
    	List<String> returnList = new ArrayList<String>();
    	 list.stream().sorted((item1, item2) -> item1.compareTo(item2))
         .forEach((item) -> returnList.add(item));
        return returnList;
    }
    
    // =================== DO NOT MODIFY THE CODE BELOW ======================
    
    @Test
    void TestSort1(){
        // 50 random ints from 0 to 100
        int[] nums = new Random().ints(50, 0, 101)
                                 .toArray();
        
        nums = sortArray(nums);
        
        Arrays.stream(nums).forEach((i) -> System.out.print(i + " "));
        
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i + 1] ) {
                System.err.println("nums[" + i + "] = " + nums[i] + "> nums[" + (i+1) + "]");
                assertTrue(false);
            }
        }
    }

    @Test
    void TestSort2(){
        List<String> list = Stream.of("these", "are", "just", "some", "random", "strings")
                                  .collect(Collectors.toList());
        
        list = sortList(list);
        System.out.println();
        System.out.println(list);
        
        assertEquals(list.get(0), "are");
        assertEquals(list.get(1), "just");
        assertEquals(list.get(2), "random");
        assertEquals(list.get(3), "some");
        assertEquals(list.get(4), "strings");
        assertEquals(list.get(5), "these");
    }
}
