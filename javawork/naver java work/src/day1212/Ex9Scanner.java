package day1212;

import java.util.Scanner;

public class Ex9Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String name;
		double height,weight;
		char s;
		System.out.println("이름입력");
		name=sc.nextLine(); //버퍼의 엔터를 읽어서 없앤다.
		System.out.println("키와 몸무게 입력");
		height=sc.nextDouble();//더블을 출력
		weight=sc.nextDouble();
		System.out.println("**"+name+"님의 키와 몸무게**");
		System.out.println("키"+height+"\t몸무게:"+weight);
		
		
	}

}
