package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for(int n=0; n<numbers.size(); n++) {
            if(numbers.get(n) %2 ==0) {
                oddNumbers.add(numbers.get(n));
            }
        }

        return oddNumbers;

    }

}
