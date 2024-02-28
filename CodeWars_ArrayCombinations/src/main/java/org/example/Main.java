package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> data = new ArrayList<>();
        data.add(Arrays.asList(1, 2));
        data.add(Collections.singletonList(4));
        data.add(Arrays.asList(5, 6, 6, 6));
        data.add(Arrays.asList(5, 6, 8, 8));
        Kata.solve(data);
    }

    /*
    for test:
    import org.junit.Test;

    public class SampleTest {
        @Test
        public void basicTests() {
            Tester.doTest("[[1,2],[4],[5,6]]", 4);
            Tester.doTest("[[1,2],[4,4],[5,6,6]]", 4);
            Tester.doTest("[[1,2],[3,4],[5,6]]", 8);
            Tester.doTest("[[1,2,3],[3,4,6,6,7],[8,9,10,12,5,6]]", 72);
        }
    }
     */
}





/*
In this Kata, you will be given an array of arrays and your task will be to return the number of unique arrays that can be formed by picking exactly one element from each subarray.

For example: solve([[1,2],[4],[5,6]]) = 4, because it results in only 4 possibilites. They are [1,4,5],[1,4,6],[2,4,5],[2,4,6].

Make sure that you don't count duplicates; for example solve([[1,2],[4,4],[5,6,6]]) = 4, since the extra outcomes are just duplicates.

See test cases for more examples.

Good luck!

 */
