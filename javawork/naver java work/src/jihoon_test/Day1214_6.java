package jihoon_test;

import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.Scanner;

public class Day1214_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	

		int number=10,add=5;
		
		number=number+add;
		
		number=number+add;
		
		add=add+add;
		
		System.out.printf("number : 20 , add : 10, number : %d , add : %d ",number,add);
	
		if (number>10) {
			System.out.println("HELLO");
			
			add = 1;
		}
		for (int i=add; i<=add+1; i++) {
			System.out.println("opo");
		}
		
		int price=0;
		String name;
		System.out.println("입력");
		name = sc.nextLine();
		
		switch (name) {
		
			case "테슬라":
				price=400;
				break;
				
			case "엔비디아":
				price=150;
				break;
				
			case "아마존":
				price=200;
				break;	
				
			default:
				price=0;
		}
		
		
		int money=300;
		
		
		// price 가 0 이면 잘몬 입력햇습니다 출력
		// money 가 price 보다 작으면, 살수없습니다. 출력
		// 그 외에는 name 과 price 출력
		if (price==0) { // 0<=0
			System.out.println("잘못입력했습니다.");
		}
		else if (money<price){
			
			System.out.println("살수없습니다.");
		}
		else {
			System.out.printf("%s,%d",name,price);
		}
		
		
	}

}
