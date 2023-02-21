package ohira.study.project.hirano.program.q3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CenterValueAnswer {

	private final int GIVE_UP_VALUE = Integer.MIN_VALUE;
	
	public void execute() {
		
//		変数名
		Scanner stdIn = new Scanner(System.in);

//		変数名
		int a = 0;
		int b = 0;
		int c = 0;
		
//		try - catch 分けるべき
//		色々べた書き
		try {
			System.out.print("整数 A : ");
			a = stdIn.nextInt();
			
			System.out.print("整数 B : ");
			b = stdIn.nextInt();
			
			System.out.print("整数 C : ");
			c = stdIn.nextInt();
		}
//		他にも Exception 出ます。本来は、固有 Exception に入れて、メッセージ埋めて throw
		catch (InputMismatchException e) {
			System.err.println("整数だって言ってんじゃん。整数入れてくれないならもういい。");
			return;
		}
		finally {
			stdIn.close();
		}
		
//		変数名
		int mid = getCenterValue(a, b, c);
		
		if (GIVE_UP_VALUE == mid) {
			System.err.println("僕には中央値がわかりませんでした。許してください。");
		}
		
		System.out.println("中央値：" + mid);
	}
	
	private int getCenterValue(int a, int b, int c) {
//		else 文が消えています
		if ( isCenterA(a, b, c) ) {
			return a;
		}
		if ( isCenterB(a, b, c) ) {
			return b;
		}
		if ( isCenterC(a, b, c) ) {
			return c;
		}
		
		return GIVE_UP_VALUE;
		
	}
	
	private boolean isCenterA(int a, int b, int c) {
		return (b <= a && a <= c) || (c <= a && a <= b);
	}
	
	private boolean isCenterB(int a, int b, int c) {
		return (a <= b && b <= c) || (c <= b && b <= a);
	}
	
	private boolean isCenterC(int a, int b, int c) {
		return (a <= c && c <= b) || (b <= c && c <= a );
	}
	
	/*
	 * 解説：
	 * 
	 * ↑のプログラムは、大平修正版です。
	 * 	 * 
	 * 試しに下記３パターンでテストしてみてください。
	 * 
	 * パターン１：A = 3, B = 5, C = 4
	 * パターン２：A = 3, B = 3, C = 1
	 * パターン３：A = 3, B = b, C = 1
	 * 
	 * パターン２とパターン３はどうだった？期待通りの動作になったかな？
	 * 
	 * パターン２を満たすためには、条件式が < ではなく <= である必要があります。
	 * 元々の回答だと A, B, C にどれかが同じ値だったら・・・ということを考慮できてなかったんですね。
	 * 
	 * パターン３は、まだ教本に出てきてないこと（もしかしたらあの教本には出てこない？）
	 * だと思いますが、そもそも Java をやって、これ知らないとあり得ない状態になるので、
	 * せっかくだから話します。
	 * 
	 * パターン３は、ユーザーにイレギュラーな操作をされた時のことを考えられていません。
	 * ユーザーは、色んな人がいます。開発側が想定していない操作を、いくらでもしてきます。
	 * それを先読みして、システムエラーを起こさない（ユーザに見せない）ように
	 * 準備しておく必要があり、これを Java では例外処理といいます。
	 * 
	 * 詳しい話しは、口頭で補足します。
	 * 
	 */
}
