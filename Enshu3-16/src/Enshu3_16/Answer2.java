
package Enshu3_16;
import java.util.Scanner;
public class Answer2 {

	public static void main(String[] args) {
		
		//3-16の前半Answer2
	Scanner stdIn = new Scanner(System.in);
		
	int i;
	int a=0;
	
		for(i=1 ; i<=3 ; i++) {

			a=0;
			
			System.out.println("整数"+i+":");
			a = stdIn.nextInt();
			
			if (a == 0) {
				System.out.println("整数"+i+"には0以外の整数を入力してください。");
				i--;
			}
			//エラー処理がぬけているのでたす！
		}
		
			stdIn.close();
			System.out.println("またやってみてね！");

	}

}

