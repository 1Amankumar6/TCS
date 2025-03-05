
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeating {
  public NonRepeating() {
  }

  public static void main(String[] var0) {
    String var1 = "google";
    LinkedHashMap var2 = new LinkedHashMap();
    char[] var3 = var1.toCharArray();
    int var4 = var3.length;

    int var6;
    for (int var5 = 0; var5 < var4; ++var5) {
      var6 = var3[var5];
      var2.put(Character.valueOf((char) var6), (Integer) var2.getOrDefault(Character.valueOf((char) var6), 0) + 1);
    }

    boolean var7 = true;
    Iterator var8 = var2.entrySet().iterator();

    while (var8.hasNext()) {
      Map.Entry var9 = (Map.Entry) var8.next();
      var6 = (Integer) var9.getValue();
      if (var6 == 1) {
        if (var7) {
          System.out.print(var9.getKey());
          var7 = false;
        } else {
          System.out.print(", " + String.valueOf(var9.getKey()));
        }
      }
    }

  }
}
