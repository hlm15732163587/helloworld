import java.util.Scanner;

public class Shunxundaluan {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入内容：");
			String a = sc.next();
			//玩里去哪天今
			//  今天去哪里玩
			
			char[] aa = new char[a.length()];
			for (int i = 0; i < aa.length; i++) {
				aa[i]=a.charAt(i);
			
	     	 aa[aa.length-1]=a.charAt(0);
	     	 aa[0]=a.charAt(a.length()-1);
	     	
	     	aa[aa.length-2]=a.charAt(1);
	    	 aa[1]=a.charAt(a.length()-2);
	    	 
	     	System.out.print(aa[i]);
			
			}
			
		}
}
