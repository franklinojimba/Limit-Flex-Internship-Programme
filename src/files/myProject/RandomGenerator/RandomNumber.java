package files.myProject.RandomGenerator;

import java.util.Random;


public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100);
        System.out.println(x);
    }
}
