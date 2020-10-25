import java.util.Scanner;

public class Pingjunfen {
	public static void main(String[] args) {
		int[] scores = new int[5];
		String[] names = new String[5];
		Scanner sc = new Scanner(System.in);
		
		String[] bu = new String[5];
		for (int i = 0; i < names.length; i++) {
			System.out.println("请录入第"+(i+1)+"个同学的名字：");
			String name=sc.next();
			names[i]=name;
			System.out.println("请录入"+names[i]+"同学的成绩：");
			int score = sc.nextInt();	
			scores[i]=score;
		}
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum+=scores[i];	
		}
		int avg = sum/5;
		
		
		for (int i = 0; i < scores.length; i++) {
			if(scores[i]<avg) {
				bu[i]=names[i];
			}
			
			
		}
		System.out.println("他们的平均分是："+avg);
		System.out.println("不到平均分的人有：");
		for (int i = 0; i < bu.length; i++) {
			if(bu[i]!=null&&bu[i]!="") {
				System.out.println(bu[i]);
			}
		}
		
		
	}
}
