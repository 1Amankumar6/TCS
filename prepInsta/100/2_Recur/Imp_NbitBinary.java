public class Imp_NbitBinary {
  public static void printRec(String number , int extraOnes, int remPlace){
    if(0 == remPlace){
      System.out.print(number + " ");
      return ;
    }
    printRec(number+"1", extraOnes+1, remPlace-1);
    if(0<extraOnes)
      printRec(number+"0", extraOnes-1, remPlace-1);
  }
  static void printNums(int n){
    String str = "";
    printRec(str, 0, n);
  }
  public static void main(String[] args){
    int n = 5 ;
    printNums(n);
  }
}
