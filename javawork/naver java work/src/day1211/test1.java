package day1211;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="candy";
		int age=32;
		float height=163.8f;
		double weight=56.7;
		char blood='B';
		
		//char we=163.5;
		
		String a="java";
		
		/*
		 * 이름 : Candy님
		 * 나이 : 32세
		 * 키 : 163.8cm
		 * 몸무게 : 56.7kg
		 * 혈액형 : B형
		 * 
		 * printf를 이용해서 위와같이 출력해보세요
		 */
		
		System.out.println("키:"+a);
		
		System.out.printf("이름: %s 님",name);
		System.out.printf("\n나이:%s 세",age);
		System.out.printf("\n키 :%5.1fcm",height);
		System.out.printf("\n몸무게 :%5.1fkg",weight);
		System.out.printf("\n혈액형 :%c형\n",blood);
		
		System.out.println("이름:"+name+"님");
		System.out.println("나이:"+age+"세");
		System.out.println("키 :"+height+"cm");
		
		
		
		
		
	}

}
