package jihoon_test;

import java.util.Scanner;

public class Test1217_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		/*
		 * 
		 * 1글자씩 입력하다가 x(대소문자 상관없음)를 입력하면 빠져나와서
		 * 입력한 데이터들을 분석한 결과를 출력하시오.
		 * 
		 * 대문자:3
		 * 소문자:4
		 * 숫자:3
		 * 
		 */
		
		char ch;
		int high=0,lower=0,number=0;
		
		while(true) {
			
			System.out.println("입력하세요.(종료버튼 x)");
			ch=sc.nextLine().charAt(0);
			
			if(ch=='x' || ch=='X') {
				
				System.out.println("프로그래을 종료합니다.");
				break;
			}
			
			if(ch>=97 && ch<=122) //소문자 입력시 저장
				lower++;
			else if(ch>=65 && ch<=90) //대문자 입력시 저장
				high++;
			else if(ch>=48 && ch<=57) //숫자 입력시 저장
				number++;	
		}
		System.out.println("대문자 : "+high);
		System.out.println("소문자 : "+lower);
		System.out.println("숫자 : "+number);
	}
	

}
