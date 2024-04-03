package method;

public class Calculator {

	private boolean onPower; // 기본이 false
	
	
	public long plus(int a, int b) {
		
		long result=(long)a+b;
		return result;
		
		
	}
	
	
	

	public boolean isOnPower() {
		return onPower;
	}

	public void setOnPower(boolean onPower) {
		this.onPower = onPower;
	}

	public void power() {// 메서드

		//onPower가 True이면 전원을 끄세요
		//onPower가 false이며 전원을 켜세요
		
		if(onPower) {
			
			System.out.println("전원을 끕니다");
			//setOnPower(false); //필요없음
			
		}else{
			
			System.out.println("전원을 켭니다");
			//setOnPower(true); //필요없음 
			
		}
		
		setOnPower(!onPower);
		return; //메서드 종료를 의미하는 키워드
	

	}void disp(){
		
		System.out.println("aaa");
		return;
		//System.out.println("bbb");
	}

}
