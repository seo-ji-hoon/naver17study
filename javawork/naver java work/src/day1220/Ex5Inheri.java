package day1220;

class Parent1 {
	
	public void process() {
		System.out.println("기본 작업을 한다.");
	}
}
/////////////////////////////////////////////////
class My1 extends Parent1{


	@Override
	public void process() {
		
		super.process();
		System.out.println("벽지작업을 한다.");
	}
	
}
///////////////

class My2 extends Parent1 {
	
	@Override
	public void process() {
		
		super.process();
		System.out.println("바닥작업을한다.");
	}
}

public class Ex5Inheri {
	public static void homeProcess(My1 my) {
		
		my.process();
		
	}
	
public static void homeProcess(My2 my) {
		
		my.process();
		
	}

public static void homeProcessALL(Parent1 p) {
	
	p.process();//p 안에 누가 생성되어있느냐에 따라서 서로 다른일을 처리한다.
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My1 my1=new My1();
//		my1.process();
//		
		My2 my2=new My2();
//		my2.process();
		
		homeProcess(my1);
		homeProcess(my2);
		System.out.println("=".repeat(20));
		
		//다형성 처리
		Parent1 p1=null;
		p1=new My1();
		p1.process(); //My1이 가진 process 메서드가 호출
		
		p1=new My2();
		p1.process();//My2가 가진 process 메서드가 호출
		System.out.println("=".repeat(20));
		
		homeProcessALL(new My1());
		homeProcessALL(new My2());
		homeProcessALL(new Parent1());
		
	}

}