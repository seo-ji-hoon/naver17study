package jihoon_test;

import java.util.Scanner;

public class Day1215_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		// 달러를 입력받으면 원화를 계산해서 출력하는 프로그램을 만들어라
		
				// 현재 달러는 1400원
				// 
				// 1부터 내가 입력한 숫자 만큼 1씩 증가한 값을 이용해 원화를 출력한다
				
				// 예시
				
				// 입력한 값 3 이라면?
				
				// 출력되는 값
				// 1 : 1400
				// 2 : 2800
				// 3 : 3... ㅋㅋㅋㅋ 
				
				// 이렇게 나오게 출력하시오!
		
//		int n,dd=1400,total=0;
//		
//		System.out.println("숫자를 입력하세요");
//		n=sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			total+=dd;
//			System.out.println(total);
//		}
		
		/*		  
		 * 문제2
		 * 5명의 나이를 입력후
		 * 
		 * 40세 이상과 40세미만이 각각 몇명인지 출력하고
		 * 
		 * 평균 나이(결과/5) 도 같이 출력하시오
		 * (**for문 사용**)
		 * 
		 */
		
//		int age,old=0,young=0,total=0;
//		
//		for(int i=1; i<=5; i++) {
//			
//			System.out.println("나이를 입력하세요.");
//			age=sc.nextInt();
//		if(age>=40) {
//			
//			old++;
//		}
//		else {
//			
//			young++;
//		}
//		
//		total+=age;
//		
//		}
//		
//		System.out.printf("40세 이상 : %d , 40세미만 : %d, 평균나이 : %d",old,young,total/5);
//		
		/*
		 * 문제1
		 * 숫자 n을 입력하면 1부터 n까지의 합계를 구하시오
		 * (**for문 사용해서**)
		 * 
		 */
		
//		int n,total=0;
//		
//		System.out.println("숫자를 입력해라");
//		n=sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			
//			total+=i;
//			
//		}
//		
//		System.out.println(total);
		
		
		/*
		 * 
		1. 구구단 홀수만 출력
		
		사용자로부터 숫자 n을 입력받아, n,i같 같으면 안나오게 경우만 출력하세요.
		예: n = 3일 때
		코드 복사
		3 x 1 = 3
		3 x 3 = 9
		3 x 5 = 15
		3 x 7 = 21
		3 x 9 = 27
		*/
		
//		int n,total=0;
//		
//		System.out.println("숫자를 입력해랏");
//		n=sc.nextInt();
//		
//		for(int i=1; i<=9; i++) {
//			
//			total=n*i;
//			
//		if (n!=i) {
//			
//			System.out.printf("%d x %d = %d \n",n,i,total);
//			
//		}	
//		
//		}
		
		//배구대회순위를 입력하면 1등을하면 금,2등하면 은, 3등하면 동 출력되게
		
		int n;
		String grade;
		
		System.out.println("배구 순위를 입력하세요.");
		n=sc.nextInt();
		
		switch(n) {
		
		case 1:
			grade="금";
		break;
		
		case 2:
			grade="은";
		break;
		
		default :
			grade="동";
		
		}
		
		System.out.println(grade);
	}

}