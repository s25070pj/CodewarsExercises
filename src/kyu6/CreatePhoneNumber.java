package kyu6;

public class CreatePhoneNumber {
    //https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java
    public static String createPhoneNumber(int[] numbers) {
        String numberPhone = "(";

        numberPhone = numberPhone + numbers[0] + numbers[1] + numbers[2] + ") " + numbers[3] + numbers[4] + numbers[5] + "-" + numbers[6] + numbers[7] + numbers[8] + numbers[9];

        return numberPhone;
    }
}
