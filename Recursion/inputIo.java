package TCS.Recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputIo {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a string: ");
    String str = br.readLine();

    System.out.println("Enter a Integer");
    int num = Integer.parseInt(br.readLine());

    System.out.println("Enter a float: ");
    float f = Float.parseFloat(br.readLine());

    System.out.println("String: "+str);
    System.out.println("Integer: "+num);
    System.out.println("Float: "+f);
  }
}
