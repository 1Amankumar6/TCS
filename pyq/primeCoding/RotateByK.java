package pyq.primeCoding;
import java.util.*;
public class RotateByK{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = input.nextLine();
		System.out.println("Enter the value of K: ");
		int k = input.nextInt();
		Scanner ss = new Scanner(str);
		
		ArrayList<Integer> list = new ArrayList<>();
		while(ss.hasNextInt()){
			list.add(ss.nextInt());
		}
		int arr[] = list.stream().mapToInt(i->i).toArray();
		int n = arr.length ;
		int rotateArr[] = new int[arr.length];
		int index = 0;
		for(int i=k ; i<n ; i++){
			rotateArr[index++] = arr[i]; 	
		}
		for(int i=0 ; i<k ; i++){
			rotateArr[index++] = arr[i];
		}
		System.out.println(Arrays.toString(rotateArr));
	}
}