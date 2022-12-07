package enshu2_1;

//List2-6(p.32)の2の箇所を、小数部をもつ実数地をxとyに代入するように変更して、
//その結果を考察せよ
public class Enshu2_1 {

	public static void main(String[] args) {
		// 以下、List-2-6の記載内容
		
		int x;
		int y;
		
		x=63;
		y=18;
		
		System.out.println("xの値は"+x+"です。");
		System.out.println("yの値は"+y+"です。");
		System.out.println("合計は"+(x+y)+"です。");
		System.out.println("平均は"+(x+y)/2+"です。");
		
//考察結果：xとyはint（整数型）で定義されているため、小数部をもつ値を代入するとエラーになる。

	}

}
