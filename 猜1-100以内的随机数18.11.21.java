import java.util.Random;//���������
import java.util.Scanner;//����ɨ����
class caishuzi{
	public static void main(String[]  args){
		Random xx=new Random();//���������
		Scanner in=new Scanner(System.in);//����ɨ����
		System.out.println("----��������Ϸ----������1-100���ڵ�����");
		int suijishu=xx.nextInt(100)+1;
		while(true){
			int shuzi=in.nextInt();
			if(shuzi>suijishu){
				System.out.println("���µ����ִ�������������ٴ�����");
			}else if(shuzi<suijishu){
				System.out.println("���µ�����С������������ٴ�����");
			}else{
				System.out.println("��������");
				break;
			}
		}
	}
}