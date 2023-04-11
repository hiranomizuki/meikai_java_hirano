package Enshu4_7;

	import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
	public class Enshu4_7 {
		public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
			System.out.println("何個表示しますか？");
			int imputnumber;
			try {
					imputnumber = stdIn.nextInt();	
			}catch(InputMismatchException e)
			{
				System.err.print("値が不正です。範囲および型を確認してください。");
				return;
			}catch(NoSuchElementException e)
			{
				System.err.print("値が不正です。範囲および型を確認してください。");
				return;
			}catch(IllegalStateException e)
			{
				System.err.print("不正または不適切なときにメソッドが呼び出されています。");
				return;
			}
			finally {
				stdIn.close();
			}
			int countnumber = 0;
			while(imputnumber > countnumber) {
				System.out.print('*');
				countnumber++;
				if(imputnumber > countnumber) {
					System.out.print('+');
					countnumber++;
				}
			}

		}
	
	
	
	
	
}
