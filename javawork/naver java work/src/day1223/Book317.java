package day1223;

//Tire 클래스

class Tire {
	//메소드 선언
	public void roll() {
		System.out.println("회전합니다.");
	}
}

//HankookTire 클래스 

class HankookTire extends Tire {

	//메소드 재정의 (오버라이딩)

	@Override
	public void roll() {
		// TODO Auto-generated method stub
		System.out.println("한국 타이어가 회전합니다.");
	}	
}

//KumhoTire 클래스

class KumhoTire extends Tire {

	@Override
	public void roll() {
		// TODO Auto-generated method stub
		System.out.println("금호 타이어가 회전합니다.");

	}
}

//Car 클래스

class Car {

	//필드선언
	public Tire tire;

	//메소드 선언
	public void run() {
		//tire 필드에 대입된 객체의 roll() 메소드 호출
		tire.roll();
	}
}


public class Book317 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Car 객체 생성
		Car myCar = new Car();
		
		//Tire 객체생성
		myCar.tire=new Tire();
		myCar.run();
		
		//HankookTire 객체생성
		myCar.tire=new HankookTire();
		myCar.run();
		
		//KumhoTire 객체생성
		myCar.tire = new KumhoTire();
		myCar.run();
	}

}
