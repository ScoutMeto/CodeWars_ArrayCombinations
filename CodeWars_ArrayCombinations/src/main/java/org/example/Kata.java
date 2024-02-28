package org.example;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.*;

public class Kata {
    public static int solve(final List<List<Integer>> data) {

        //variable for counting total number of combinations
        int totalCombinations = 1;

        /*
        First step - loop for checking duplicity in any array.
        Get new set of arrays without duplicates.
            -solved using HashSet and retranslate to ArrayList
            -after each iteration saving new set do the new list (dataWithoutDuplicities)
         */
        List<List<Integer>> dataWithoutDuplicities = new ArrayList<>();

        for (List<Integer> particularData : data) {
            Set<Integer> set = new HashSet<>(particularData);
            List<Integer> uniqueDataSet = new ArrayList<>(set);
            dataWithoutDuplicities.add(uniqueDataSet);
        }

        //Second step - combine valid data and count like success if unique set of three is available
        for (List<Integer> checkedList : dataWithoutDuplicities) {
            totalCombinations *= checkedList.size();
        }

        //Third step - statement/return
        return totalCombinations;

    }

}
