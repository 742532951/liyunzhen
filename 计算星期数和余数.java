//计算周数与余下的天数。计算周数与剩余的天数
import java.util.Scanner;
public class days{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入共有几天");
		int day=in.nextInt();	
		int dayq=day/7;
		int dayw=day%7;
		System.out.println("共有"+dayq+"周");
		System.out.println("还剩"+dayw+"天");
	}
}