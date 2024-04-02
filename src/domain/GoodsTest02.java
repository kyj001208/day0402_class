package domain;

public class GoodsTest02 {
	//메모리에 할당된 코드 X 
	int a; //인스턴스변수는 객체 생성 후 접근 가능
	
	
	static int b=10; //공유필드(정적 필드), 같은 클래스에 있기에 접근 가능
	
	public static void main(String[] args) {
		
		//변수 a는 인스턴스 변수이므로 객체 생성 후 객체 변수로 접근

		GoodsTest02 obj=new GoodsTest02();
		System.out.println(obj.a);
		
		System.out.println(b); //공유, 같은 static에 있어 바로 호출 가능
		
		System.out.println(BBB.b); //다른 블록이여도 공유로 클래스.변수이름으로 호출 가능 
	}
	
	class BBB{
		
		static int b=100; //블럭이 다르기에 b변수 이름 가능
		
	}

}
