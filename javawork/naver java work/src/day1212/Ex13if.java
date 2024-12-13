package day1212;

import java.util.Scanner;

public class Ex13if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int x,y,max;
		System.out.println("두수를 입력해주세요");
		x=sc.nextInt();
		y=sc.nextInt();
		
		//it-else문 선언 **if뒤에는 ;를 붙히지않는다.
		if(x>y)
			max=x;
		else
			max=y;
		//만약x가y보다 크면 max->x를 주고 그렇지않으면 max->y를 준다.
		
		System.out.println("더 큰수는"+max+"입니다.");
		
		
		}

}
