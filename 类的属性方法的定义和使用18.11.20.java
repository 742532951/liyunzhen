class a{
	public static void main(String[] args){
	b liyunzhen=new b();
	liyunzhen.name="������";
	liyunzhen.year=1997;
	liyunzhen.age=21;
	liyunzhen.print();
	liyunzhen.qaq();
	new b().print();//��������ķ���ʹ�ã����Խ�ʡ����	
	new b().print();//��������ֻ�ʺ϶Է�����һ�ε��ã���Ϊ������þͻ�����������
	}
}

class b{
	String name;
	int age;  //��Ա��������Ĭ�ϳ�ʼ��ֵ�������ڷ����о��Ǿֲ���������ҪҪ���壬��ֵ�˲���ʹ�á�
	int year;
	public void qaq(){
		System.out.println("������������Ϸ");
	}
	public void print(){
		System.out.println(name+"___"+age+"___"+year);
	}
}