package day1213;

import java.util.Scanner;

public class Ex13For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		/*		  
		 * 문제2
		 * 5명의 나이를 입력후
		 * 
		 * 40세 이상과 40세미만이 각각 몇명인지 출력하고
		 * 
		 * 평균 나이(결과/5) 도 같이 출력하시오
		 * (**for문 사용**)
		 * 
		 */
		
		
		int count1=0,count2=0,sum=0,age; //40세이상,40세미만,입력받을변수
		double avg; //평균 변수
		
		for(int i=1; i<=5; i++) {
			
			System.out.println(i+"번째 나이입력");
			age=sc.nextInt();
			//0세~100세가 벗어나는 경우 다시 입력(인원수 제외)
			//continue : for문은 i++로 이동
			
			if(age<0 || age>100) {
				
				System.out.println("다시 입력하세요.");
				i--;
				continue; //다시 돌아가~
				
			}
			
			sum+=age;
			
			if(age>=40) {
				count1++;
			}
			else { 
				count2++;
			}
		}
		
			avg=(double)sum/5;
			System.out.println("40세 이상 인원수 : "+count1);
			System.out.println("40세 미만 인원수 : "+count2);
			System.out.println("평균나이 : "+avg);
		
		
		
		
		
		
		
		
		
//	지훈 풀이.		
//		int age,old=0,young=0,total=0;
//		
//		for(int i=1; i<=5; i++) {
//			
//			System.out.println("나이입력");
//			age = sc.nextInt();
//			
//			if(age>=40){
//				old++;
//				
//			}
//			else {
//				
//				young++;
//				
//			}
//			
//			total+=age;
//			
//		}
//		
//		System.out.printf("40세이상 %d명, 40세미만 %d명, 평균 %d",old, young, total/5);
		
		
	}

}
