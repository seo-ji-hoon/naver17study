package day1218;

class Car223{
	
	String company="현대자동차";
	String model="그랜져";
	String color="검정";
	int maxSpeed = 350;
	int speed;
}




public class Book223 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체생성
		
		Car223 myCar = new Car223();
		
		//Car 객체의 필드값 읽기
		System.out.println("제작회사 : "+myCar.company);
		System.out.println("모델명 : "+myCar.model);
		System.out.println("색깔 : "+myCar.color);
		System.out.println("최고속도 : "+myCar.maxSpeed);
		System.out.println("현재속도 : "+myCar.speed);
		
		//Car 객체의 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : "+myCar.speed);
	}

}
