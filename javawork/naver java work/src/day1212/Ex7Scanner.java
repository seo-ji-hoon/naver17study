package day1212;

import java.util.Scanner;

public class Ex7Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);//키보드로부터 입력시
		String word;
		System.out.println("문장을입력해보세요");
//		word=sc.next();//한단어만 읽어온다.
//		System.out.println("내가 입력한 단어는\""+word+"\"입니다."); //역슬레쉬를 이용해서 따음표 표현할수있음
		
		word=sc.nextLine();//엔터를 누르면 한줄을 통째로 읽어온다.
		System.out.println("내가 입력한 문장은"+word+"입니다.");
		
		int age;
		System.out.println("나이를 입력하세요");
		age=sc.nextInt();
		System.out.println("내나이는"+age+"세입니다.");
		
	}

}
