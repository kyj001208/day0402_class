package method;

public class MethodEx {

	void display() {

		System.out.println("x: " + 0);
		System.out.println("y: " + 0);
	}

	void display(int x) {// 변수 이름으로 구별하는것이 아닌 메서드이름,(매개변수-데이터타입과 순서)으로 구별

		System.out.println("x: " + x);
		System.out.println("y: " + 0);
	}

	void display(long y) {// 위에 x와 변수이름 외에 메서드이름,(매개변수 데이터타입)이 같아 사용 불가능

		System.out.println("x: " + 0);
		System.out.println("y: " + y);
	}

	void display(int x, int y) {// 위에 x와 변수이름 외에 메서드이름,(매개변수 데이터타입)이 같아 사용 불가능

		System.out.println("x: " + x);
		System.out.println("y: " + x);
	}

	void display(long x, long y) {
		System.out.println("x: " + x);
		System.out.println("y: " + x);
	}

	void display(int x, long y) {
		System.out.println("x: " + x);
		System.out.println("y: " + x);
	}

	void display(long x, int y) {
		System.out.println("x: " + x);
		System.out.println("y: " + x);
	}

}
