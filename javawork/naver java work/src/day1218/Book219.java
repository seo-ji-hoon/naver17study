package day1218;

class Car2 {
	
	//필드선언
	String model;
	boolean start;
	int speed;
	
}

public class Book219 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체생성
		Car2 myCar = new Car2();
		
		//객체의 필드값 읽기
		System.out.println("모델명:" + myCar.model);
		System.out.println("시동여부:" + myCar.start);
		System.out.println("현재속도:" + myCar.speed);
		
	}

}