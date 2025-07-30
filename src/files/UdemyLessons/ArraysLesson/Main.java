package files.UdemyLessons.ArraysLesson;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int[] reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        int temp;
        while (end > start) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String... ignoredArgs) {
        Random rand = new Random();
        int[] randomArr = new int[10];
        for(int i = 0; i < randomArr.length; i++){
            randomArr[i] = rand.nextInt(10);
        }
        String normalArr = Arrays.toString(randomArr);
        System.out.println("Normal Array: " + normalArr);

        int[] reversedArr = reverse(randomArr);
        System.out.println("Reversed Array: " + Arrays.toString(reversedArr));

    }
}
