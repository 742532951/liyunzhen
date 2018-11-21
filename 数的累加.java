import java.util.Scanner;
public class l_loo{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int i=1;
		int num=0;
		System.out.println("你要让1累加到什么数");
		int a=in.nextInt();
		while(i<a+1){
			num=i+num;
			i++;
		}
		System.out.println(num);
	}
}