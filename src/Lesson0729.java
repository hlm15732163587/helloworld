import java.util.Scanner;

public class Lesson0729 {
public static void main(String[] args) {
//	for (int i = 0; i <10; i++) {
//		System.out.println("���ڵ�i�ǣ�"+i);
//		if(i==3) {
//		//	continue;
//			break;
//		}
//		System.out.println("����Ҫ������");
//	}
	
	
	
	//1-100֮�䣬�ҳ�5���ܱ�3��������
//		int num=0;
//		for (int i =1 ; i <=100; i++) {
//			if(i%3==0) {
//				num++;
//				System.out.println(i+"���ǵ�"+num+"��");
//				if(num==5) {
//					break;
//				}
//			}
//			
//		}
	
	
	//��һ���Զ�ҡ����Ч��
		//������������0.9��֪ͨ�н���ֹͣҡ��
		//���û���н����ͼ���ҡ��ֱ���н�Ϊֹ
//	double num = 0;
//	while(num<=0.5) {
//		num = Math.random();
//		if(num>0.5) {
//			System.out.println("��ϲ���н���");
//		}else {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("û���н����Ƿ������1.�� 2��");
//			int a = sc.nextInt();
//			if(a==1) {
//				continue;
//			}else if(a==2){
//				System.out.println("��ӭ�´ι���");
//				break;
//			}else {
//				System.out.println("�����");
//			}
//			
//		}
//		
//	}
	
	int sum=0;
	for (int i = 1; i <= 100; i++) {
		
		if (i%3==0) {
			System.out.println(i+"����");
			sum++;
			if (sum==5) {
				break;
			}
		}else{
			continue;
		}
		
		System.out.println("���ҵ���һ�����ÿ���");
	}
	
	
	
	}
}
