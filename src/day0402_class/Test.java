package day0402_class;


public class Test {

	public static void main(String[] args) {

		System.out.println("메인");

	}

	public Test() {//생성자
		// TODO Auto-generated constructor stub
	}
	
	class Inner{//중첩 클래스
		int num;
		void disp() {}
		public Inner() {
			
		}
		
	}
}
