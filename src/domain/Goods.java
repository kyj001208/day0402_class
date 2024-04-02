package domain;

import java.time.LocalDateTime;

public class Goods {
	
	//멤버필드_인스턴스변수
	
	private long no;
	private String title;
	private int stock;
	private int price;
	private LocalDateTime createdAt;
	
	public Goods() {
		System.out.println("객체 생성시 호출하며 필드 초기화 역할을 수행하는게 일반적입니다");
	}
	
	//정적(공유) 필드
	//클래스 이름.멤버이름 Goods.a
	static int a;
	
	//최초 1번만 실행되며 인스턴스 초기화되기전에 먼저 실행됩니다.
	static {
		System.out.println("static 초기화 블럭이 실행합니다");
		a=10;
	}

	//판매 가능 여부-boolean형

	private boolean sales; //false 판매 불가능, true 판매가능
	
	//boolean 타입의 getter메서드는 get →is
	
	public boolean isSalse() {
		return sales;
	}
	
	public void setSales(boolean sales) {
		this.sales=sales;
	}
	
	//private 접근 클래스내부(메서드 안에서, 생성자안에서)에서 허용, 외부에서는 불가
	
	
	//낙타법(camel표기법): 일반적으로 이름만들때 합성어인경우 가독성을 위해 뒤에 오는 글자첫글자를 대문자로 한다
	//필기를 값을 읽기 위한 메서드:getter
	
	

	public long getNo(){ 
		return no;
	}
	
	public void setNo(long no) {
		this.no=no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price=price;
	}
	
	public LocalDateTime getcreatedAt() {
		return createdAt;
	}
	
	public void LocalDateTime(LocalDateTime createdAt) {
		this.createdAt =createdAt;
	}
	
	
	

}
