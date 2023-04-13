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
			catch(InputMismatchException e) {
				System.err.print("値が不正です。範囲および型を確認してください。");
				return;
			} 
			catch(NoSuchElementException e){
				System.err.print("値が不正です。範囲および型を確認してください。");
				return;
			} 
			catch(IllegalStateException e){
				System.err.print("不正または不適切なときにメソッドが呼び出されています。");
				return;
				} 
			finally {
				stdIn.close();
			}
			
			int characterlength = 0;
			
		while(imputnumber % 10 >= 1) {
			characterlength += 1;
			imputnumber /= 10;
		}
		
		System.out.println("その値は"+characterlength+"桁です。");
		
		
		
		
	}

}
