package day1220;

interface InterB {
	
	int SPEED=100; //final 상수
	
	public void speedWrite();
	public void speedUp(int speed);
	public void speedDown(int speed);
}

class Car implements InterB {
	
	int curSpeed=SPEED; //초기값 100이 대입
	
	@Override
	public void speedWrite() {
		// TODO Auto-generated method stub
		//System.out.println("현재스피드 : "+SPEED);
		System.out.println("현재스피드 : "+curSpeed);
	}

	@Override
	public void speedUp(int speed) {
		// TODO Auto-generated method stub
//		SPEED+=speed; //오류 : SPEED는 상수이므로 변경불가
		System.out.println("스피드를 "+speed+"올립니다.");
		curSpeed+=speed;
	}

	@Override
	public void speedDown(int speed) {
		// TODO Auto-generated method stub
		System.out.println("스피드를 "+speed+"내립니다.");
		curSpeed-=speed;
		
	}
	
	
	
}

public class Ex10Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//speedWrite
		InterB inter=new Car();
		inter.speedWrite();
		
		//speedUP
		inter.speedUp(30);
		inter.speedWrite();
		
		//speedDown
		inter.speedDown(50);
		inter.speedWrite();
		
	}

}