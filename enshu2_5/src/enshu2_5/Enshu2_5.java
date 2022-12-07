package enshu2_5;

//二つの実数値を読み込み、その和と平均を求めて表示するプログラムを作成せよ。

import java.util.Scanner;
public class Enshu2_5 {

	public static void main(String[] args) {
		//Scannerインスタンス生成
		Scanner stdIn = new Scanner(System.in);
	
		//xの値の入力を促す文字を出力
		System.out.print("xの値：");
		//xに実数値を入力してもらう
		double x = stdIn.nextDouble();
		
		//yの値の入力を促す文字を出力
		System.out.print("yの値：");
		//yに実数値を入力してもらう
		double y = stdIn.nextDouble();
		
		//xとyの値の合計値、平均値を計算しそれぞれ出力
		System.out.println("合計は"+(x+y)+"です。");
		System.out.println("平均は"+(x+y)/2+"です。");
		
	}

}
