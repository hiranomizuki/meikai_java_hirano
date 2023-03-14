package Enshu4_3;
import java.util.Scanner;
public class Enshu4_3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int max;
		int min;
		
		do {
			System.out.print("整数A：");
			
			max = stdIn.nextInt();
			
		}while(max<0);

		do {
			System.out.print("整数B：");
			min = stdIn.nextInt();
			
		}while(min<0);
		
		int compare;
		
		if(max<min) {
			compare =max;
			max = min;
			min = compare;
			
		}

		while(min<=max) {
			System.out.print(max);
			max--;
		}
		
		
		
	}
	

	
}
