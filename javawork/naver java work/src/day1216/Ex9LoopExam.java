package day1216;

import java.util.Scanner;

public class Ex9LoopExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		for (int i=1; i<=5; i++) { //행			
			for(int j=1; j<=5; j++) { //열
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=".repeat(15));
		
		//
		
		for(int i=1; i<=5; i++) { //행	
			
			for(int j=1; j<=i; j++) { //열
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.print("=".repeat(15));
		System.out.println();
		
		//
		
		for(int i=1; i<=5; i++) {//행
			
			//for(int j=i; j<=5; j++)//열
			for(int j=5; j>=i; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=".repeat(15));
	}
	

}