package Enshu4_14;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Enshu4_14 {

	public static void main(String[] args) {
		System.out.print("入力値までの合計を表示します。正の整数値を入力してください。");
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
			
		int sum = 0;
		
		//最後の数字のとき、+=sumと表示されてしまうことを考慮
		for(int number=1 ;inputnumber>=number;number++)	{
			
			if(number != inputnumber) {
				System.out.print(number+"+");
			}
			else if( number == inputnumber) {
				System.out.print(number);		
			}
			sum = sum + number;
		}
		
		System.out.println("="+sum);
				
		}
	
	
	
	
	
	
	
	}	
}
