package jihoon_test;

class Tv {
	
	//Tv의 속성 (멤버변수)
	String color;
	boolean power;
	int channel;
	
	//Tv의 기능
	void power() {
		power =! power;
	}
	void channellUp() {
		
		++channel;
		
	}
	
	static void channelDown() {
		
		System.out.println("staic");
	}
	
	
}


public class TvTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1=new Tv(); //호출
		Tv t2=new Tv(); //호출
	
		
		System.out.println("t1의 channel값은"+t1.channel+"입니다.");
		System.out.println("t2의 channel값은"+t2.channel+"입니다.");
		
		t1.channel=7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은"+t1.channel+"입니다.");
		System.out.println("t2의 channel값은"+t2.channel+"입니다.");
		
	}

}
