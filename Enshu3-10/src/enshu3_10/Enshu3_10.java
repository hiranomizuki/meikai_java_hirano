package enshu3_10;
import java.util.Scanner;
public class Enshu3_10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数A:");
		int a = stdIn.nextInt();
		System.out.print("整数B:");
		int b = stdIn.nextInt();

		System.out.println("2つの値の差は"+(a<b?b-a:a-b)+"です。");
		
	}

}
