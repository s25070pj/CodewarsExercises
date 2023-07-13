package kyu6;

import java.util.Arrays;

public class FindUniqueValueInArray {
    // https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java

    public static void main(String[] args) {

    }

    public static double findUniq(double arr[]){
        for (int i = 0; i<arr.length-1; i++){
            if (arr[i] != arr[i+1]){
                if(arr[i] == arr[i+2]){
                    return arr[i+1];
                }else return arr[i];

            }
        }

        return 0;
    }
}


