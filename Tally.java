import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Tally{
	public static void main(String args[]){
		System.out.println("Input Tally Sequence");
		Scanner in = new Scanner(System.in);
		String tallSeq = in.next();
		System.out.println("Sequence:" + " " + tallSeq);
		tallyUp(tallSeq);
	}
	
	public static void tallyUp(String seq){
		player[] arr = new player[5];
		arr[0] = new player('a', 0);
		arr[1] = new player('b', 0);
		arr[2] = new player('c', 0);
		arr[3] = new player('d', 0);
		arr[4] = new player('e', 0);
		
		for(int i = 0; i < seq.length(); i++){
			switch(seq.charAt(i)){
			case 'a': arr[0].points++;
				break;
			case 'b': arr[1].points++;
				break;
			case 'c': arr[2].points++;
				break;
			case 'd': arr[3].points++;
				break;
			case 'e': arr[4].points++;
				break;
			case 'A': arr[0].points--;
				break;
			case 'B': arr[1].points--;
				break;
			case 'C': arr[2].points--;
				break;
			case 'D': arr[3].points--;
				break;
			case 'E': arr[4].points--;
				break;
			}
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int j = 0; j < 5; j++) {
			if(j == 4) {
				System.out.print(arr[j].name + ":" + arr[j].points);
			}else {
				System.out.print(arr[j].name + ":" + arr[j].points + ", ");
			}
		}
		
	}
}


