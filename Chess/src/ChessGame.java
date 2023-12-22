import java.util.Scanner;
import javax.swing.*;
public class ChessGame {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Game a = new Game();
      String x;
      
      JFrame Frame = new JFrame("This is a frame");
      Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //Frame.add(ui);
      Frame.setSize(500, 500);
      Frame.setVisible(true);

      System.out.println("Welcome To ProtoChess, choose your piece");
         x = input.nextLine();
         if(x.equalsIgnoreCase("Nej")) {
            System.out.println("Bruh moment");
         } else {
            System.out.println("Ayy lmao");
         }

      System.out.println(a.Distance(5, 1));
      a.Move(2,2);
      System.out.println("X-coordinate: "+ a.getX() + " Y-coordinate: " + a.getY());

   }

}
