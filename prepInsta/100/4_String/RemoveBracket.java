public class RemoveBracket {
  public static void main(String[] args) {
    String str = "(a+b)=c";
    String removeBr = "";
    removeBr = str.replaceAll("[(){}]", removeBr);
    System.out.println(removeBr);
  }
}
