package kyu6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitStrings {
    // https://www.codewars.com/kata/515de9ae9dcfc28eb6000001/train/java
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("hello")));
    }

    public static String[] solution(String s) {
        if (s.length() % 2 != 0) {
            s += "_";
        }

        String[] array = new String[s.length()/2];
        int iter = 0;
        System.out.println(s    );

        for (int i = 0; i < s.length(); i+=2) {
            array[iter] = s.substring(i, i+2);
            iter++;
        }
        return array;
    }
}