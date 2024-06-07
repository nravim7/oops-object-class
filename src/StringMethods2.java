public class StringMethods2 {
    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex =  " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex)); //substring method

        System.out.println("Month =  " + birthDate.substring(3, 5));

        String newDate = String.join("/", "25", "11", "1982");  //join method
        System.out.println(newDate);

        newDate = "25".concat("/").concat("11").concat("/").concat("1982");     // concat method and Method chaining
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace("/", "-"));           //replace method
        System.out.println(newDate.replace("2", "00"));


        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "-----"));

        System.out.println("ABC\n".repeat(5));    //repeat method
        System.out.println("-".repeat(20));


        System.out.println("ABC\n".repeat(5).indent(8));    //indent method
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));

    }
}
