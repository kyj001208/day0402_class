package domain;

public class GoodsTest01 {

	public static void main(String[] args) {
		
	// 1. 객체 생성
		//Goods good=new Goods(); //good= Object(객체) 타입 변수
		//Object goods2=new Goods();
		Goods goods1=new Goods();
		System.out.println(Goods.a);
		Goods.a=100;
		System.out.println(Goods.a);
		System.out.println(Goods.a);
	}
}
