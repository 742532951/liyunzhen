//���ɶ������ڵ������
/*
import java.util.Random;//���������
import java.util.Scanner;//����ɨ����
public class suijishu{
	public static void main(String[]  args){
		Random xx=new Random();//���������
		Scanner in=new Scanner(System.in);//����ɨ����
		System.out.println("��Ҫ���ɶ������ڵ������");
		int b=in.nextInt();
		int a=xx.nextInt(b);
		System.out.println("���ɵ������Ϊ"+a);
	}
}
*/
import java.util.Scanner;
public class suijishu{
	public static void main(String[]  args){
		Scanner in=new Scanner(System.in);
		System.out.println("��Ҫ���ɶ������ڵ������");
		int b=in.nextInt();
		int a=(int)(Math.random()*b);
		System.out.println("���ɵ������Ϊ"+a);
	}
}
