package Rev;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "Hello World";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder rev = new StringBuilder(word);
            result.append(rev.reverse()).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
