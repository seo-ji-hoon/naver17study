package day1213;

public class Ex5While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while문
		
		int a=10;
		//while 은 조건이 맞지 않으면 한번도 실행안하고 빠져나온다.
		while(a<10)
		{
			System.out.println("while loop");
		}
		
		//do~while은 일단 한번 실행후 조건을 비교하므로 조건이 맞지 않아도 최소 한번은 문장이 실행된다.
		do {
			System.out.println("do~while loop");
		}while(a<10);
			
		a=1;
		while(a<=10) {
			System.out.printf("%3d",a++);
		}
		
		System.out.println();
		a=1;
		while(true)//조건이 맞으면
		{
			System.out.printf("%3d",a++);//a++후치사용
			if(a>10) //a가 10보다 크면
				break;
		}
		System.out.println();
		a=0;
		while(a<10) //a보다 10이 크고
		{	
			System.out.printf("%3d",++a);//++전치사용
		}
		System.out.println();
		a=1;
		do {
			System.out.printf("%3d",a++);
		}while(a<=10); //a가 10보다 크거나 같을때
	}

}
