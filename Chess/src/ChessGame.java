import java.util.Scanner;
public class ChessGame {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Scanner tal = new Scanner(System.in);
      Pieces y = new Pieces();
      Pieces a = new Pieces();

      String x;

      System.out.println("Welcome To ProtoChess, choose your piece");
         x = input.nextLine();
         if(x.equalsIgnoreCase("Nej")) {
            System.out.println("Bruh moment");
         } else {
            System.out.println("Ayy lmao");
         }

      y.setName(x);
      System.out.println(a.Distance(5, 1));
      a.Move(2,2);
     System.out.println("X-coordinate: "+ a.getNewX() + " Y-coordinate: " + a.getNewY());

   }

}
