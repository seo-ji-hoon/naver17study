package day1216;

import java.util.Scanner;

public class Ex10Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		/*
		 * 
		 * 구구단 한페이지에 나오게
		 * -----------------------줄 그어주고
		 * 2x1=2  3x1=3 - - - - - -
		 * 
		 * 다중 for문
		 */
			
		for(int dan=2; dan<=9; dan++) {
			
			System.out.print("["+dan+"단]\t");
		}
			
		System.out.println();
		System.out.println("=".repeat(65));
		
		for(int i=1;i<=9;i++) {
			
			for(int dan=2; dan<=9;dan++) {
					
				System.out.print(dan+"x"+i+"="+dan*i+"\t");
					
			}
				System.out.println();
		}
		
		
		
		
	}
	
}
