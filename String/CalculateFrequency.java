
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Iterator;
import java.util.TreeMap;

public class CalculateFrequency {
  public CalculateFrequency() {
  }

  public static void main(String[] var0) {
    String var1 = "takeuforward";
    TreeMap var2 = new TreeMap();
    char[] var3 = var1.toCharArray();
    int var4 = var3.length;

    for (int var5 = 0; var5 < var4; ++var5) {
      char var6 = var3[var5];
      var2.put(var6, (Integer) var2.getOrDefault(var6, 0) + 1);
    }

    Iterator var7 = var2.keySet().iterator();

    while (var7.hasNext()) {
      char var8 = (Character) var7.next();
      System.out.print("" + var8 + String.valueOf(var2.get(var8)) + " ");
    }

  }
}
