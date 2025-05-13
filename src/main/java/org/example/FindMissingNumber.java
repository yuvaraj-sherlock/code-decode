package org.example;

import java.util.Arrays;
import java.util.List;

public class FindMissingNumber {

    public static Integer findMissingNumber(List<Integer> list){
        Integer[] array = list.toArray(new Integer[0]);
        System.out.println("Given Numbers: "+ Arrays.toString(array));
        int n = array.length;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int i:array){
            actualSum += i;
        }
        return expectedSum-actualSum;
    }
}
