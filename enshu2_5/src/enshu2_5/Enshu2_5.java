package enshu2_5;

//二つの実数値を読み込み、その和と平均を求めて表示するプログラムを作成せよ。

import java.util.Scanner;
public class Enshu2_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("xの値：");
		double x = stdIn.nextDouble();
		
		System.out.print("yの値：");
		double y = stdIn.nextDouble();
		
		System.out.println("合計は"+(x+y)+"です。");
		System.out.println("平均は"+(x+y)/2+"です。");
		
	}

}
