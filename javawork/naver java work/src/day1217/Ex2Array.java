package day1217;

public class Ex2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []ch; //배열선언
		
		ch=new char[4]; //0~3번 인덱스까지 데이터를 넣을수있다.
		
		System.out.println("배열크기 : "+ch.length); //ch.length 메서드
		
		//배열에 데이터 넣기
		ch[0]='H';
		ch[1]=65; //'A'
		ch[2]='x';
		ch[3]='t';
		
		//#1 출력
		for(int i=0;i<ch.length; i++) {
			
			System.out.println("ch["+i+"]="+ch[i]);
		}
		System.out.println();
		
		//#2 출력  결과만 출력하는방법
		for(char a:ch) {
			System.out.println(a);
		}
		System.out.println("=".repeat(30));

		
		//배열선언 2
		
		char []ch2=new char[5];
		ch2=new char[] {'a','n','x','y','u'}; //new char[] 할당을 꼭해줘야함
		for(int i=0; i<ch2.length;i++ ) {
			
			System.out.println("ch2["+i+"]="+ch2[i]);
		}
		System.out.println("=".repeat(30));
		
		//배열 선언3 결과만 출력하기.
		char []ch3= {'s','r','t','v','i'};
		for(char a:ch3) {
			System.out.println(a);
		}
		
	}

}