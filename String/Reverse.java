// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Stack;

public class Reverse {
   public Reverse() {
   }

   public static void main(String[] var0) {
      String var1 = "hello";
      char[] var2 = new char[var1.length()];
      Stack var3 = new Stack();

      int var4;
      for(var4 = 0; var4 < var1.length(); ++var4) {
         var3.push(var1.charAt(var4));
      }

      for(var4 = 0; !var3.isEmpty(); var2[var4++] = (Character)var3.pop()) {
      }

      var1 = new String(var2);
      System.out.println(var1);
   }
}
