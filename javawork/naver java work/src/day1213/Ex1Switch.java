package day1213;

public class Ex1Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//switch문
		
		int n=5; // 숫자형 정수 int 선언을하고 n이라는 변수에 내용을 선언!
		
		switch(n) {
		case 1: //'내용이 1일때'
			System.out.println("one");
			break; //break 선언하지않으면 밑에있는 내용까지 전부다 출력됨
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default: //다른값을 입력했을때
			System.out.println("other number");
		}
	}

}
