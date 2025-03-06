public class Imp_PermuteStr {
    public static void main(String[] args) {
        String s = "abb";
        printPermute(s, "");
    }

    static void printPermute(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            printPermute(remaining, ans + ch); // abb abb bab bba bab bba
        }
    }
}
