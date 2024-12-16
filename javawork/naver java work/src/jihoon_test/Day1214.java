package jihoon_test;

import java.util.Scanner;

public class Day1214 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*
		 * 문제1
		 * 
		 * 숫자 n을 입력하면 1부터 n까지의 합계를 구하시오
		 * (**for문 사용해서**)
		 * 
		 */
		
		int n,total=0;
		
		System.out.println("숫자를 입력하세요.");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
			
			total+=i;
		} 
		System.out.println("합계는"+total);
		
		
		
		
		
	}

}
