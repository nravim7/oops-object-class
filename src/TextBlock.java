public class TextBlock {
    public static void main(String[] args) {

        String textBlock = """
                Print a Bulleted list:
                    \u2022 First Point
                    \u2022 Sub Point""";

        System.out.println(textBlock);

        int age = 5;
        //System.out.printf("Your age is %d\n", age);
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2023 - age;
        //System.out.printf("Age = %d, Birth year = %d", age, yearOfBirth);
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age);



        for (int i = 1; i <= 1000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Yor age is %d", age);
        System.out.println(formattedString);
    }

}
