package day1212;

import java.util.Scanner;

public class test1212_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		/*
		 * [문제]
		 * 
		 * 숫자 하나를 입력받는다.
		 * 사용자가 입력한 숫자가 "짝수" 인지 "홀수"인지를 판단해서 출력한다.
		 * 
		 * 짝/홀 계산법
		 *
		 * 입력받은숫자 % 2 = 0 이면 짝수, 1이면 홀수
		 * 입력받은 숫자가 0 이하일 경우 "잘못 입력됐다"고 알려주고 프로그램을 멈춘다.
		 * 
		 */

		//숫자를 입력받는다.
		int count;
		
		System.out.println("숫자를 입력하세요");
		count=sc.nextInt();
		
		//입력받은 숫자가 0이하일경우 잘못됐다 출력
		if(count<0)//0이하일떄
		{
			System.out.println("잘못입력함.");
			return; //현재 매서드를 종료합니다.
		}
				 
		//입력한게 짝수인지 홀수인지 판단
		if(count%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
		
	}

}
