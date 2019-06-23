package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(List<Integer> numbers) {

        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int n : numbers) {
            if (numbers.get(n) % 2 == 0) {
                oddNumbers.add(numbers.get(n));
            }
        }

        return oddNumbers;

    }
}
