package day1212;

import java.util.Scanner;

public class Ex10Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 상품(sangpum)과 수량(su),단가(dan)을 입력받은후
		 * 총금액(total)을 출력하시오
		 * 단, 수량이 5개이상이면 총금액의 10프로를 할인된 금액으로 출력해주세요
		 * 도 같이 출력해주세요
		 * 
		 * (예)
		 * 상품명:바나나킥
		 * 수량:5개
		 * 단가 : 1000원
		 * 총금액 : 4500원
		 * 
		 */
		
		Scanner sc=new Scanner(System.in);
		String sang; //상품명 변수선언
		int su,dan,total; //수량,단가,총금액 변수 선언
		
		System.out.println("상품명을입력하세요.");
		sang=sc.nextLine();//불러올 변수입력
		
		System.out.println("수량을입력하세요.");
		su=sc.nextInt();//불러올 변수입력
		
		System.out.println("단가를입력하세요.");
		dan=sc.nextInt();//불러올 변수입력
		
		total=su<5?su*dan:(int)((su*dan)*0.9); //수량이 5개일때 10프로 할인된 금액 계산
		
		System.out.println("상품명 : "+sang);
		System.out.println("수량 : "+su+"개");
		System.out.println("단가 : "+dan+"원");
		System.out.println("총금 : "+total+"원"+(su<5?"":"(할인됨)"));
	}

}
