package day1213;

import java.util.Scanner;

public class Ex7While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int score,total=0,count=0;
		double avg;
		
		while(true)
		{
			System.out.print("점수 입력(종료시 0):");
			score=sc.nextInt();
			
			if(score<0 || score>100) //점수가 0보다 크고 점수가 100보다 작을때
			{
				System.out.println("\t잘못입력된 점수입니다.");
				continue; //다시 처음으로 (조건식)이동
			}
			
			if(score==0) //점수가 0이랑 같을때
				break; // 종료
			count++; //갯수 저장
			total+=score; //입력한 점수와 토탈을 저장*
		}
		avg=(double)total/count; //평균값 계산
		
		System.out.println("총 입력한 점수갯수"+count);
		System.out.println("점수의 총 합계"+total);
		System.out.printf("점수들의 평균 : %5.2f\n",avg);
	}

}
