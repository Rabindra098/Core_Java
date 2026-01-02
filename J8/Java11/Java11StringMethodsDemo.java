package Java11;
public class Java11StringMethodsDemo {

    public static void main(String[] args) {

        // 1. isBlank()
        String str1 = "   ";
        System.out.println("isBlank(): " + str1.isBlank()); // true

        // 2. lines()
        String multiLine = "Java\nSpring\nBoot";
        System.out.println("\nlines():");
        multiLine.lines().forEach(System.out::println);

        // 3. strip(), stripLeading(), stripTrailing()
        String str2 = "   Hello Java   ";
        System.out.println("\nstrip(): '" + str2.strip() + "'");
        System.out.println("stripLeading(): '" + str2.stripLeading() + "'");
        System.out.println("stripTrailing(): '" + str2.stripTrailing() + "'");

        // 4. repeat()
        String str3 = "Java ";
        System.out.println("\nrepeat(): " + str3.repeat(10));
    }
}
