package enshu2_4;

//キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力するプログラムを作成せよ。

import java.util.Scanner;
public class Enshu2_4 {

	public static void main(String[] args) {
		
		//Scannerインスタンス生成
		Scanner stdIn = new Scanner(System.in);
		
		//整数値の入力欄を出力
		System.out.print("整数値：");
		//キーボードから入力された値をxに格納
		int x = stdIn.nextInt();
		
		//xに10を加減した値をそれぞれ出力
		System.out.println("10を加えた値は"+(x+10)+"です。");
		System.out.println("10を減じた値は"+(x-10)+"です。");
	}

}
