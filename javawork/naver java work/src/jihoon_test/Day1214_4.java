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

		for(int i=1; i<=9; i++) {
			
			int total;
			total=n*i;
			
			if(total>=30) {
				
				System.out.println(n+"x"+i+"="+total);
			}
			
		}
		
		
		
		
		
		
	}

}
