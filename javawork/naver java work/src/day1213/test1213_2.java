package day1213;

import java.util.Scanner;

public class test1213_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		 *
		 *고객이 가지고잇는돈을 입력받고
		 *주식(cony)의 가격을 입력을 받아. 가격도 마이너스가되면안됨.
		 *내가 사고싶은 개수를 입력해 0보다 작은면 안됨.
		 *
		 *그랫을때 살수있는지 없는지?!!!!!!
		 *주문이 체결됐습니당.
		 *금액이 부족합니다.
		 */
		int money,cony,count,total;
		
		System.out.println("가지고있는돈을 입력하세요");
		money=sc.nextInt();
		System.out.println("cony 가격을 입력하세요");
		cony=sc.nextInt();
		System.out.println("사고싶은 수량개수를 입력하세요");
		count=sc.nextInt();
		
		total=cony*count; //코니가격과 수량에대한 값
		if(money<0) {
			System.out.println("값의 범위가 넘어감");
			money=sc.nextInt();
			return;
		}
		if(cony<0) {
			System.out.println("값의 범위가 넘어감");
			cony=sc.nextInt();
			return;
		}
		if(count<0) {
			System.out.println("값의 범위가 넘어감");
			count=sc.nextInt();
			return;
		}
		
	}

}