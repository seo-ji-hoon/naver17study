package day1212;

import java.util.Scanner;

public class Ex12Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		 * 이름(name)과 java,html,spring의 3과목 점수를 입력받은후
		 * 총점(sum)과 평균(avg),등급(grade), 합격여부를 출력하시오 
		 * 
		 * 등급은 평균이 90이상이면 "우등장학생",80이상이면 "50프로장학금",나머지는"노력"이라고 출력
		 * 합격여부는 3과목이 50이상이고 평균이 모두 70이상이면 "합격입니다.
		 * 나머지는 "불합격입니다" 라고 출력(출력문에서 직접 조건연산자로 출력하기)
		 */
		
		//변수선언하기
		String name,grade;
		int java,html,spring,sum;
		double avg;
		
		//엔터 출력
		System.out.println("이름입력");
		name=sc.nextLine();
		System.out.println("자바점수");
		java=sc.nextInt();
		System.out.println("html점수");
		html=sc.nextInt();
		System.out.println("spring점수");
		spring=sc.nextInt();
		
		//총점
		sum=java+html+spring;
		//평균
		avg=sum/3.0;
		//등급
		grade=avg>=90?"우등장학생":avg>=80?"50프로장학금":"노력";
		
		//정보값 출력
		System.out.println(name+"님의 성적 결과");
		System.out.println("자바점수"+java+"점");
		System.out.println("html점수"+html+"점");
		System.out.println("spring점수"+spring+"점");
		System.out.println("총점"+sum+"점");
		System.out.printf("평균: %5.1f점\n",avg);
		System.out.println("등급 : "+grade);
		
		System.out.println((java>=50&&html>=50&&spring>=50&&avg>=70?"합격":"불합격")+"입니다.");//합격여부
		
		
		/*String name,grade;
		int java,html,spring,sum,avg;
		
		grade=sum>=90?"우등장학생":sum>=80?"50프로장학금":"노력";
		
				
		System.out.println("이름을 입력하시오");
		name=sc.nextLine();
		System.out.println("java점수를 입력하세요");
		java=sc.nextInt();
		System.out.println("html점수를 입력하세요");
		html=sc.nextInt();
		System.out.println("spring점수를 입력하세요");
		spring=sc.nextInt();*/
		
	}

}
