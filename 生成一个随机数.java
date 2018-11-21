//生成多少以内的随机数
/*
import java.util.Random;//定义随机数
import java.util.Scanner;//定义扫描仪
public class suijishu{
	public static void main(String[]  args){
		Random xx=new Random();//声明随机数
		Scanner in=new Scanner(System.in);//声明扫描仪
		System.out.println("你要生成多少以内的随机数");
		int b=in.nextInt();
		int a=xx.nextInt(b);
		System.out.println("生成的随机数为"+a);
	}
}
*/
import java.util.Scanner;
public class suijishu{
	public static void main(String[]  args){
		Scanner in=new Scanner(System.in);
		System.out.println("你要生成多少以内的随机数");
		int b=in.nextInt();
		int a=(int)(Math.random()*b);
		System.out.println("生成的随机数为"+a);
	}
}
