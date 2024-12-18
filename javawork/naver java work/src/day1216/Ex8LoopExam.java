package day1216;

import java.util.Scanner;

public class Ex8LoopExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		/*
		 * 문제3.
		 * 
		 * 이름을 입력하면 그중 "김" 씨 성을 가진사람의 인원수
		 * "이"씨 성을 가진사람의 인원수 
		 * 그이외의 인원수를 각각 구하여
		 * 출력하시오.
		 * 
		 * (while문- 빠져나가는 코드는 "끝")
		 * 
		 * 사용할 문자열 메서드는 : startWith,equals
		 * 
		 */
		
		String names;
		int KimCount=0,leeCount=0,otherCount=0;
		
		while(true) {
			
			System.out.print("이름입력 : ");
			names=sc.nextLine();
			
			//equals가 맞으면 true
			if(names.equals("끝")) {
				break;
			}
			//'김'으로 시작하면 kimcount 증가
			if(names.startsWith("김")) {
				KimCount++;
			}
			//'이'로 시작하면 leecount 증가
			else if(names.startsWith("이")) {
				leeCount++;
			}
			//그렇지 않으면 othercount 증가
			else {
				otherCount++;
			}		
		}
		
		System.out.println("김씨성 인원수 : "+KimCount);
		System.out.println("이씨성 인원수 : "+leeCount);
		System.out.println("김씨,이씨성을 제외한 인원수 : "+otherCount);	

	}

}
