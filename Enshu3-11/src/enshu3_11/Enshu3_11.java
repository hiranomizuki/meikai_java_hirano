package enshu3_11;
import java.util.Scanner;
public class Enshu3_11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数A：");
		int a = stdIn.nextInt();
		
		System.out.print("整数B：");
		int b = stdIn.nextInt();	
		
		System.out.println((a-b<=10)?"それらの差は10以下です。":"それらの差は11以上です。");
	}

}
