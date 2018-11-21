//判断数的奇偶
import java.util.Scanner;
public class even{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个数");
		int a=in.nextInt();
		int b=a%2;
		if(b==0){
			System.out.println("这是数是偶数");
		}else{
			System.out.println("这是数是奇数");
		}
	}
}