package bookjava;

import java.util.Scanner;

public class Ex3If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String userId=sc.nextLine();
		System.out.println("비밀번호를 입력하세요.");
		String userPw=sc.nextLine();
		
		//userId가 m111이면
		if(userId.equals("m111")) {
			System.out.println("아이디가 일치합니다.");
		}else {
			System.out.println("아이디가 일치하지않습니다.");
		}
		
		//userPw가 1111이면
		if(userPw.equals("1111")) {
			System.out.println("비밀번호가 일치합니다.");
		}else {
			System.out.println("비밀번호가 일치하지않습니다.");
		}
	}

}
