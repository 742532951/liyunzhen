//�������������µ�����������������ʣ�������
import java.util.Scanner;
public class days{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("�����빲�м���");
		int day=in.nextInt();	
		int dayq=day/7;
		int dayw=day%7;
		System.out.println("����"+dayq+"��");
		System.out.println("��ʣ"+dayw+"��");
	}
}