// Source code is decompiled from a .class file using FernFlower decompiler.
public class SumNumber {
  public SumNumber() {
  }

  public static void main(String[] var0) {
    String var1 = "123xyz";
    StringBuilder var2 = new StringBuilder();
    char[] var3 = var1.toCharArray();
    int var4 = var3.length;

    for (int var5 = 0; var5 < var4; ++var5) {
      char var6 = var3[var5];
      if (Character.isDigit(var6)) {
        var2.append(var6);
      }
    }

    System.out.println(var2);
  }
}
