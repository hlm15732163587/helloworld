import java.util.Scanner;

public class Hongbaoxitong {
	public static void main(String[] args) {
		//1.先确定你有多少钱
		//2.给女朋友发红包，数额自己决定
		//3.女朋友可能原谅你，也可以不原谅
		//4.原谅之后，程序结束，不原谅可以继续发
		//5.如果钱用光了就彻底失败
		//6.可选功能，极特殊情况下，可能导致直接失败
		//添加功能：可以选择哄哪个女朋友，先选择其中一个
		//每个女朋友，原谅指数不同
		//哄完之后，显示本次总共发了几次，共花了多少钱
		
		System.out.println("欢迎来到发红包系统");
		Scanner sc = new Scanner(System.in);
		System.out.println("你有多少钱？");
		int money = sc.nextInt();
		int money1=money;
		boolean f = false;
		int ci =0;
		while(f==false) {
			System.out.println("你要发多少钱的红包？你还剩余"+money+"元");
			int fa = sc.nextInt();
			if(fa==0) {
				System.out.println("恭喜脱单");
				break;
			}else if(fa>money){
				System.out.println("你没有那么多钱，你目前只有"+money+"元");
				if(money<=0) {
					System.out.println("你破产了");
					break;
				}
				continue;
			}else {
				ci++;
				money-=fa;
				//判断是否原谅
				 
				double b=Math.random();
				double result = fa*b;
				if(result>100) {
					System.out.println("原谅你了！一共发了"+ci+"次"+(money1-money)+"元");
					f = true;
				}else {
					System.out.println("还没有原谅你");
					continue;
				}
				
				
				
			}
		}
	}

}
