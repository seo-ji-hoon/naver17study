package day1217;

import java.util.Scanner;

public class Ex12ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		String []member= {"강호동","김태희","손미나","이지혜","송중기",
				"김사랑","손흥민","박미나","강리나","김신"};
		String searchName;
		int count;
		
		/*
		 * 검색할 성씨는 ? '이'
		 * 		이지혜
		 * 		총 1명 검색
		 * 
		 * 검색할 성씨는 ? '강'
		 * 		강호동
		 * 		강미나
		 * 		총 2명 검색
		 * 
		 * 검색할 성씨는 ? '홍'
		 * 		
		 * 		"홍" 씨 성을 가진 멤버는 없습니다.
		 * 
		 * 종료 코드는 대소문자 상관없이 exit 입력시 종료
		 * 
		 * 대소문자 equalsIgnoreCase startsWith
		 */
		

		while(true) {
			
			count=0;
			
			System.out.println("검색할 성씨는?(종료는 exit) :");
			searchName=sc.nextLine();
			
			//종료코드
			if(searchName.equalsIgnoreCase("exit")){
				
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}
			
			//
			for(int i=0; i<member.length; i++) {
				
				if(member[i].startsWith(searchName)) {
					
					count++;
					System.out.println(i+":"+member[i]);
				}
				
			}
			
			
			if(count==0) {
				
				System.out.println("\""+searchName+"\" 씨성을 가진 사람은 없습니다.");
			}
			else {
				System.out.println("총"+count+"명 검색");
			}
			
			
			
			
			
			
			
			
			
		}
		
		

	}

}