package enshu3_1;
import java.util.Scanner;
public class Enshu3_1 {

	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値：");
		int i = stdIn.nextInt();
		
		if (i>=0)
			System.out.println("その絶対値は"+i+"です。");
		else if(i<0)
			System.out.println("その絶対値は"+(-i)+"です。");
	}

}
