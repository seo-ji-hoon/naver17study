package jihoon_test;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Day1214_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	

		/*
		1. 구구단 홀수만 출력
		
		사용자로부터 숫자 n을 입력받아, n단에서 곱하는 값이 홀수인 경우만 출력하세요.
		예: n = 3일 때
		코드 복사
		3 x 1 = 3
		3 x 3 = 9
		3 x 5 = 15
		3 x 7 = 21
		3 x 9 = 27
		*/
		
		int n;
		
//		System.out.println("곱하려는 숫자입력");
//		n=sc.nextInt();
//		
//		for(int i=1;i<=9;i++) {
//			if(i%2!=0) {
//				System.out.printf("%d x %d = %d \n",i,n,i*n);
//			}
//		}
		
		
		int num; 
		System.out.println("곱하려는 숫자입력");
		num = sc.nextInt();

		// 1. 구구단 출력해보기 ! 
		for (int i=1; i<=9; i++) {

			if (i % 2 == 1) {
				System.out.printf("%d x %d = %d \n", num, i, (num*i));				
			}
			
			System.out.println("hello");
			
		}
	}

}
