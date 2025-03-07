public class checkVowel_Const {
  public static void main(String[] args) {
    String str = "Aman kumar is a good boy";
    int vowel = 0;
    int whiteSpace = 0;
    int constant = 0;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowel++;
      } else {
        constant++;
      }
      if (Character.isWhitespace(ch)) {
        whiteSpace++;
      }
    }
    System.out.println("Constant: " + constant + ", Vowel: " + vowel + ", WhiteSpace: " + whiteSpace);
  }
}
