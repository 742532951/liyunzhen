//�ж�������ż
import java.util.Scanner;
public class even{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("������һ����");
		int a=in.nextInt();
		int b=a%2;
		if(b==0){
			System.out.println("��������ż��");
		}else{
			System.out.println("������������");
		}
	}
}