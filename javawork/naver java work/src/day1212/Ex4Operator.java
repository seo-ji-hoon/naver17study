package day1212;

public class Ex4Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//관계연산자(>,<,>=,<=,==,!=(같지않다)) , 논리 연산자(&&,||,!) => 결과값은 무조건 boolean (true아니면false)
		
		int kor=89,eng=100,mat=89;
		boolean	f=false;
		
		System.out.println(kor>eng);//false
		System.out.println(kor<eng);//true
		System.out.println(kor==mat);//true
		System.out.println(kor!=mat);//false
		System.out.println(kor>eng && ++eng>mat);//false -> false && true = 첫번째 조건이 안맞을 경우 두번째조건은 비교하지않고 출력이된다.
		System.out.println(eng);//증강연산자를 써도 증강이 되지않고 100으로 출력
		System.out.println(kor>eng || ++eng>mat);//true -> true || false = 첫번째가 true일 경우 두번째조건은 비교하지않고 출력이된다.
		System.out.println(eng);//증강연산자를 쓰게되면 1증가되어있게 출력됨
		System.out.println(!(kor>eng));//true
		System.out.println(!f);//true
		
		
	}

}
