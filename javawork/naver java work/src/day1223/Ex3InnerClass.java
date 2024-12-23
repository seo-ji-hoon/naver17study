package day1223;

//추상클래스
abstract class AbstEx {
	
	abstract public void show();
}

interface MyDB {
	
	public void list();
	public void insert();
}

class SubMyDB implements MyDB {
	
	@Override
	public void list() {
		System.out.println("목록출력 2");
	}
	
	@Override
	public void insert() {
		
		System.out.println("insert 2");
	}
}

public class Ex3InnerClass {
	
	//익명 내부 클래스 형태로 구현
	AbstEx abst1=new AbstEx() {
		
		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("show 호출");
		}
	};
	
	//익명 내부 클래스 형태로 구현
	MyDB myDB=new MyDB() {
		
		@Override
		public void list() {
			// TODO Auto-generated method stub
			System.out.println("DB 목록을 출력합니다.");
			
		}
		
		@Override
		public void insert() {
			// TODO Auto-generated method stub
			System.out.println("DB 에 데이타를 추가합니다.");
			
		}
	};
	
	MyDB myDB2=new SubMyDB();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex3InnerClass ex3=new Ex3InnerClass();
		ex3.abst1.show();
		System.out.println();
		
		ex3.myDB.list();
		ex3.myDB.insert();
		System.out.println();
		
		ex3.myDB2.insert();
		ex3.myDB2.list();
		
		
	}

}
