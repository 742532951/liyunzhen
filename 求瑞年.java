//什么是瑞年？能被4整除并不能被100整除。能被400整除的年份是瑞年
import java.util.Scanner;
public class year{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个年份");
		int a=in.nextInt();
		if(a%400==0){
			System.out.println(a+"年是瑞年");
		}else if((a%4==0)&&(a%100>0)){
			System.out.println(a+"年是瑞年");
		}else{ 
			System.out.println(a+"年是平年");
		}
	}
}