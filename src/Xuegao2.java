import java.util.Scanner;

public class Xuegao2 {
	public static void main(String[] args) {
		String[] names= {"����","����","����","����","С��","С��","С��","Сѩ","С��","С��","��ΰ","С��giao","111","222","333","444","555","666","777","888",};

		
		double s = Math.random();
		int num1 = (int)(s*19+1);
		System.out.println("�����ʦǮ���������һ��ѧԱΪ��"+num1+"��");
		Scanner sc = new Scanner(System.in);
		System.out.println("���˶���Ǯ��");
		int money = sc.nextInt();
		int num = 20;
		int a =0;
		int pay = 0;
		int money2=0;
		int m=money;
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("��ѩ����"+names[i] +"ͬѧ��   �ԣ�Y  ���ԣ�N");
			String c=sc.next();
			if(c.equals("Y")) {
				System.out.println("�����֣� 3.һԪ  4.��Ԫ ���� 10Ԫ");    //3.  1Ԫ��   4.  2Բ��    ����..10Բ��
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
				System.out.println("��ʦ����"+(m-money)+"Ԫ,"+num1+"��ѧԱ����"+money2+"Ԫ");
				continue;
			}
			System.out.println("��ʦ����"+(m-money)+"Ԫ,"+num1+"��ѧԱ����"+money2+"Ԫ");
		}
			
		
//		while(a<=19) {
//			a++;
//
//			System.out.println("�Բ��ԣ�"+a+"��ѧԱ  1.��   2.����" );  //1.chi   2.buhci
//			int c=sc.nextInt();
//			if(c==1) {
//				System.out.println("�����֣� 3.һԪ  4.��Ԫ ���� 10Ԫ");    //3.  1Ԫ��   4.  2Բ��    3.10Բ��
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
//			System.out.println("��ʦ����"+(m-money)+"Ԫ,"+num1+"��ѧԱ����"+money2+"Ԫ");
//		}
//		
	}
}
