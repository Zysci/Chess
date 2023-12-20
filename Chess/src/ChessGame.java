import java.util.Scanner;
public class ChessGame {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Scanner tal = new Scanner(System.in);
      Pieces y = new Pieces();

      int Produkt;
      String x;
      Produkt = Pieces.piece(2,3);

      System.out.println("Welcome To ProtoChess, choose your piece");
         x = input.nextLine();
         if(x.equalsIgnoreCase("Nej")) {
            System.out.println("Bruh moment");
         } else {
            System.out.println("Ayy lmao");
         }
         
      System.out.println("Mata in två tal");
      System.out.println(Produkt);
      y.setName(x);
      System.out.println("lmao xd");
      System.out.println("eksde eksde");



   }

}
