import java.util.Scanner;

public class Watercolors extends Typers {
    public void TurnOn() {
        System.out.println("Watercolor activated");
    }

    public void Type(String color_input) {

        String color;
        int ink = 10;
        String words;
        Scanner type_scanner = new Scanner(System.in);

        // color switch

        switch (color_input) {
            case "red":
                color = ("\u001B[31m");
                break;
            case "green":
                color = ("\u001B[32m");
                break;
            case "yellow":
                color = ("\u001B[33m");
                break;
            case "blue":
                color = ("\u001B[34m");
                break;

            default:
                color = "";
                break;
        }

        // type loop

        while (true) {

            words = type_scanner.nextLine();

            // if vowel = -2, normal = -1

            for (int i = 0; i < words.length(); i++) {
                char vowel = words.charAt(i);
                if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
                    ink -= 2;
                }

                else {
                    ink--;
                }

            }
            if (ink <= 0) {
                int var_to_substring_word = (words.length() + ink);
                if (var_to_substring_word < 0) {
                    var_to_substring_word = 0;
                }
                System.out.println(color + words.substring(0, var_to_substring_word) + "\u001B[0m");
                System.out.println("ink is empty(" + ink + ")");
                break;
            } else {
                System.out.println(color + words + "\u001B[0m");
            }

        }
    }
}
