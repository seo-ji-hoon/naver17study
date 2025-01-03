package day1217;

import java.util.Scanner;

public class Ex7ArrayScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		/*
		 * 
		 * 인원수를 입력후 그 인원수만큼 이름과 점수를 입력하고
		 * 등수와 총점과 평균을 구하여 출력하시오.
		 * 
		 */
		
		int inwon; //인원수
		int []score,rank; //점수,등수
		String []name; // 이름 
		int total=0; //총점수
		double avg; //평균
		
		System.out.println("인원수를 입력해주세요.");
		inwon=Integer.parseInt(sc.nextLine());
		
		//인원수 만큼 배열들 할당
		score=new int[inwon]; //인원수 만큼 점수 배열 할당
		rank=new int[inwon]; //인원수 만큼 등수 배열 할당
		name=new String[inwon]; //인원수 만큼 이름 배열 할당
		
		//이름과 점수 입력
		for (int i=0; i<inwon; i++) { 
			
			//이름입력
			System.out.println(i+"번째 이름입력");
			name[i]=sc.nextLine();
			//점수입력
			System.out.println("점수입력");
			score[i]=Integer.parseInt(sc.nextLine());
			
			//합계구하기
			total+=score[i];			
		}
		
		//평균 구하기
		avg=(double)total/inwon;
		
		//등수 구하기
		
		for(int i=0;i<score.length;i++) {
			
			rank[i]=1;
			
			for(int j=0;j<score.length; j++) {
				
				if(score[i]<score[j]) {
					rank[i]++;
				}
			}
			
		}
			
		//출력
		System.out.println("번호\t이름\t점수\t등수");
		System.out.println("=".repeat(40));
		for(int i=0; i<inwon; i++) {
			
			System.out.println(i+1+"\t"+name[i]+"\t"+score[i]+"\t"+rank[i]);
			
		}
		
		System.out.println("=".repeat(40));
		System.out.println("총점 : "+total+"\t평균:"+avg);
			
	}

}
