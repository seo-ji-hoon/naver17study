package day1224;

import java.util.Arrays;
import java.util.List;

public class Ex11ListVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=Arrays.asList("장미꽃","국화꽃","안개꽃","다알리아");//add 말고도 이런식으로 입력가능
		System.out.println("List1의 크기"+list1.size());
		
		List<Integer> list2=Arrays.asList(56,100,67,90,80); //add 말고도 이런식으로 입력가능
		System.out.println("List2의 크기"+list2.size());
		System.out.println();
		
		//list1 출력
		System.out.println("list1 출력");
		for(String s:list1) {
			
			System.out.println(s+" ");
			
		}
		System.out.print("=".repeat(20));
		System.out.println();
		
		//list2 출력
		System.out.println("list2 출력");
		
		for(int n:list2) {
			
			System.out.print(n+" ");
		}
		
		
	}

}