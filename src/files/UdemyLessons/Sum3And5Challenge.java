package files.UdemyLessons;

public class Sum3And5Challenge {
    public static void main(String[] ignores) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                count++;
            }
            if (count == 5){
                break;
            }

        }
    }
}
