//����Ĳ�������
import java.util.Scanner;
class b{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("��������Ҫ���ҵ���");
		int a=in.nextInt();
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		int b=weekone(arr,a);
		System.out.println(b);
	}
	public static int weekone(int[] arr,int a){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==a){
				return i;
			}
		}
		return -1;
	}
}