package jihoon_test;

import java.util.Scanner;

public class Day1218ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*
		 * 인원수를 입력후 인원수 만큼 이름과 자바,스프링 두점수를 입력후
		 * 총점, 평균,등수,등급을 구하시오
		 * 
		 */
		
		int inwon; //인원을 입력받을 숫자형 정수 inwon 변수 선언
		int []java,spring,total,rank;
		String []name,grade;
		double []avg;
		
		//인원수 부터 읽은후 모든 배열에 메모리 할당하기
		System.out.println("성적을 입력할 인원수는?");
		inwon=Integer.parseInt(sc.nextLine());
		
		
		//입력받을 인원에 점수,합산점수,등수,이름,등급,평균 저장
		java=new int[inwon];
		spring=new int[inwon];
		total=new int[inwon];
		rank=new int[inwon];
		
		name=new String[inwon];
		grade=new String[inwon];
		
		avg=new double[inwon];
		
		//총점수 평균
		for(int i=0; i<inwon; i++) {
			
			System.out.println(inwon);
			
		}
		
		
	}

}