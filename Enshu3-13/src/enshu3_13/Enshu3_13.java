package enshu3_13;

//3つの整数値の中央値を求めて表示する問題

import java.util.Scanner;
public class Enshu3_13 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数A：");
		int a = stdIn.nextInt();
		
		System.out.println("整数B：");
		int b = stdIn.nextInt();

		System.out.println("整数C：");
		int c = stdIn.nextInt();
		
		
		int min = a;
		if (b<min)
			min=b;
		if (c<min)
			min=c;
		
		int max = a;
		if (b>max)
			max=b;
		if (c>max)
			max=c;
		
		int mid = a;
		if(min!=b && max!=b)
			mid =b;
		if(min!=c && max !=c)
			mid=c;
		
		System.out.println("中央値："+mid);
		
		
	}

}
