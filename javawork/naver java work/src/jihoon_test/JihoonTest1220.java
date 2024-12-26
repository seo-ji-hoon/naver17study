package jihoon_test;

import java.util.Scanner;

public class JihoonTest1220 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		int[] number = {10,55,23,2,79,101,16,82,30,45};
		
		int min=number[0];
		int max=number[0];
		int minPos = 0;
		int maxPos = 0;
		
		for(int i=1; i<number.length; i++) {
			
			if(min>number[i]) {
				
				min = number[i];
				minPos = i+1;
				
			}
			
			if(max<number[i]) {
				
				max = number[i];
				maxPos = i+1;
			}
			
			
		}
		
		System.out.println("가장 큰 값은 "+max+"이고, 위치는"+maxPos+"번쨰입니다.");
		System.out.println("가장 작은값은"+min+"이고, 위치는"+minPos+"번째입니다.");
		
		
		
		
		
	}
}

