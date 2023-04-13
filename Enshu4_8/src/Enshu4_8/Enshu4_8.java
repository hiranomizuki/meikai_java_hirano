package Enshu4_8;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Enshu4_8 {

	public static void main(String[] args) {
		
		System.out.print("整数値：");
		Scanner stdIn = new Scanner(System.in);
		
		int imputnumber;
		
		try {
			imputnumber = stdIn.nextInt();	
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
		
		int characterlength = 0;
		
		//10→定数final 変更しやすいように。 
		final int TEN=10;
		
		//入力値を10でわった値が1以上のときは1桁以上の値のはずなので、この条件式
		//1254/10=125.4 → 125.4/10=12.54 → 12.54/10=1.254 
		while(imputnumber / TEN >= 1) {
			characterlength ++;
			imputnumber /= TEN;
		}
		
		System.out.println("その値は" + characterlength + "桁です。");
		
		
		
		
	}

}
