package day1212;

import java.util.Scanner;

public class iftest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		 * 예제 2: 나이로 성인 여부 판별
           사용자에게 나이를 입력받는다.
           입력받은 나이가 18 이상인지 확인한다.
           18 이상이면 **"성인입니다."**라고 출력한다.
           18 미만이면 **"미성년자입니다."**라고 출력한다.
		 */
		
		int age;
		
		System.out.println("나이를 입력해주세요");
		age=sc.nextInt();
		
		/*if(age>=18)
		{
			System.out.println("성인입니다.");
		}
		else
		{
			System.out.println("미성년자입니다.");
		}*/
		
		
		if(age<=18)
		{
			System.out.println("성인입니다.");
		}
		
		if(age>=18)
		{
			System.out.println("미성년자입니다.");
		}
	}

}
