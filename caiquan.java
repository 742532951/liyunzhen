//��ȭ��Ϸ
import java.util.Random;//���������
import java.util.Scanner;//����ɨ����
class caiquan{
	public static void main(String[]  args){
		Random xx=new Random();//���������
		Scanner in=new Scanner(System.in);//����ɨ����
		System.out.println("----��ȭ��Ϸ----���ȭ");
		System.out.println("(1.ʯͷ��2.������3.��)");
		int a=in.nextInt();
		int b=xx.nextInt(3)+1;
		String c="ʯͷ";
		switch(a){
			case 2:
			c="����";
			break;
			case 3:
			c="��";
			break;
		}
		String d="ʯͷ";
		switch(b){
			case 2:
			d="����";
			break;
			case 3:
			d="��";
			break;
		}
		if(a==b){
			System.out.println("�������"+c+"���Գ�����"+d+"233ƽ��");
		}else if(a==1&&b==3||a==2&&b==1||a==3&&b==2){
			System.out.println("�������"+c+"���Գ�����"+d+"QAQ������");
		}else{
			System.out.println("�������"+c+"���Գ�����"+d+"=_=��Ӯ��");
		}
	}
}