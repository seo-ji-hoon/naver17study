package day1212;

import java.util.Scanner;

public class Ex14if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int score;
		String grade;
		
		System.out.println("점수를 입력해주세요");
		score=sc.nextInt();
		
		//if-else 선언
		//점수가 0-100의 값을 벗어나면 메서드를 종료
		// if(!(score>=0 && score<=100)) // 방법1 - 0점에서 100점까지
		if(score<0||score>100)//방법2 - 0점에서 100점까지
		{
			System.out.println("값의 범위를 벗어났습니다.");
			return; //현재 매서드를 종료합니다.
		}
		
		if(score>=90) //score(점수) 변수가 90점이상일때 grede(등급) 'A'
			grade="A";
		else if(score>=80)//score(점수) 변수가 80점이상일때 grede(등급) 'B'
			grade="B";
		else if(score>=70)//score(점수) 변수가 70점이상일때 grede(등급) 'C'
			grade="C";
		else if(score>=60)//score(점수) 변수가 60점이상일때 grede(등급) 'D'
			grade="D";
		else //score(점수)그이하는 grede(등급)이 'F'
			grade="F";
		
		//90점이상이면 a 나머지f
		if(score>=90)
			grade="a";
		else
			grade="f";
		
		//80점이상 a 60점이상이면 b 나머지 f
		if(score>=80)
			grade="a";
		else if(score>=60)
			grade="b";
		else
			grade="f";
		
		
		grade = "A";
		
		if(score<=50)
			grade="f";
		System.out.println("너의점수는?"+grade);
		
		
		
		System.out.printf("%d 점의 학점은 %s학점입니다.\n",score,grade); // 출력
		
		
	}

}
