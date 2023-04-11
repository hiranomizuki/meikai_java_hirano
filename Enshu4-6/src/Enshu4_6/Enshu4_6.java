package Enshu4_6;

	import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
	public class Enshu4_6 {

		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			System.out.println("何個*を表示しますか");
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
			int i = 0;
			while(i < imputnumber) {
				if (imputnumber < 1)  {
					System.out.print('*');
					i++;
				} 
					else {
						System.out.println('*');
						i++;
					}
			}

		}

}
	
