package jihoon_test;

import java.util.Scanner;

public class Day1214_2 {

	public static void main(String[] args) {
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
		
		int n,dd=1400; //입력받는 변수 (n) , 현재달러변수 (dd)
		
		System.out.println("달러 입력");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
				
			dd*=i;
			dd=dd*i;
			
			// i=1  1400*i = 1400
			// i=2 1400*2 = 2800
			// i=3 2800*3 = 
			
			//System.out.println(i*dd);
	
		}

	}

}