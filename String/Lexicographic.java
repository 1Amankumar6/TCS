// Source code is decompiled from a .class file using FernFlower decompiler.
public class Lexicographic {
  public Lexicographic() {
  }

  public static void main(String[] var0) {
    String var1 = "abcdxyz";
    StringBuffer var2 = new StringBuffer();

    int var3;
    for (var3 = 0; var3 < var1.length(); ++var3) {
      int var4 = var1.charAt(var3) + 1;
      var2.append((char) var4);
    }

    for (var3 = 0; var3 < var2.length(); ++var3) {
      if (var2.charAt(var3) == '{') {
        var2.setCharAt(var3, 'a');
      }
    }

    System.out.println(var2);
  }
}
