package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("オリジナルの名前を表示するなら1、今の名前を表示するなら2を入力してください。");
		int number = stdIn.nextInt();
		
		String		groupName = null;
		String[]	memberNames = new String[6];
		
		
		if ( number == 1) {
			
			String groupName1="ときめき♡宣伝部";
			memberNames[0]="辻野かなみ";
			memberNames[1]="藤本ばんび";
			memberNames[2]="坂井仁香";
			memberNames[3]="小泉遥香";
			memberNames[4]="小高サラ";
			memberNames[5]="吉川ひより";	
			
			//この部分をメソッド化して、ここでそのメソッドを呼び出すようにすれば、共通処理になる
			//memberNamesも外部ファイルにだすようにチャレンジしてみよう！
			
			for(int i = 0; i<memberNames.length; i++) {
			
				System.out.println(memberNames[i]+"です！");
			}
			//全員の自己紹介が終わったら下記グループの挨拶をして終了
			System.out.println("私たち"+groupName1+"です！");
			
		}else if( number == 2) {
			
			String groupName1="超ときめき♡宣伝部";
			memberNames[0]="辻野かなみ";
			memberNames[1]="杏ジュリア";
			memberNames[2]="坂井仁香";
			memberNames[3]="小泉遥香";
			memberNames[4]="菅田愛貴";
			memberNames[5]="吉川ひより";
			for(int i = 0; i<memberNames.length; i++) {
				System.out.println(memberNames[i]+"です！");
			}
			//全員の自己紹介が終わったら下記グループの挨拶をして終了
			System.out.println("私たち"+groupName1+"です！！");
		}
	}
}
