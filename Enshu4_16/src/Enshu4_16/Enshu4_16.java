package Enshu4_16;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Enshu4_16 {

	public static void main (String[] args) {
		System.out.print("何個*を表示しますか：");
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
		
		for (int i =1 ; i <= inputnumber ; i++) {
			System.out.print("*");
			//5個表示するごとに改行する
			if (i % 5 == 0) {
				System.out.println();
			}
		}
	}
}
