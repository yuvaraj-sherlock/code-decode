package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Program to reverse the given sentence
       /* String givenSentence = "hello welcome to spring world";
        String reverseSentence = SentenceReverse.reverseSentence(givenSentence);
        System.out.println(givenSentence);
        System.out.println(reverseSentence);*/

        //Program to find the first non-repeated char from the given string
        /*String givenInput = "success";
        Character firstUniqueChar = FirstUniqueChar.findFirstUniqueChar(givenInput);
        System.out.println(firstUniqueChar);*/

        //Program to Find the Missing Number from Array (0 to n)
        /*List<Integer> list = Arrays.asList(0,3,2,5,4,1);
        int missingNumber = FindMissingNumber.findMissingNumber(list);
        System.out.println(missingNumber);*/

        //Program to find the total number of subordinates (both direct and indirect) for any given manager
        String manager = "B";
        System.out.println("Manager: "+manager);
        System.out.println("Subordinates: ");
        int count = TeamSize.findTeamSize(manager);
        System.out.println();
        System.out.println("Total Subordinates: "+count);
    }
}