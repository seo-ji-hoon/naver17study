package jihoon_test;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Day1214_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	

	/*
	 * 4. 곱한 값이 30인 경우 출력 멈추기
	 * 
		  사용자로부터 숫자 n을 입력받아,
		  
		  n단을 출력하되 
		  곱셈 결과가 30이상 경우 출력 후 멈추기.
		예: n = 7일 때
		코드 복사
		7 x 1 = 7
		7 x 2 = 14
		7 x 3 = 21
		7 x 4 = 28
	 */
		
		int n;
		
		System.out.println("숫자입력");
		n=sc.nextInt();
		
		for(int i=1; i<=9; i++)
		{	
			int total=n*i;
			
			if (total>=30) 
			{
				break;
			}
			System.out.printf("%d x %d = %d \n", n, i, total);
		}
		
		
		
		
		
		
		
		
		
	}

}
