package coding_test;

import java.util.Arrays;

public class Programmer01 {
	
	// 실수 flo가 매개 변수로 주어질 때, 
	// flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.
//    public int solution01(double flo) {
//        int answer = (int) flo;
//        return answer;
//    }
    
//    public String solution02(String rny_string) {
//        String answer = rny_string.replace("m", "rn");
//        return answer;
//    }
	
//	public String[] solution03(String my_string) {
//        String[] answer = my_string.split(" ");
//        return answer;
//    }
//	public int solution04(int num1, int num2) {
//        int answer = num1-num2;
//        return answer;
//   
//    }
//	public int solution05(int num1, int num2) {
//        int answer;
//		if (num1==num2)
//			answer = 1;
//		else
//			answer = -1;
//        return answer;
//    }
	
	public int solution06(int n) {
        int answer=0;

        for(int i=0; i<=n; i++) {
        	
        	if(i%2==0) {
        		answer+=n;
        	}
        	
        }
        
        return answer;
    }



	public static void main(String[] args) {
		

		Programmer01 exam = new Programmer01();
		
		int answer=exam.solution06(40);
		System.out.println(answer);
		
		
//		String[] answer = exam.solution03("I LOVE YOU");
//		for(String a:answer) {
//			System.out.println(a);
//		}
		

//		String answer = exam.solution02("masterpiece");
//		System.out.println(answer);
//		
//		answer = exam.solution02(answer);
//		System.out.println(answer);
//		int result = exam.solution01(1.42);
//		System.out.println(result);
//
//		result = exam.solution01(69.32);
//		System.out.println(result);
		
	}

}
