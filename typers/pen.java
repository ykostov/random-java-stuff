import java.util.Scanner;

class Pen extends Typers {
    public void TurnOn() {
        this.isThisOn = true;
    }

    public Boolean isThisOn() {
        return isThisOn;
    }

    public void Type(String color_input) {

        int ink = 20;
        String words;
        String color;        
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
            if (ink <= 0) {
                System.out.println("ink is empty");
                break;
            }

            words = type_scanner.nextLine();
            ink -= words.length();
            int var_to_substring_word = words.length() + ink;

            if (ink <= 0) {
                System.out.println(color + words.substring(0, var_to_substring_word) + "\u001B[0m");
                System.out.println("ink is empty(" + ink + ")");
                break;
            }

            System.out.println(color + words + "\u001B[0m");

        }

    }
}