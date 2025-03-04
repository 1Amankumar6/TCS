import java.util.Scanner;

public class Quadrant {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int x = s.nextInt();
    int y = s.nextInt();

    if (x > 0 && y > 0)
      System.out.println("Quardant I");
    else if (x < 0 && y > 0)
      System.out.println("Quardant II");
    else if (x > 0 && y < 0)
      System.out.println("Quardant III");
    else if (x > 0 && y > 0)
      System.out.println("Quardant IV");
    else if (x == 0 && y == 0)
      System.out.println("Origin");
    else if (y == 0 && x != 0)
      System.out.println("X-axis");
    else if (x == 0 && y != 0)
      System.out.println("Y-axis");
  }
}
