public class sumNumberStrings {
  public static void main(String[] args) {
    String str = "4PREP2INSTAA6" ;
    int sum = 0 ;
    for(char ch : str.toCharArray()){
      if(Character.isDigit(ch)){
        sum += Character.getNumericValue(ch);
      }
    }
    System.out.println(sum);
  }
}
