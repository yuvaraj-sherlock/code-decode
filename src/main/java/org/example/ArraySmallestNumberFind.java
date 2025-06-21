package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 * Utility class to find the smallest and second smallest numbers in an array.
 */
public class ArraySmallestNumberFind {
    /**
     * The main method demonstrates how to find the smallest and second smallest numbers
     * in an array of integers. It removes duplicates, sorts the numbers, and prints the results.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Integer[] integers = {-9, 3, 36, -25, -9, 71, 0};
        List<Integer> list = new ArrayList<>(new TreeSet<>(Arrays.asList(integers)));

        System.out.println("Smallest number: "+list.get(0));
        System.out.println("Second Smallest number: "+list.get(1));
    }
}
