import java.util.Scanner;

public class Pingjunfen {
	public static void main(String[] args) {
		int[] scores = new int[5];
		String[] names = new String[5];
		Scanner sc = new Scanner(System.in);
		
		String[] bu = new String[5];
		for (int i = 0; i < names.length; i++) {
			System.out.println("��¼���"+(i+1)+"��ͬѧ�����֣�");
			String name=sc.next();
			names[i]=name;
			System.out.println("��¼��"+names[i]+"ͬѧ�ĳɼ���");
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
		System.out.println("���ǵ�ƽ�����ǣ�"+avg);
		System.out.println("����ƽ���ֵ����У�");
		for (int i = 0; i < bu.length; i++) {
			if(bu[i]!=null&&bu[i]!="") {
				System.out.println(bu[i]);
			}
		}
		
		
	}
}
