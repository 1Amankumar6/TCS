package pyq.primeCoding;
import java.util.*;
public class Reverse_array{
	public static void main(String[] args){	
		Scanner ss = new Scanner(System.in);
		String input = ss.nextLine();
		Scanner s = new Scanner(input);
		ArrayList<Integer> list = new ArrayList<>();
		while(s.hasNextInt()){
			list.add(s.nextInt());
		}
		Collections.sort(list, Collections.reverseOrder());
		int[] arr = list.stream().mapToInt(i -> i).toArray();
		System.out.println(Arrays.toString(arr));
	}
}
