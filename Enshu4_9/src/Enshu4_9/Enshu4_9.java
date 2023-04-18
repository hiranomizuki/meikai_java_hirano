package Enshu4_9;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Enshu4_9 {

	public static void main(String[] args) {
		System.out.print("nの値：");
		Scanner stdIn = new Scanner(System.in);
		
		int inputnumber;
		
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
		
		
		int sum = 1;
		int temporarynumber = inputnumber;
		
		while(temporarynumber > 0) {
			sum = sum * temporarynumber;
			temporarynumber--;
		}
		
		System.out.println("1から"+inputnumber+"までの積は"+sum+"です。");
		
		
		
		

	}

}
