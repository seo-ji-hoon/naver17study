package day1212;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		/*
		 * 
		 * 상품(sangpum)과 수량(su),단가(dan)을 입력받은후
		 * 총금액(total)을 출력하시오
		 * 단, 수량이 5개이상이면 총금액의 10프로를 할인된 금액으로
		 * 다시출력해주세요(dctotal)
		 * 
		 * (예)
		 * 상품명:바나나킥
		 * 수량:5개
		 * 단가 : 1000원
		 * 총금액 : 5000원
		 * 
		 * 10프로 DC된 금액은 4500원입니다 => 5개 이상인 경우에만 출력되는 문장
		 * 
		 */
		
		String sangpum;
		int su,dan,total,dctotal;
		
		System.out.println("상품을입력하세요");
		sangpum=sc.nextLine();
		System.out.println("수량을 입력하세요");
		su=sc.nextInt();
		System.out.println("단가를 입력하세요");
		dan=sc.nextInt();
		
		total=su*dan;
		
		System.out.println("총금액 :"+total+"원");
		
		if(su>=5)
		{
			dctotal=total*90/10;
			System.out.println("할인된금액 : "+dctotal+"원");
			
		}
		
				
	}

}
