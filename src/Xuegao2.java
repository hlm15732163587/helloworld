import java.util.Scanner;

public class Xuegao2 {
	public static void main(String[] args) {
		String[] names= {"张三","李四","王五","王六","小红","小兰","小黑","小雪","小黄","小绿","狗伟","小啊giao","111","222","333","444","555","666","777","888",};

		
		double s = Math.random();
		int num1 = (int)(s*19+1);
		System.out.println("如果老师钱不够了随机一个学员为："+num1+"号");
		Scanner sc = new Scanner(System.in);
		System.out.println("带了多少钱：");
		int money = sc.nextInt();
		int num = 20;
		int a =0;
		int pay = 0;
		int money2=0;
		int m=money;
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("吃雪糕吗？"+names[i] +"同学，   吃：Y  不吃：N");
			String c=sc.next();
			if(c.equals("Y")) {
				System.out.println("吃那种？ 3.一元  4.两元 其它 10元");    //3.  1元的   4.  2圆的    其它..10圆的
				int z = sc.nextInt();
				if(z==3) {
					if(money<=1) {
						money2++;
					}else {
						money--;
						pay++;
					}
					
				}else if(z==4){
					if(money<2) {
						money2+=2;
					}else {
						money-=2;
						pay+=2;
					}
					
				}else {
					if(money<10) {
						money2+=10;
					}else {
						money-=10;
						pay+=10;
						
					}
					
				}
			}else {
				System.out.println("老师花了"+(m-money)+"元,"+num1+"号学员花了"+money2+"元");
				continue;
			}
			System.out.println("老师花了"+(m-money)+"元,"+num1+"号学员花了"+money2+"元");
		}
			
		
//		while(a<=19) {
//			a++;
//
//			System.out.println("吃不吃？"+a+"号学员  1.吃   2.不吃" );  //1.chi   2.buhci
//			int c=sc.nextInt();
//			if(c==1) {
//				System.out.println("吃那种？ 3.一元  4.两元 其它 10元");    //3.  1元的   4.  2圆的    3.10圆的
//				int z = sc.nextInt();
//				if(z==3) {
//					if(money<=1) {
//						money2++;
//					}else {
//						money--;
//						pay++;
//					}
//					
//				}else if(z==4){
//					if(money<2) {
//						money2+=2;
//					}else {
//						money-=2;
//						pay+=2;
//					}
//					
//				}else {
//					if(money<10) {
//						money2+=10;
//					}else {
//						money-=10;
//						pay+=10;
//						
//					}
//					
//				}
//			}else {
//				continue;
//			}
//			System.out.println("老师花了"+(m-money)+"元,"+num1+"号学员花了"+money2+"元");
//		}
//		
	}
}
