package jihoon_test;

import java.util.Scanner;

public class Test1217_4 {

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
		char str;
		int high=0,low=0,num=0;
		
		while(true) {
			
			System.out.println("문자를 입력하세요.(x를 누르면 종료)");
			str=sc.nextLine().charAt(0);
			
			if(str=='x'|| str=='X') {
				
				System.out.println("종료됩니다.");
				break;
			}
			
			if(str>='A' && str<='Z') {
				
				high++;
				
			}
			else if(str>='a' && str<='z') {
				low++;
			}
			else if(str>='0' && str<='9') {
				num++;
			}
			
			
		}
		System.out.println("대문자 : "+high);
		System.out.println("소문자 : "+low);
		System.out.println("숫자 : "+num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}