// Source code is decompiled from a .class file using FernFlower decompiler.
public class countVowelConst {
  public countVowelConst() {
  }

  public static void main(String[] var0) {
    String var1 = "Take u forward is Awesome";
    var1 = var1.toLowerCase();
    String var2 = "aeiou";
    int var3 = 0;
    boolean var4 = false;
    int var5 = 0;

    for (int var6 = 0; var6 < var1.length(); ++var6) {
      if (Character.isWhitespace(var1.charAt(var6))) {
        ++var5;
      }

      char[] var7 = var2.toCharArray();
      int var8 = var7.length;

      for (int var9 = 0; var9 < var8; ++var9) {
        char var10 = var7[var9];
        if (var10 == var1.charAt(var6)) {
          ++var3;
        }
      }
    }

    int var11 = var1.length() - var3 - var5;
    System.out.println("whiteSpace: " + var5 + ", Vowel: " + var3 + ", Constant " + var11);
  }
}
