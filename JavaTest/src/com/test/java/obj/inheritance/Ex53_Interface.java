package com.test.java.obj.inheritance;

public class Ex53_Interface {

	public static void main(String[] args) {
		
		//Ex53_Interface.java
		
		MxKeys keyboard = new MxKeys();
		
		keyboard.powerOn();
		keyboard.keydown('A');
		
		
	}//main
	
}//class


//*** Keyboard는 객체를 생성할 수 없다 > 실체화할 수 없다 >
interface Keyboard{
	
	//키보드로서 갖춰야할 행동들 정의(선언부(O), 구현부(X)) > 호출 사용법
	 void keydown(char c);
	 void powerOn();
	 void powerOff();
	 int checkBattery();
	
}

class MxKeys implements Keyboard{

	@Override
	public void keydown(char c) {
		//구현? > 자기 맘대로~
		System.out.println(c + "눌렀음");
	}

	@Override
	public void powerOn() {
		System.out.println("전원 켜짐");
	}

	@Override
	public void powerOff() {
		System.out.println("전원 꺼짐");
	}

	@Override
	public int checkBattery() {
		return 80;
	}
	
}