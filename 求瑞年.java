//ʲô�����ꣿ�ܱ�4���������ܱ�100�������ܱ�400���������������
import java.util.Scanner;
public class year{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("������һ�����");
		int a=in.nextInt();
		if(a%400==0){
			System.out.println(a+"��������");
		}else if((a%4==0)&&(a%100>0)){
			System.out.println(a+"��������");
		}else{ 
			System.out.println(a+"����ƽ��");
		}
	}
}