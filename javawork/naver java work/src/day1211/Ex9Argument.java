package day1211;

public class Ex9Argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 Argument 값 일기 문제");
		/*
		 * 	이상욱
		 * 	삼성전자
		 * 	홍보부
		 * 	89
		 *  100
		 *  74
		 * 
		 * 이름(name), 회사명(emp),부서(dep),
		 * 3과목의 입시시험점수 (score1,score2,score3)
		 * 를 읽어서 위의 테이터와 입사시험의 총합계 (total)과
		 * 평균(average)-소수점 첫째자리까지출력(printf로출력) 을출력하시오
		 */
		
		/*String name=args[0];
		String emp=args[1];
		String dep=args[2];
		int scoer1=Integer.parseInt(args[3]);
		int scoer2=Integer.parseInt(args[4]);
		int scoer3=Integer.parseInt(args[5]);
		int total=scoer1+scoer2+scoer3;
		double average=(double)total/3;
		
		System.out.println("이름 : "+args[0]);
		System.out.println("회사명 : "+args[1]);
		System.out.println("부서 : "+args[2]);
		System.out.println("3과목 총합계 : "+total);
		System.out.println("3과목 평균 : "+average);
		System.out.printf("3과목 평균 : %5.1f",average);*/
		
		String name=args[0];
		String emp=args[1];
		String dep=args[2];
		int scoer1=Integer.parseInt(args[3]);
		int scoer2=Integer.parseInt(args[4]);
		int scoer3=Integer.parseInt(args[5]);
		int total=scoer1+scoer2+scoer3;
		double average=total/3.0;
		
		System.out.println("사원명 : "+name);
		System.out.println("회사명 : "+emp);
		System.out.println("부서명 : "+dep);
		System.out.println("입학점수 1 : "+scoer1);
		System.out.println("입학점수 2 : "+scoer2);
		System.out.println("입학점수 3 : "+scoer3);
		System.out.println("총점 : "+total);
		System.out.printf("입사시험 평균 : %5.1f\n",average);
		
	}

}
