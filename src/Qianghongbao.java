import java.util.Scanner;

public class Qianghongbao {
	public static void main(String[] args) {
		double money;
		int count;
		double iter;
		Scanner sc = new Scanner(System.in);
		System.out.println("你要发多少钱的红包：");
		money=sc.nextInt();
		System.out.println("你要发多少个红包：");
		count = sc.nextInt();
		iter = count;
		
		String[] names = new String[count]; 
		double[] moneyq = new double[count];
		
		for (int i = 0; i < count; i++) {
			
			String name = "用户"+(i+1);
			names[i]=name;
			double rate = 2/iter;
			double qian = money*rate*Math.random();
			moneyq[i] = qian;
			
			double max=0;
			if(max<qian) {
				max = qian;
				
			}
			
			System.out.println(names[i]+qian+max);
			money-=qian;
			iter--;
		}
		
		
	}
}
