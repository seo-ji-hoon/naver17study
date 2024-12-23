package day1220;

//추상화(abstract) 부모
abstract class Test1 {
	
	abstract public void play();
}

//추상화(abstract) 상속1 부모에부모
abstract class Test2 extends Test1 {
	
	abstract public void job();
}

//상속2 - 내자신 ! ->Test1,Test2 다 물려받음
class Test3 extends Test2 {
	
	//오버라이드 play에 대한 내용 변경
	@Override 
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play");
	}
	
	//오버라이드 job에 대한 내용 변경
	@Override
	public void job() {
		// TODO Auto-generated method stub
		System.out.println("job");
	}
	
}




//Test1 자기 자신 play 호출가능
public class Ex8Abstract {
	public static void hello1(Test1 t1) {
		
		t1.play();
		System.out.println();
		
	}

//Test2 상속받은 play,job 호출가능
public static void hello2(Test2 t2) {
	
		t2.play();
		t2.job();
		System.out.println();
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello1(new Test3());
		hello2(new Test3());
	}

}
