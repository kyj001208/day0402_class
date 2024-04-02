package method;

public class Calculator {

	private boolean onPower; // 기본이 false

	public boolean isOnPower() {
		return onPower;
	}

	public void setOnPower(boolean onPower) {
		this.onPower = onPower;
	}

	public void power() {// 메서드

		//onPower가 True이면 전원을 끄세요
		//onPower가 false이며 전월으 켜세요
		
		if(onPower) {
			
			System.out.println("전원을 끕니다");
			setOnPower(false); //필요없음
			
		}else{
			
			System.out.println("전원을 켭니다");
			setOnPower(true); //필요없음 
			
		}
		
		//setOnPower(!onPower); 을 사용하게 되면 
	

	}

}
