package kyu7;

import java.lang.reflect.Array;
import java.util.*;

public class HighestAndLowestFromString {
    //https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java
    public static void main(String[] args) {
        System.out.println(highAndLow("6 7 54 2 6 1"));
    }
    public static String highAndLow(String numbers) {
        String[] strArray = numbers.split(" ");
        int[] intArray = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++){
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        Arrays.sort(intArray);
       // System.out.println(Arrays.toString(strArray));
        return intArray[intArray.length-1] + " " + intArray[0];

    }
}
