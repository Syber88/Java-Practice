package Numbers;

import java.util.HashMap;
import java.util.*;

public class NumberUtils {

    public static int digitalRoot(int number){
        if (number < 9){
            return number;
        }
        String numbers = Integer.toString(number);
        int[] numberList = new int[numbers.length()];
        for (int i = 0; i < numbers.length(); i++){
            numberList[i] = Character.getNumericValue(numbers.charAt(i));
        }
    }

    public static boolean isNarcissistic(int number) {
        int power = String.valueOf(number).length();
        int sum = 0;
        String StrNum = String.valueOf(number);
        for (int i = 0; i < power; i++){
            int digit = Integer.parseInt(StrNum.substring(i, i + 1));
            sum += (int) Math.pow(digit, power);
        }
        return sum == number;
    }


    public static int findOddAppearance(int[] a) {
        /*Given an array of integers, find the one that appears an odd number of times.

        There will always be only one integer that appears an odd number of times.*/

        Map<Integer, Integer> nums = new HashMap<>();
        for (int number : a) {
            if (!nums.containsKey(number)){
                nums.put(number, 1);}
            else {
                nums.put(number, nums.get(number) + 1);
            }
        }

        for (int key : nums.keySet()){
            if (nums.get(key) % 2 != 0 )
                return key;

        }
        return -1;

    }

//    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
//
//    }
}