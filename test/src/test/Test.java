package test;

public class Test {

	public static void main(String[] args) {

		String groupName="超ときめき♡宣伝部";
		
		String[] memberName = new String[6];
		memberName[0]="辻野かなみ";
		memberName[1]="杏ジュリア";
		memberName[2]="坂井仁香";
		memberName[3]="小泉遥香";
		memberName[4]="菅田愛貴";
		memberName[5]="吉川ひより";
		
		for(int i = 0; i<memberName.length; i++) {
		System.out.println(memberName[i]+"です！");
		}
//全員の自己紹介が終わったら下記グループの挨拶をして終了
		
		System.out.println("私たち"+groupName+"です！");
		
		}
	
}
