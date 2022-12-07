package enshu2_2;

//3つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ。

public class Enshu2_2 {

	public static void main(String[] args) {
		// 変数x,y,zの型を定義
		int x;
		int y;
		int z;
		
		//x,y,zに値を代入
		x=12;
		y=24;
		z=36;
		
		//3つの値の合計、平均を求め、出力
		System.out.println("3つの値の合計は"+(x+y+z)+"です。");
		System.out.println("3つの値の平均は"+(x+y+z)/3+"です。");
		
	}

}
