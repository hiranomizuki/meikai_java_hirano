package enshu2_10;
import java.util.Scanner;
public class Enshu2_10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("姓：");
		String sei = stdIn.nextLine();
		System.out.print("名：");
		String mei = stdIn.nextLine();
		
		System.out.println("こんにちは"+sei+mei+"さん。");

	}

}
