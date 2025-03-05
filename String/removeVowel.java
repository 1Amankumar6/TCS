// Source code is decompiled from a .class file using FernFlower decompiler.
public class removeVowel {
  public removeVowel() {
  }

  public static void removeAllSpace() {
    String var0 = "Take you forward";
    var0 = var0.replaceAll("\\s+", "");
    System.out.println(var0);
  }

  public static void main(String[] var0) {
    String var1 = "take u forward";
    StringBuilder var2 = new StringBuilder();
    char[] var3 = var1.toCharArray();
    int var4 = var3.length;

    for (int var5 = 0; var5 < var4; ++var5) {
      char var6 = var3[var5];
      if (var6 != 'a' && var6 != 'e' && var6 != 'i' && var6 != 'o' && var6 != 'u') {
        var2.append(var6);
      } else {
        var2.append("");
      }
    }

    System.out.println(var2.toString());
    removeAllSpace();
  }
}
