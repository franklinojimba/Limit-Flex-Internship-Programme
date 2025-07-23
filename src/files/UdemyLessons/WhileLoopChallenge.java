package files.UdemyLessons;

public class WhileLoopChallenge {
    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static void main() {
       int number = 4;
       int stop_number = 20;
       int count_even = 0;
       int count_odd = 0;
       while (number <= stop_number) {
           number++;
           if (isEvenNumber(number)) {
               System.out.println(number + " is an even number.");
               count_even ++;
           }
           else{
               count_odd++;
           }
       }
       System.out.println("The amount of even numbers found is " + count_even);
        System.out.println("The amount of odd numbers found is " + count_odd);
    }
}
