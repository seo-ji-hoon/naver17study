package day1213;

public class Ex6While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=65;
		while(a<=90){
			//System.out.printf("%c",a++);
			System.out.print((char)a++); //char로 형변환 char가 없으면 아스키코드로만 출력
		}
		System.out.println();
		char b='a';
		//do~while 문을 이용해서 a부터 z까지 출력
		do {
			System.out.print(b++);
		}while(b<='z'); 
		
		System.out.println();
		int n=0; //숫자형정수 int로 n을선언
		while(n<=10)//n이 10보다 작거나 같을 때
		{
			n++; //n을 후치
			if(n%2==0)//만약에 n을 2로 나눈 나머지가 0이면
				continue; //조건식으로 이동 (while 이나 do~while에서)
			System.out.printf("%3d",n);
		}
	}

}
