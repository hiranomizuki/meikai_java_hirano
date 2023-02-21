package ohira.study.project.hirano.program.q3;

import java.util.Scanner;

public class CenterValueQuestion {

	public void execute() {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数 A : ");
		int a = stdIn.nextInt();
		
		System.out.print("整数 B : ");
		int b = stdIn.nextInt();
		
		System.out.print("整数 C : ");
		int c = stdIn.nextInt();
		
		// これ話すの忘れてた
		stdIn.close();
		
		int mid = 0;
		if ( (b < a && a < c) || (c < a && a < b) ) {
			mid = a;
		}
		else if ( (a < b && b < c) || (c < b && b < a) ) {
			mid = b;
		}
		else if ( (a < c && c < b) || (b < c && c < a ) ) {
			mid = c;
		}
		
		System.out.println("中央値：" + mid);
	}

	/*
	 * 解説：
	 * 
	 * ↑のプログラムは、昨日やろうとしてたことを少し書き方変えただけです。
	 * 一見すると要件を満たしているように見えます。
	 * 
	 * 試しに下記３パターンでテストしてみてください。
	 * 
	 * パターン１：A = 3, B = 5, C = 4
	 * パターン２：A = 3, B = 3, C = 1
	 * パターン３：A = 3, B = b, C = 1
	 * 
	 * パターン２とパターン３はどうだった？期待通りの動作になったかな？
	 */
	
}
