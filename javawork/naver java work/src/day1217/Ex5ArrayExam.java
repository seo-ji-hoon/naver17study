package day1217;

public class Ex5ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//최대값/최소값 구하기
		
		int []data= {23,560,-56,234,11,88,99,-999,7,10,8,50};
		int max=data[0]; //첫데이터를 최대값으로 지정한다
		int min=data[0]; //최소값
		
		//1번지부터 끝까지 비교해서 max보다 더 큰값이 나오면 그값을 max에 저장
		for(int i=1; i<data.length;i++) {
			
			if(max<data[i]) {		
				
				max=data[i]; //최대값
			}
			
			if(min>data[i]) {
				
				min=data[i]; //최소값
			}
			
		}
		
		System.out.println("max="+max);
		System.out.println("min="+min);		
		
	}

}
