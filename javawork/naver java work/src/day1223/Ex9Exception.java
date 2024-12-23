package day1223;

import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Ex9Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ex8번의 예제에서 catch 2개를 하나로 합치기
		
		Scanner sc=new Scanner(System.in);

		int birthYear,age;
		try {
			System.out.println("태어난년도는 ? ");
			birthYear=Integer.parseInt(sc.nextLine()); // 잘못입력시 바로 catch로 이동

			Date date=null;
			age=(date.getYear()+1900)-birthYear;

			//age=2024-birthYear;

			System.out.println("내 나이는"+age+"세 입니다.");
		}catch(NumberFormatException|NullPointerException e) {
			//둘중 하나의 이셉션 발생시 catch로 이동
			System.out.println("예외 발생 : "+e.getMessage());
		}
		
		System.out.println("정상종료");
	}

}
