class iphone{
	public static void main(String[] args){
		phone pi=new phone();
		pi.setBrand("三星");
		pi.setPrice(5288);

		System.out.println(pi.getBrand()+"   "+pi.getPrice());
		pi.call();
		pi.sendM();
		pi.playGame();
	}
}
class phone{
	private String brand;	//品牌	
	private int price;		//价格
	public void setBrand(String brand){		//设置品牌
		this.brand=brand;
	}
	public String getBrand(){		//获取品牌
		return this.brand;		//this。可以省略，你不加系统会默认帮你加
	}
	public void setPrice(int price){		//设置价格
		this.price=price;
	}
	public int getPrice(){		//获取价格
		return this.price;		//this。可以省略，你不加系统会默认帮你加
	}
	public void sendM(){		//发短信
		System.out.println("发短信");
	}
	public void call(){		//打电话
		System.out.println("打电话");
	}
	public void playGame(){		//玩游戏
		System.out.println("玩游戏");
	}
}