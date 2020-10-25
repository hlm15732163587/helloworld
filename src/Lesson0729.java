import java.util.Scanner;

public class Lesson0729 {
public static void main(String[] args) {
//	for (int i = 0; i <10; i++) {
//		System.out.println("现在的i是："+i);
//		if(i==3) {
//		//	continue;
//			break;
//		}
//		System.out.println("这是要做的事");
//	}
	
	
	
	//1-100之间，找出5个能被3整除的数
//		int num=0;
//		for (int i =1 ; i <=100; i++) {
//			if(i%3==0) {
//				num++;
//				System.out.println(i+"这是第"+num+"个");
//				if(num==5) {
//					break;
//				}
//			}
//			
//		}
	
	
	//做一个自动摇奖的效果
		//如果随机数大于0.9，通知中奖，停止摇奖
		//如果没有中奖，就继续摇，直到中奖为止
//	double num = 0;
//	while(num<=0.5) {
//		num = Math.random();
//		if(num>0.5) {
//			System.out.println("恭喜您中奖了");
//		}else {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("没有中奖，是否继续。1.是 2否");
//			int a = sc.nextInt();
//			if(a==1) {
//				continue;
//			}else if(a==2){
//				System.out.println("欢迎下次光临");
//				break;
//			}else {
//				System.out.println("打错了");
//			}
//			
//		}
//		
//	}
	
	int sum=0;
	for (int i = 1; i <= 100; i++) {
		
		if (i%3==0) {
			System.out.println(i+"可以");
			sum++;
			if (sum==5) {
				break;
			}
		}else{
			continue;
		}
		
		System.out.println("又找到了一个，好开心");
	}
	
	
	
	}
}
