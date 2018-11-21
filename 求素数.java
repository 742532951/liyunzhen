import java.util.Scanner;
public class sushu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("输入求素数的起始值");
		int a=in.nextInt();
		System.out.println("输入求素数的终值");
		int b=in.nextInt();
		boolean sushu = true;
		for(int d=a;d<=b;d++) {
			for(int c=2;c<d;c++) {
				if (d % c==0) {
					sushu = false;
					break;
				}
			}
			if(sushu)	
				System.out.println(d +"是素数");
		}
	}
}
