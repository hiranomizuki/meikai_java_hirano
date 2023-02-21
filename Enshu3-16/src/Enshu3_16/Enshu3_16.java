package Enshu3_16;

import java.util.InputMismatchException;

//3つの整数値を昇順（小さい順）にソート

import java.util.Scanner;
public class Enshu3_16 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		try {
			System.out.print("整数 A : ");
			a = stdIn.nextInt();
		}
		catch (InputMismatchException e) {
			System.err.println("Aには整数を入力してください。");
			stdIn.close();
			return;
		}
		
//補足：Aでaとか入力するとストップしちゃう→aいれたらまたAの入力できるようにするには
//		for/while文使う！
		
		try {
			System.out.print("整数 B : ");
			b = stdIn.nextInt();
		}	
			catch (InputMismatchException e) {
				System.err.println("Bには整数を入力してください。");
				stdIn.close();
				return;
			}
		
		try {
			System.out.print("整数 C : ");
			c = stdIn.nextInt();
		}
		catch (InputMismatchException e) {
			System.err.println("Cには整数を入力してください。");
			return;
		}
		finally {
			stdIn.close();
		}

		   System.out.println("昇順にならべると"+getMinNumber(a,b,c)+","+getMedNumber(a, b, c)+","+getMaxNumber(a,b,c));

			}
			
			static int maxNumber = 0;
			static int minNumber = 0;
			static int mediumNumber =0;
					
			public static int getMaxNumber(int aNum, int bNum, int cNum) {
				
				maxNumber = aNum;
				if(maxNumber < bNum) {
					maxNumber = bNum;
				}
				if(maxNumber < cNum) {
					maxNumber = cNum;
				}
				return maxNumber;
			}

			public static int getMinNumber(int aNum, int bNum, int cNum) {
				
				minNumber = aNum;
				if(minNumber > bNum) {
					minNumber = bNum;
				}
				if(minNumber > cNum) {
					minNumber = cNum;
				}
				return minNumber;
			}
			
			public  static int getMedNumber(int aNum, int bNum, int cNum) {
				
				//3値が同値
				if (aNum == bNum && bNum == cNum) {
					mediumNumber = aNum;
				}
				//全て異なる
				else if (aNum != bNum && bNum != cNum && cNum != aNum) {
					mediumNumber = getDiffToMedNumber(aNum, bNum, cNum);
				}
				//2値が同値
				else {
					if (aNum == bNum) {
						mediumNumber = aNum;
					} else if (bNum == cNum) {
						mediumNumber = bNum;
					} else {
						mediumNumber = cNum;
					}
				}
				
				return mediumNumber;
			}
			
			public static int getDiffToMedNumber(int aNum, int bNum, int cNum) {

				int diffToMediumNumber;
				int maxNumber = getMaxNumber(aNum, bNum, cNum);
				int minNumber = getMinNumber(aNum, bNum, cNum);
				//最大値でも最小値でもないものが中央値
				if (aNum != maxNumber && aNum != minNumber) {
					diffToMediumNumber = aNum;
				} else if (bNum!= maxNumber && bNum != minNumber) {
					diffToMediumNumber = bNum;
				} else {
					diffToMediumNumber = cNum;
				}

				return diffToMediumNumber;
		
		
		
	}

}
