// Source code is decompiled from a .class file using FernFlower decompiler.
public class removeBracket {
  public removeBracket() {
  }

  public static void main(String[] var0) {
    String var1 = "a+((b-c)+d)";
    StringBuilder var2 = new StringBuilder();

    for (int var3 = 0; var3 < var1.length(); ++var3) {
      if (var1.charAt(var3) != ')' && var1.charAt(var3) != '(') {
        var2.append(var1.charAt(var3));
      }
    }

    System.out.println(var2.toString());
  }
}
