import java.util.Random;//定义随机数
import java.util.Scanner;//定义扫描仪
class caishuzi{
	public static void main(String[]  args){
		Random xx=new Random();//声明随机数
		Scanner in=new Scanner(System.in);//声明扫描仪
		System.out.println("----猜数字游戏----请输入1-100以内的数字");
		int suijishu=xx.nextInt(100)+1;
		while(true){
			int shuzi=in.nextInt();
			if(shuzi>suijishu){
				System.out.println("您猜的数字大于随机数，请再次输入");
			}else if(shuzi<suijishu){
				System.out.println("您猜的数字小于随机数，请再次输入");
			}else{
				System.out.println("您猜中了");
				break;
			}
		}
	}
}