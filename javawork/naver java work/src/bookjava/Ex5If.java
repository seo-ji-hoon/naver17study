package bookjava;

import java.util.Scanner;

public class Ex5If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		 * 국어, 영어 수학 점수를 입력하고 총점(국+영+수)을 이용하여 평균을 계산한 후 
		 * 평균이 90이상 "A", 80이상이면 "B", 70이상이면
		 * "C", 60이상이면 "D", 60미만이면 "F" 콘솔에 출력 되도록 프로그래밍 하세요. 
		 * Scanner, nextInt(), if문 사용
		 */
		
		int kor=0;
		int eng=0;
		int math=0;
		int total=0;
		double avg;
		
		System.out.println("국어점수를 입력하세요");
		kor=sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		eng=sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		math=sc.nextInt();
		
		total=kor+eng+math;	//토탈점수	
		avg=(double)total/3; //평균점수
		
		if(avg>=90) {
			System.out.println("A학점입니다.");
		}else if(avg>=80) {
			System.out.println("B학점입니다.");
		}else if(avg>=70) {
			System.out.println("C학점입니다.");
		}else if(avg>=60) {
			System.out.println("D학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
		System.out.println("총점은 :" +total);
		System.out.println("평균점수는:"+avg);
	}

}
