class iphone{
	public static void main(String[] args){
		phone pi=new phone();
		pi.setBrand("����");
		pi.setPrice(5288);

		System.out.println(pi.getBrand()+"   "+pi.getPrice());
		pi.call();
		pi.sendM();
		pi.playGame();
	}
}
class phone{
	private String brand;	//Ʒ��	
	private int price;		//�۸�
	public void setBrand(String brand){		//����Ʒ��
		this.brand=brand;
	}
	public String getBrand(){		//��ȡƷ��
		return this.brand;		//this������ʡ�ԣ��㲻��ϵͳ��Ĭ�ϰ����
	}
	public void setPrice(int price){		//���ü۸�
		this.price=price;
	}
	public int getPrice(){		//��ȡ�۸�
		return this.price;		//this������ʡ�ԣ��㲻��ϵͳ��Ĭ�ϰ����
	}
	public void sendM(){		//������
		System.out.println("������");
	}
	public void call(){		//��绰
		System.out.println("��绰");
	}
	public void playGame(){		//����Ϸ
		System.out.println("����Ϸ");
	}
}