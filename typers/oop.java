import java.util.Scanner;

class Oop 
{
    public static void main(String[] args) 
    {        

        String color_input;
        String user_input;

        // init scanner
        Scanner first_scanner = new Scanner(System.in);
        System.out.println("Enter 'watercolor' or 'pen'");
        user_input = first_scanner.nextLine();
        
        // user_inputs 

        if (user_input.toLowerCase().startsWith("pen")) {
            // pen stuff

            Pen p1 = new Pen();
            System.out.println("Choose color - 'red', 'green', 'blue', 'yellow'");
            color_input = first_scanner.nextLine();

            p1.TurnOn();
            p1.Type(color_input);
        }

        if (user_input.toLowerCase().startsWith("test")) {
            // pen stuff

            Pen p1 = new Pen();
            p1.TurnOn();
            System.out.println(p1.isThisOn);
        }

        if (user_input.toLowerCase().startsWith("water")) 
        {
            // watercolor stuff

            Watercolors wc1 = new Watercolors();
            System.out.println("Choose color - 'red', 'green', 'blue', 'yellow'");
            color_input = first_scanner.nextLine();            
            
            wc1.TurnOn();
            wc1.Type(color_input);
        }
        
       
    }
}

abstract class Typers 
{
    abstract void TurnOn();   
    abstract void Type(String color_input);
    public boolean isThisOn = false;
}


