package Enshu4_12;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Enshu4_12 {

	public static void main(String[] args) {
		System.out.print("0からカウントアップします。正の整数値を入力してください。");
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
			
	
		for(int number=0 ;inputnumber>=number;number++)	
			System.out.println(number);
		
			
			
			
			
			
			
			
		}
	
	
	
	
	
	
	
	}	
}
