import java.util.Scanner;

public class Hongbaoxitong {
	public static void main(String[] args) {
		//1.��ȷ�����ж���Ǯ
		//2.��Ů���ѷ�����������Լ�����
		//3.Ů���ѿ���ԭ���㣬Ҳ���Բ�ԭ��
		//4.ԭ��֮�󣬳����������ԭ�¿��Լ�����
		//5.���Ǯ�ù��˾ͳ���ʧ��
		//6.��ѡ���ܣ�����������£����ܵ���ֱ��ʧ��
		//��ӹ��ܣ�����ѡ����ĸ�Ů���ѣ���ѡ������һ��
		//ÿ��Ů���ѣ�ԭ��ָ����ͬ
		//����֮����ʾ�����ܹ����˼��Σ������˶���Ǯ
		
		System.out.println("��ӭ���������ϵͳ");
		Scanner sc = new Scanner(System.in);
		System.out.println("���ж���Ǯ��");
		int money = sc.nextInt();
		int money1=money;
		boolean f = false;
		int ci =0;
		while(f==false) {
			System.out.println("��Ҫ������Ǯ�ĺ�����㻹ʣ��"+money+"Ԫ");
			int fa = sc.nextInt();
			if(fa==0) {
				System.out.println("��ϲ�ѵ�");
				break;
			}else if(fa>money){
				System.out.println("��û����ô��Ǯ����Ŀǰֻ��"+money+"Ԫ");
				if(money<=0) {
					System.out.println("���Ʋ���");
					break;
				}
				continue;
			}else {
				ci++;
				money-=fa;
				//�ж��Ƿ�ԭ��
				 
				double b=Math.random();
				double result = fa*b;
				if(result>100) {
					System.out.println("ԭ�����ˣ�һ������"+ci+"��"+(money1-money)+"Ԫ");
					f = true;
				}else {
					System.out.println("��û��ԭ����");
					continue;
				}
				
				
				
			}
		}
	}

}
