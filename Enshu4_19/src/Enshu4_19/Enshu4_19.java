package Enshu4_19;
import java.util.Scanner;

public class Enshu4_19 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int month = 0;
		
		System.out.println("季節を求めます。何月ですか？");
		
		do {
		month = stdIn.nextInt();
		
		if ( 3 <= month && month <= 5) {
			System.out.println("それは春です");
		}
		else if (6 <= month && month <= 8) {
			System.out.println("それは夏です");
		}
		else if( 9 <= month && month <=11) {
			System.out.println("それは秋です");
		}
		else if(month == 12 || month ==1 || month ==2) {
			System.out.println("それは冬です");
		}else {
			System.out.println("もう一度入力してください。");
		}
		}while(month < 1 || month >12);

	}
}
