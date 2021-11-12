import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Magpie magpie = new Magpie();

    System.out.println(magpie.getGreeting());
    Scanner in = new Scanner (System.in);
    String statement = in.nextLine();

    while (!statement.equals("Bye")) {
      System.out.println(magpie.getResponse(statement));
      statement = in.nextLine();
    }
    System.out.println("Goodbye!");
  }
}