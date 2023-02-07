package enshu2_9;

import java.util.Random;

public class Enshu2_9 {

	public static void main(String[] args) {
		Random rand = new Random();
		double n = rand.nextDouble(1);
		double l = rand.nextDouble(10);
		double m = rand.nextDouble(3)-1;
		
		System.out.print("0.0以上1.0未満の実数値：");
		System.out.println(n);
		System.out.print("0.0以上10.0未満の実数値：");
		System.out.println(l);
		System.out.print("-1.0以上1.0未満の実数値：");
		System.out.println(m);
	}

}
