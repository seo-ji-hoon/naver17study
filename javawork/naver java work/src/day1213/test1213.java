package day1213;

import java.util.Scanner;

public class test1213 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		 * 문제1
		 * 숫자 n을 입력하면 1부터 n까지의 합계를 구하시오
		 * (**for문 사용해서**)
		 * 
		 */
		
		//숫자n을 입력해야하므 n이라는 숫자형 정수형으로 선언
		int n;
		
		//n에대한 입력을 받아야함.
		System.out.println("n을 입력하세요.");
		n=sc.nextInt();
		
		//합계(total)저장할 변수선언.
		int total=0;
		
		//fot문선언.
		for(int i=1;i<=n;i++);
		total+=n; //합계와 입력한 내용을 더함.
		
		System.out.println(total+n);
		
		
		
		
	}

}