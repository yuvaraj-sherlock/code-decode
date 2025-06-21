package org.example;

import java.util.*;

// This code finds the most frequent element in an array of integers.
// It uses a HashMap to count the frequency of each element and then determines which element has the highest frequency.
public class ArrayMostFrequentElement {
    public static void main(String[] args) {
        Integer[] ints = {4, 5, 8, 7, 4, 7, 6, 7};

        Map<Integer, Integer> map = new HashMap<>();

        for(Integer i : ints){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int element=0;
        int frequency=0;

        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer,Integer> entry : entrySet){
            if(entry.getValue()>frequency){
                element = entry.getKey();
                frequency = entry.getValue();
            }
        }
        System.out.println("Element: "+element + " with max frequency: "+frequency);
    }
}
