package bookjava;

import java.util.Scanner;

public class Ex1If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자형 int 정수 score에 93을 입력
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score=sc.nextInt();
		
		if(score<0 || score>=100) {
			System.out.println("잘못된 점수입니다.");
		}else if(score>=90) {
			System.out.println("90점보다 크네요");
			System.out.println("A등급입니다.");
		}else if(score>=80) {
			System.out.println("80점보다 크네요");
			System.out.println("B등급입니다.");
		}else if(score>=70) {
			System.out.println("70점보다 크네요");
			System.out.println("C등급입니다.");
		}else {
			System.out.println("그 이하점수는 F입니다.");
		}
	}

}
