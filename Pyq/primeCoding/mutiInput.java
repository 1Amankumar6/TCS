import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mutiInput {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    List<String> ans = new ArrayList<>();
    
    int totalFemale =0 ;
    int totalGrade = 0;

    while(n-- > 0) {
      String name = s.next();
      int age = s.nextInt();
      char grade = s.next().charAt(0);
      String gender = s.next();

      if(age > 20){
        ans.add(name);
      } 

      if(gender.equals("Female")){
        totalFemale++ ;
        totalGrade += grade;
      }
    }

    for(String name : ans){
      System.out.println(name);
    }

    double avg = totalFemale == 0 ? 0 :(double)totalGrade/totalFemale ; 
    System.out.println(avg);
  }
}
