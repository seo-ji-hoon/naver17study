package jihoon_test;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Day1214_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	

		/*
		2. 결과가 20 이상인 경우만 출력
		사용자로부터 숫자 n을 입력받아, 
		n단에서 곱셈 결과가 30 이상인 경우만 출력하세요.
		
		예: n = 4일 때
		코드 복사
		4 x 5 = 20
		4 x 6 = 24
		4 x 7 = 28
		4 x 8 = 32
		4 x 9 = 36
		*/
		
		int n; // 숫자를 입력받는다. 변수선언
		
		System.out.println("숫자입력해라");
		n=sc.nextInt();
		
		//i는 '1'이고; 1이 9보다 작거나 같을떄; 1이 증가; 
		for(int i=1; i<=9 ; i++) {
			
			// i*n 결과값을 total로 변수 선언
			int total=i*n;
			
			//만약에 total이 30보다 크거나 같을때인것만 출력
			if (total>=30) 
			{
			
				System.out.printf("%d x %d = %d \n",n,i,total);
			}
		
		}
		
		
		
		
		
		
		
	}

}
