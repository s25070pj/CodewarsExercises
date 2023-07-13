package kyu6;

import java.util.*;

public class BitCounting {
    // https://www.codewars.com/kata/526571aae218b8ee490006f4/train/java
    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }

    public static int countBits(int n){
        String binaryNumber = Integer.toBinaryString(n);
        List<String> list = new ArrayList<>(Arrays.asList(binaryNumber.split("")));

        int numberOfOnes = 0;
        for(int i = 0; i < list.size(); i++){
            if (list.get(i).equals("1")){

                numberOfOnes++;
            }
        }

        return numberOfOnes;
    }

}