package day1217;

public class Ex4ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//#1 String 배열
		
		String[] str1;
		str1=new String[4]; //객체인 경우는 null 값으로 초기값 지정이됨
		
		str1[0]="Hello";
		str1[3]="Kitty";
		
		for(int i=0;i<str1.length; i++) {
			
			System.out.println("str1["+i+"]="+str1[i]);
		}
		System.out.println("=".repeat(30));
		
		//#2 String 배열 결과만 출력
		String []str2;
		
		str2=new String[] {"초록색","분홍색","빨강색","노랑색"};
		
		for(String s:str2) {
			
			System.out.println(s);
			
		}
		System.out.println("=".repeat(30));
		
		//#3 String 배열
		String []str3= {"아이유","뉴진스","아이브","에스파"};
		
		for(String s:str3) {
			
			System.out.println(s);
			
		}
		
		
		
		
		
		
		
	}

}