class a{
	public static void main(String[] args){
	b liyunzhen=new b();
	liyunzhen.name="李云振";
	liyunzhen.year=1997;
	liyunzhen.age=21;
	liyunzhen.print();
	liyunzhen.qaq();
	new b().print();//匿名对象的方法使用：可以节省代码	
	new b().print();//匿名对象只适合对方法的一次调用，因为多个调用就会产生多个对象
	}
}

class b{
	String name;
	int age;  //成员变量：有默认初始化值；若是在方法中就是局部变量：必要要定义，赋值了才能使用。
	int year;
	public void qaq(){
		System.out.println("李云振在玩游戏");
	}
	public void print(){
		System.out.println(name+"___"+age+"___"+year);
	}
}