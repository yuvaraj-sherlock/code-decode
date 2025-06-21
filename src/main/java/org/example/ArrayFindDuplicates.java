package org.example;

import java.util.Arrays;

public class ArrayFindDuplicates {
    public static void main(String[] args) {
        int[] inputArray = new int[] {111, 333, 555, 777, 333, 444, 555};

        //1st approach
        /*Set<Integer> set = new HashSet<>();
        for(int i : inputArray){
            if(!set.add(i))
                System.out.println("Duplicate element: "+i);
        }*/

        //2nd approach
        /*for(int i=0;i<inputArray.length;i++){
            for(int j=i+1;j<inputArray.length;j++){
                if(inputArray[i] == inputArray[j]){
                    System.out.println("Duplicate element: "+ inputArray[i]);
                }
            }
        }*/

        //3rd approach
        Arrays.sort(inputArray);
        System.out.println(Arrays.toString(inputArray));
        for(int i=0; i<inputArray.length-1;i++){
            if(inputArray[i] == inputArray[i+1]){
                System.out.println("Duplicate element: "+inputArray[i]);
            }
        }
    }
}
