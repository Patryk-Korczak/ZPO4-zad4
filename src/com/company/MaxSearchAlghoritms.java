package com.company;

import java.util.ArrayList;

public class MaxSearchAlghoritms {

    public final int[] someTestNumbers = {4, 10, 3, 7, 4, 1, 6, 2};

    public ArrayList <Integer> scanLeftToRight (int[] numbers) {
        ArrayList <Integer> results = new ArrayList<>();
        int currentMax = numbers[0];
        results.add(currentMax);

        for(int currentNumber = 0; currentNumber < numbers.length; currentNumber++){
            if(numbers[currentNumber] > currentMax) {
                results.add(numbers[currentNumber]);
                currentMax = numbers[currentNumber];
            }
        }

        return results;
    }

    public ArrayList <Integer> scanRightToLeft (int[] numbers) {
        ArrayList <Integer> results = new ArrayList<>();
        int currentMax = numbers[numbers.length - 1];
        results.add(currentMax);

        for(int currentNumber = numbers.length - 1; currentNumber >= 0; currentNumber--){
            if(numbers[currentNumber] > currentMax) {
                results.add(numbers[currentNumber]);
                currentMax = numbers[currentNumber];
            }
        }

        return results;
    }

    public ArrayList <Integer> scanEvenThenOdd (int[] numbers) {
        ArrayList <Integer> results = new ArrayList<>();
        int currentMax = numbers[0];
        results.add(currentMax);

        for(int currentNumber = 0; currentNumber < numbers.length; currentNumber++){
            if(currentNumber % 2 == 0) {
                if(numbers[currentNumber] > currentMax) {
                    results.add(numbers[currentNumber]);
                    currentMax = numbers[currentNumber];
                }
            }

        }

        for(int currentNumber = 0; currentNumber < numbers.length; currentNumber++){
            if(currentNumber % 2 == 1) {
                if(numbers[currentNumber] > currentMax) {
                    results.add(numbers[currentNumber]);
                    currentMax = numbers[currentNumber];
                }
            }
        }

        return results;
    }

    public void placeholderMethod() {
        System.out.println("I don't do anything!");
    }


}
