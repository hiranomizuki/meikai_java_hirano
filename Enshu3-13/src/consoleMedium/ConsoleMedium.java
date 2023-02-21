package consoleMedium;

import java.util.Scanner;

public class ConsoleMedium {

	public static void main(String[] args) {
		
		System.out.println("３つの整数から中央値を導いて");
        Scanner stdIn = new Scanner(System.in);
        int firstNumber = stdIn.nextInt();
        int secoundNumber = stdIn.nextInt();
        int thirdNumber = stdIn.nextInt();
		stdIn.close();
//        System.out.println("\t中央値 ： " + getMedNumber(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])));
        System.out.println("\t中央値 ： " + getMedNumber(firstNumber, secoundNumber, thirdNumber));

	}
	
	private static int getMaxNumber(int aNum, int bNum, int cNum) {
		
		int maxNumber = aNum;
		if(maxNumber < bNum) {
			maxNumber = bNum;
		}
		if(maxNumber < cNum) {
			maxNumber = cNum;
		}
		return maxNumber;
	}

	private static int getMinNumber(int aNum, int bNum, int cNum) {
		
		int minNumber = aNum;
		if(minNumber > bNum) {
			minNumber = bNum;
		}
		if(minNumber > cNum) {
			minNumber = cNum;
		}
		return minNumber;
	}
	
	private static int getMedNumber(int aNum, int bNum, int cNum) {
		
		int mediumNumber;
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
	
	private static int getDiffToMedNumber(int aNum, int bNum, int cNum) {

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
