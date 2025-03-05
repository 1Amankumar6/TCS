// Source code is decompiled from a .class file using FernFlower decompiler.
public class RemoveCharExceptAlpha {
  public RemoveCharExceptAlpha() {
  }

  public static void main(String[] var0) {
    String var1 = "take12% *&u ^$#forward";
    StringBuilder var2 = new StringBuilder();
    char[] var3 = var1.toCharArray();
    int var4 = var3.length;

    for (int var5 = 0; var5 < var4; ++var5) {
      char var6 = var3[var5];
      if (Character.isAlphabetic(var6) || Character.isWhitespace(var6)) {
        var2.append(var6);
      }
    }

    System.out.println(var2.toString());
  }
}
