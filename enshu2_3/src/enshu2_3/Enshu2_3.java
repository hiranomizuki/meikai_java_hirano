package enshu2_3;

//キーボードから読み込んだ整数値をそのまま反復して表示するプログラムを作成せよ

import java.util.Scanner;
public class Enshu2_3 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int x = stdIn.nextInt();
		
		System.out.println(x+"と入力しました。");
	}

}
