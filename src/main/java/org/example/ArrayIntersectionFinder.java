package org.example;

import java.util.*;

// find the common elements or intersection of two arrays in Java.
public class ArrayIntersectionFinder {
    public static void main(String[] args) {
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};


        // 1st approach
       /* List<String> list1 = Arrays.asList(s1);
        List<String> list2 = Arrays.asList(s2);
        Set<String> set = new HashSet<>();
        for(String str:list1){
            if(list2.contains(str)){
                set.add(str);
            }
        }
        System.out.println(set);*/

        // 2nd approach
        Set<String> set = new HashSet<>();
        for(int i=0;i<s1.length;i++){
            for(int j=0;j<s2.length;j++){
                if(s1[i].equals(s2[j])){
                    set.add(s1[i]);
                }
            }
        }
        System.out.println(set);


    }
}
