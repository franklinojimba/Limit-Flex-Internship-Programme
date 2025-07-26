package files.UdemyLessons.StringFormatting;

public class Main {

    public static void main() {

        String bulletIt = """
                Print a bulleted list
                    •first line
                        •line2
                """;
        System.out.println(bulletIt);
        int year = 2020;
        System.out.printf("The year is %d\n", year);

        String string2 = "Lexus";
        int length = string2.length();

        System.out.printf("The length is %c\n", string2.charAt(length - 1));

        StringBuilder builder = new StringBuilder("LaGrange");
        System.out.println(builder.reverse());
    }
}
