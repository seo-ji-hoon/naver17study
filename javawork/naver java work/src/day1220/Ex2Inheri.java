package day1220;

//부모
class SuperObj2{
	
	private String schoolName;
	
	public SuperObj2() {
		System.out.println(" SuperObj2 -> 1");
		
		schoolName="청담고등학교";
	}
	
	SuperObj2(String schoolName){
		System.out.println(" SuperObj2 -> 2");
		
		this.schoolName=schoolName;
		
	}
	
	public void write() {
		
		System.out.println("학교명 : "+schoolName);
	}
}

//상속#1
class SubObj2 extends SuperObj2 {
	
	private String studentName;
	
	public SubObj2() {

		System.out.println(" SubObj2 -> 1");
		studentName="이름없음";
		
	}
	
	SubObj2(String schoolName,String studentName){

		super(schoolName);
		System.out.println(" SubObj2 -> 2");
		this.studentName=(studentName);
	}
	
	//오버라이딩 -> 부모의 메서드를 재정의 했다는 의미
	@Override
	public void write() {
		// TODO Auto-generated method stub
		super.write(); //부모가 처리한 로직 실행 - 호출위치는 상관이없다.
		System.out.println("학생이름 : "+studentName);
	}
}
//상속 #2
class SubObj22 extends SuperObj2 {
	
	private String teacherName;
	
	public SubObj22() {
		
		teacherName="이름없음";
	}
	
	SubObj22(String schoolName,String teacherName){
		
		super(schoolName);
		this.teacherName=(teacherName);
	}
	
	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("선생님이름 : "+teacherName);
		super.write();
		
	}
	
}
///////////////////////////////////////////
public class Ex2Inheri {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubObj2 s1=new SubObj2();
		SubObj2 s2=new SubObj2("강남고등학교","홍길동");
		
		System.out.println("=== 1 ===");
		s1.write();
		System.out.println("=== 1 ===");
		System.out.println();
		System.out.println("=== 2 ===");
		s2.write();
		System.out.println("=== 2 ===");
		
		SubObj22 s3=new SubObj22();
		System.out.println();
		System.out.println("===");
		s3.write();
		System.out.println("===");
		
		SubObj22 s4=new SubObj22("중동고등학교","이진");
		System.out.println();
		s4.write();
	}

}
