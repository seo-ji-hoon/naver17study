package day1212;

import java.util.Scanner;

public class test1212 {

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
		
		System.out.println("가지고있는돈");
		money=sc.nextInt();
		
		if(money<0)//가격 마이너스 안되게
		{
			System.out.println("값의 범위를 벗어났습니다.");
			return; //현재 매서드를 종료합니다.
		}
		
		System.out.println("cony 가격입력");
		cony=sc.nextInt();
		
		if(cony<0)//cony가격 마이너스 안되게
		{
			System.out.println("값의 범위를 벗어났습니다.");
			return; //현재 매서드를 종료합니다.
		}
		
		System.out.println("수량을 입력하세요");
		count=sc.nextInt();
		
		if(count<0)//수량 마이너스 안되게
		{
			System.out.println("값의 범위를 벗어났습니다.");
			return; //현재 매서드를 종료합니다.
		}
		
		total=cony*count;
		
		if(money>=total) //돈이 총금액보다 크거나 같으면 살수있고
			System.out.println("살수있다.");
		else // 그러지않으면 살수없다.
			System.out.println("살수없다.");
	}

}
