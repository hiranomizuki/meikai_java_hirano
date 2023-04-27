package Enshu4_11;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Enshu4_11 {

	public static void main(String[] args) {
		
		//カウントダウンのおわりが0じゃなくなったときにも対応できるように
		//standardnumberの変数をおく。（本当は外部ファイルが◎）
		int standardnumber =0;
		System.out.print(standardnumber+"までカウントダウンします。正の整数値を入力してください。");
		Scanner stdIn = new Scanner(System.in);
		
		int inputnumber=0;
		
		try {
			inputnumber = stdIn.nextInt();	
		} 
		//nextIntおせば、Exceptionの候補でてくる
		catch(InputMismatchException e) {
			System.err.print("値が不正です。範囲および型を確認してください。");
			return;
		} 
		catch(NoSuchElementException e) {
			System.err.print("値が不正です。範囲および型を確認してください。");
			return;
		} 
		catch(IllegalStateException e) {
			System.err.print("不正または不適切なときにメソッドが呼び出されています。");
			return;
		} 
		finally {
			stdIn.close();
		}

		int number;
		
		for(number = inputnumber ;number>=standardnumber;number--)	{
			System.out.println(number);
		}
	
	}	
}
