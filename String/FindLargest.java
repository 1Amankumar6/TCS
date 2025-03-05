// Source code is decompiled from a .class file using FernFlower decompiler.
public class FindLargest {
  public FindLargest() {
  }

  public static void main(String[] var0) {
    String var1 = "Google Doc";
    String[] var2 = var1.split("\\s+");
    int var3 = 0;
    String var4 = "";

    for (int var5 = 0; var5 < var2.length; ++var5) {
      if (var2[var5].length() > var3) {
        var3 = Math.max(var2[var5].length(), var3);
        var4 = var2[var5];
      }
    }

    System.out.println(var3);
    System.out.println(var4);
  }
}
