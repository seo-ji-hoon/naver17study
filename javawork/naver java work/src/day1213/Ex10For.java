package day1213;

public class Ex10For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) //3번째값은 증강연산자또는 대입연산자만 올수있다.
			System.out.print(i+" ");
		System.out.println();
		
		for(int i=1;i<=10;i+=2)
			System.out.print(i+" ");
		System.out.println();
		
		for(int i=10;i>=1;i--)
			System.out.print(i+" ");
		System.out.println();
		
		for(int i=10;i<=100;i+=10)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("break");
		
		for(int i=1;i<=10;i++) //i가 1일때,10 하고 같거나 클때,1개씩 증강
		{
			System.out.print(i+" ");
			if(i==5) // 5까지만 입력후 빠져나가기.
				break;
		}
		System.out.println();
		System.out.println("continue");
		for(int i=0;i<=10;i++) //i가 1일때,10 하고 같거나 클때,1개씩 증강
		{
			if(i%2==1)//
				continue;//i++ 로 이동
			System.out.print(i+" ");
		}
		
		
	}

}
