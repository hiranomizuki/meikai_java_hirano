package enshu2_8;

import java.util.Random;
import java.util.Scanner;
public class Enshu2_8 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		int x = rand.nextInt(11)-5;
		
		
		System.out.print("整数値：");
		int y = stdIn.nextInt();
		
		System.out.println("その値の±5の乱数を生成しました。それは"+(x+y)+"です。");
		
		
		
		

	}

}
