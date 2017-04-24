package com.algorithms.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {

    public static List<Integer> generate(int min, int max) {
        List<Integer> numbers = new ArrayList<Integer>();
        Random randomGenerator = new Random();
        for (int i = min; i <= max; i++) {
            numbers.add(randomGenerator.nextInt(max));
        }
        return numbers;
    }

    public static void main(String[] args) {

        System.out.println(generate(5, 10));
    }

}
