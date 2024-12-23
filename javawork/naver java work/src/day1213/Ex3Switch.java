package day1213;

import java.util.Scanner;

public class Ex3Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 년도와 월을 입력후 윤년인지 평년인지 출력하고
		 * 그 월이 몇일까지 있는지 구하시오
		 * 
		 * 윤년이란 년도%4== && 년도%100!=0 || 년도%400==0
		 *  
		 */
		Scanner sc=new Scanner(System.in);
		
		int year,month,days; //숫자형 정수 int에 year,month,days 라는 변수를 선언
		
		System.out.println("년도와 월을 입력하세요"); //년도와 월을 입력할수있게 출력
		year=sc.nextInt(); //year 입력
		month=sc.nextInt(); //month 입력
		
		boolean b=year%4==0 && year%100!=0 || year%400==0; //true이면 윤년, false면 평년
		
		//만약 b가 true이면 윤년입니다. 그렇지않으면 평년입니다. 출력
		if(b) //b==true 일경우는 b만 입력하고, b==false 일경우는 !b 이렇게 쓴다.
			System.out.println(year+"년도는 윤년입니다.");
		else
			System.out.println(year+"년도는 평년입니다.");
		
		switch(month)
		{
		case 2://2월은 윤년이면 29일 평년이면 28일이 나오게 선언
			days=b?29:28;
			break;
		case 4: //4,6,9,11월은 30일까지있는다는거를 선언
		case 6:
		case 9:
		case 11:
			days=30;
			break;
		case 1: case 3: case 5: case 7: case 8:
		case 10: case 12: //1,3,5,7,8,10,12 월은 31일까지있는다는거를 선언
			days=31;
			break;
		default:
			days=-1; //잘못입력시를 위해 -1로 선언
		}
		
		if(days==-1 ) {
			System.out.println("1~12 월을 벗어난 값입니다");
		}else {
			System.out.printf("%d년 %d월은 %d일까지 있습니다.",year,month,days);
		}
				
	}

}
