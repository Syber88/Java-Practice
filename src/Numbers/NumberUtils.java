package Numbers;

public class NumberUtils {

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
}