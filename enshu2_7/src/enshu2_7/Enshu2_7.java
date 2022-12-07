package enshu2_7;

/*以下に示すプログラムを生成せよ。
 ・1桁の正の整数値（すなわち1以上9以下の値）をランダムに生成して表示
 ・1桁の負の整数値（すなわち-9以上-1以下の値)をランダムに生成して表示
 ・2桁の正の整数値（すなわち10以上99以下の値）をランダムに生成して表示
*/

import java.util.Random;
public class Enshu2_7 {

	public static void main(String[] args) {
		
		//Randomインスタンス生成
		Random rand = new Random();
		
		//1桁の正の整数値をコンピュータに生成してもらい、positiveintegerに値を格納
		int positiveinteger = rand.nextInt(11)-1;
		//1桁の負の整数値をコンピュータに生成してもらい、negativeintegerに値を格納
		int negativeinteger = rand.nextInt(9)-9;
		//2桁の整数値をコンピュータに生成してもらい、twodigitsintegerに値を格納
		int twodigitsinteger = rand.nextInt(90)+10;
		
		//上記で格納した値を表示
		System.out.println("1桁の正の整数値："+positiveinteger);
		System.out.println("1桁の負の整数値："+negativeinteger);
		System.out.println("2桁の整数値："+twodigitsinteger);
	}

}
