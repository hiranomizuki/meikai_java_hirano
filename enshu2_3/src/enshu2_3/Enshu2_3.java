package enshu2_3;

//キーボードから読み込んだ整数値をそのまま反復して表示するプログラムを作成せよ

import java.util.Scanner;
public class Enshu2_3 {

	public static void main(String[] args) {
		//Scannerインスタンス生成
		Scanner stdIn = new Scanner(System.in);
		
		//「整数値：」を出力
		System.out.print("整数値：");
		//キーボードからの入力値をxに格納
		int x = stdIn.nextInt();
		
		//キーボードからの入力値を出力
		System.out.println(x+"と入力しました。");
	}

}
