package Enshu4_15;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Enshu4_15 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int fromheight=0;
		int toheight  =0;
		int interval  =0;
		
		try {
			System.out.print("何cmから：");
			fromheight = stdIn.nextInt();	
			
			System.out.print("何cmまで：");
			toheight   = stdIn.nextInt();
			
			System.out.print("何cmごと:");
			interval   = stdIn.nextInt();
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
		
		System.out.println("身長"+"  "+"標準体重");
	
		int sumheight = fromheight;
		double averageweight = 0;
		
		while(toheight > sumheight){
			averageweight = (sumheight - 100)*0.9;
			System.out.println(sumheight+"   "+averageweight);
			sumheight = sumheight + interval;
		}
		
	}	
}