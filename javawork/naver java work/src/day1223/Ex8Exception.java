package day1223;

import java.util.Date;
import java.util.Scanner;

public class Ex8Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int birthYear,age;
		try {
		System.out.println("태어난년도는 ? ");
		birthYear=Integer.parseInt(sc.nextLine()); // 잘못입력시 바로 catch로 이동
		
		Date date=null;
		age=(date.getYear()+1900)-birthYear;
		
		//age=2024-birthYear;
		
		System.out.println("내 나이는"+age+"세 입니다.");
		}catch (NumberFormatException e) {
			System.out.println("숫자로만 입력해주세요 : "+e.getMessage());
		}
		catch (NullPointerException e) {
			System.out.println("date 변수가 null입니다. : "+e.getMessage());
		}
		System.out.println("정상종료");
	}

}