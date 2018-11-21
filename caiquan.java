//猜拳游戏
import java.util.Random;//定义随机数
import java.util.Scanner;//定义扫描仪
class caiquan{
	public static void main(String[]  args){
		Random xx=new Random();//声明随机数
		Scanner in=new Scanner(System.in);//声明扫描仪
		System.out.println("----猜拳游戏----请出拳");
		System.out.println("(1.石头，2.剪刀，3.布)");
		int a=in.nextInt();
		int b=xx.nextInt(3)+1;
		String c="石头";
		switch(a){
			case 2:
			c="剪刀";
			break;
			case 3:
			c="布";
			break;
		}
		String d="石头";
		switch(b){
			case 2:
			d="剪刀";
			break;
			case 3:
			d="布";
			break;
		}
		if(a==b){
			System.out.println("你出的是"+c+"电脑出的是"+d+"233平局");
		}else if(a==1&&b==3||a==2&&b==1||a==3&&b==2){
			System.out.println("你出的是"+c+"电脑出的是"+d+"QAQ你输了");
		}else{
			System.out.println("你出的是"+c+"电脑出的是"+d+"=_=你赢了");
		}
	}
}