package day1219;

public class Ex8SrtingBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Happy";
		//String -> StringBuffer
		StringBuffer sb=new StringBuffer(str);
		
		//인스턴스 변수인경우 변수명만 출력시 자동으로 toString()호출
		// toString 을 갖고있지 않는경우 값이 아닌 주소가 출력된다.
		System.out.println(sb);
		System.out.println(sb.toString());
		
		//String 은 값 자체를 변경할수 없지만 StringBuffer는 문자열 편집이 가능하다.
		// 맨뒤부분에 추가
		sb.append('A');
		sb.append(100);
		sb.append("Bitcamp");
		System.out.println(sb);
		
		//삭제
		sb.delete(5, 9);//5~8 인덱스 부분이 제거
		System.out.println(sb);
		
		//<중간삽입> 3번 인덱스 앞에 Java가 삽입
		sb.insert(3, "Java");
		System.out.println(sb);
		
		//중간의 문자열 변경
		sb.replace(3, 7, "Hello"); //3~7까지 Hello 변경
		System.out.println(sb);
		
		//데이터를 json 데이터로 변환
		String name="캔디";
		int age=23;
		
		StringBuffer sb2=new StringBuffer();	
		sb2.append("{\"name\":");
		sb2.append("\""+name+"\",");
		sb2.append("\"age\":");
		sb2.append(age+"}");
		System.out.println(sb2);
	}

}