public class replaceWord {
  public static void main(String[] args) {
    // Custom string as input
    String str = "This is the prepinsta";
    // Word to be removed from above string
    String word = "the";
    // Calling the method 1 by passing both strings to it
    remove(str, word);
  }
  static void remove(String str, String word){
    String msg[] = str.split(" ");
    String new_str = "";
    
    for(String words : msg){
      if(!words.equals(word)){
        new_str +=words+" ";
      }
    }
    System.out.println(new_str);
  }
}
