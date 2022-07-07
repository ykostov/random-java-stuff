import java.util.Scanner;

class Main {

  public static void penTyping(String type)
  {
    System.out.println(type);
 }


  public static void main(String[] args) {

    String user_input;    
    int ink = 30;      
    boolean is_pen_working = false;
    


      Scanner new_scanner = new Scanner(System.in); 


        System.out.println("Enter 'turn on' to start it. Ink - " + ink);
        user_input = new_scanner.nextLine();
        
        if (user_input.compareTo("turn on") == 0)
        {
          is_pen_working = true;
          System.out.println("now type!");
        }
      


        while(is_pen_working)
        {

          if (ink <= 0)
          {
            System.out.println("Out of ink!)");
            is_pen_working = false;
            break;
          }      
          
          user_input = new_scanner.nextLine();
          
          if (user_input.compareTo("exit") == 0)
          {
            is_pen_working = false;
          }
          else
          {        
            penTyping(user_input);
            ink -= user_input.length();          
          }
   

        }
      
  }
}
