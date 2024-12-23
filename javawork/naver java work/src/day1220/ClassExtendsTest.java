package day1220;

//부모
class Boss {
	
	private String schoolName;
	
	// ClassExtendsTest class01 = new ClassExtendsTest();
	public Boss() {
		System.out.println("1 : 메인 클래스의 기본 생성자 -> schoolName은 청담고등학교");
		schoolName="청담고등학교";
	}
	
	// ClassExtendsTest class02 = new ClassExtendsTest("배구고등학교");
	Boss(String schoolName){
		System.out.println("2 : 메인 클래스의 생성자(schoolName) -> schoolName은 파라미터를 받아서 설정");
		this.schoolName=schoolName;
	} 

	public void write() {
		System.out.println("3 : 메인 클래스의 학교명 출력");
		System.out.println("학교명 : "+schoolName);
	}
}

//상속#1
class AClass extends Boss {
	
	private String studentName;
	
	public AClass() {
		System.out.println("1-1 : A 클래스의 기본 생성자 -> studentName은 이름없음");
		studentName="이름없음";
		
	}
	
	AClass(String schoolName,String studentName){
		super(schoolName);
		System.out.println("1-2 : A 클래스의 생성자(파라미터 두개 받음) -> studentName은 받은걸로");
		this.studentName=(studentName);
	}
	 
	@Override
	public void write() {
		System.out.println("1-3 : 롸이튜");
		super.write(); //부모가 처리한 로직 실행 - 호출위치는 상관이없다.
		System.out.println("1-3 : 학생이름 : "+studentName);
	}
}
//상속 #2
class BClass extends Boss {
	
	private String teacherName;
	
	public BClass() {
		System.out.println("1-1 : B 클래스의 기본 생성자 -> teacherName은 이름없음");
		teacherName="이름없음";
	}
	
	BClass(String schoolName,String teacherName){
		
		super(schoolName);
		System.out.println("1-2 : B 클래스의 생성자(파라미터 두개 받음) -> teacherName은 받은걸로");
		this.teacherName=(teacherName);
	}
	
	@Override
	public void write() {
		System.out.println("1-3 : 롸이튜");
		System.out.println("선생님이름 : "+teacherName);
		System.out.println("1-4 : 슈퍼라이트");
		super.write();
		System.out.println("1-5 : 라이트끝");
		
	}
	
}
///////////////////////////////////////////
public class ClassExtendsTest {


	public static void main(String[] args) {
		System.out.println("s1 은 AClass");
		AClass s1=new AClass();
		

		System.out.println("s2 은 AClass");
		AClass s2=new AClass("강남고등학교","홍길동");
		

		System.out.println("s1.write()");
		s1.write();
		System.out.println();
		System.out.println("s2.write()");
		s2.write();
		

		System.out.println("s3 은 BClass");
		BClass s3=new BClass();
		System.out.println();
		System.out.println("s3.write()");
		s3.write();
		

		System.out.println("s4 은 BClass");
		BClass s4=new BClass("중동고등학교","이진");
		System.out.println();
		System.out.println("s4.write()");
		s4.write();
	}

}
