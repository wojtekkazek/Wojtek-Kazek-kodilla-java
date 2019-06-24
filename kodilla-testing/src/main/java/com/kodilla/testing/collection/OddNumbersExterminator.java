package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> oddNumbers = new ArrayList<>();

        for (int n : numbers) {
            if (n % 2 == 0) {
                oddNumbers.add(n);
            }
        }

        return oddNumbers;

    }
}
