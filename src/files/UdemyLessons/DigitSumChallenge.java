package files.UdemyLessons;

public class DigitSumChallenge {
    public static int sumDigits(int number) {
        if(number < 0){
            return -1;
        }
        int sum =  0;
        while(number > 10){
            sum = sum + number % 10;
            number = number / 10;
        }
        sum = sum + number;
        return sum;
    }

    public static void main() {
        System.out.println("The sum of digits in 1234 is " + sumDigits(1234));
    }
}
