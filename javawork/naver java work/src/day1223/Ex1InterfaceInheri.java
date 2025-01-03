package day1223;

interface InterA {
	
	public void study();
		
}

//인터페이스끼리의 상속은 extends
interface InterB extends InterA {
	
	public void play(); 
		
}

//클래스가 인터페이스 구현시 implements 
class MyInter implements InterB {
	
	
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("그룹 스터디를 합니다.");
		
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("그룹 모임을 합니다.");
		
	}
	
	public void job() {
		
		System.out.println("밀린 일처리를 합니다.");
	}
	
}



public class Ex1InterfaceInheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterA interA=new MyInter(); //InterA 생성
		interA.study(); //호출
		
		//다운케스팅으로 job을 호출
		((MyInter) interA).job();
		System.out.println("=".repeat(20));
		
		InterB interB=new MyInter();//InterB 생성
		interB.play();//호출
		interB.study();//호출4
		
		//다운 케스팅으로 job을 호출하기
		((MyInter) interB).job();
		
		System.out.println("=".repeat(20));
		
		MyInter my=new MyInter();//MyInter 생성
		my.play();//호출
		my.study();//호출
		my.job();//호출
	}

}
