package day1213;

import java.util.Scanner;

public class Ex12For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	/*
	 * 문제1
	 * 숫자 n을 입력하면 1부터 n까지의 합계를 구하시오
	 * (**for문 사용해서**)
	 * 
	 */
		
		int n,sum=0;
		System.out.println("숫자 n 입력");
		n=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			sum+=i;
			
		}
		
		System.out.println("1부터"+n+"까지의 합계 : "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//숫자형정수 int n(입력)라는 변수 선언
//		int n;
//		
//		//숫자를 입력을 받는다.
//		System.out.println("숫자 n을 입력하시오");
//		n=sc.nextInt();
//		
//		int total=0; //합계를 저장해야함
//		
//		//for문 선언
//		for(int i=1;i<=n;i++) //i가 1일때,n이 i보다 같거나 클때,i가 1씩증가
//			total+=i; //입력한 점수와 토탈을 저장*
//			System.out.print(total+n);
//		System.out.println();

		

//		for(int i=1;i<=5;i++) //3번째값은 증강연산자또는 대입연산자만 올수있다.
//			System.out.print(i+" ");
//		System.out.println();
	}

}
