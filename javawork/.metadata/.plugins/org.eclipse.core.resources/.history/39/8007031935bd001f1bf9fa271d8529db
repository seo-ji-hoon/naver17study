package day1216;

public class Ex5String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String 클래스의 멤버 메소드에 대한 공부");
		String str1="Apple";
		String str2="Have a Nice Day";
		String str3="orange";
		String str4=new String("Apple");
		
		System.out.println("str1 = "+str1);
		System.out.println("str2 = "+str2);
		System.out.println("str3 = "+str3);
		
		System.out.println("str2 의 길이 : "+str2.length()); //문자열 길이 계산
		
		//문자열에 몇번쨰의 문자를 출력
		System.out.println("str1 의 0번글자 : "+str1.charAt(0));
		System.out.println("str1 의 3번글자 : "+str2.charAt(3));
		System.out.println("str1 의 1번글자 : "+str3.charAt(1));
		
		System.out.println();
		System.out.println("str1 에서 l의 위치는 : "+str1.indexOf('l')); //3
		System.out.println("str1 에서 l의 위치는 : "+str2.indexOf('a')); //첫번쨰 a의 위치	
		System.out.println("str2 에서 마지막 a의 위치는 : "+str2.lastIndexOf('a')); //13
		System.out.println("str3 에서 마지막 x의 위치는 : "+str3.lastIndexOf('x')); //해당 문자가 없을경우는 -1발생
		System.out.println();
		
		//객체타입에서는 ==동등연산자가 주소를 비교하는 연산자
		System.out.println(str1==str4); //false
		System.out.println(str3=="orange");//true
		System.out.println(str1=="apple");//false
		System.out.println();
		
		//문자열을 정확하게 비교하기 위해서는 equals  사용
		System.out.println(str1.equals(str4)); //true
		System.out.println(str1.equals("apple")); // false 대소문자까지 모두 맞아야 true
		System.out.println();
		System.out.println(str1.equalsIgnoreCase("apple")); //대소문자 상관없이 철자만 맞으면 true
		System.out.println(str1.equalsIgnoreCase("apPLE")); //대소문자 상관없이 철자만 맞으면 true
		
		//문자열 비교
		System.out.println("문자열 비교 - comareTo");
		int n=str1.compareTo("Apple");
		System.out.println(n); //0 : 대소문자까지 같을경우
		
		n=str1.compareTo("Banana");
		System.out.println(n); //문자열 1이 문자열 2보다 작을경우 마이너스값 -1:'A'하고 'B'하고 비교
		
		n=str3.compareTo(str1); //"orange" , "Apple"을 비교 '0' , 'A'
		System.out.println(n); // 14 :알파벳 순서가 거꾸로 되어있을경우 양수값 14
		System.out.println();
		
		//대문자 소문자 변환
		System.out.println("str2를 모두 대문자로 변환 : " + str2.toUpperCase());
		System.out.println("str2를 모두 소문자로 변환 : " + str2.toLowerCase());
		System.out.println();
		
		System.out.println("str2 가 Have 로 시작하면 true :"+str2.startsWith("Have")); //true
		System.out.println("str2 가 Happy 로 시작하면 true :"+str2.startsWith("Happy")); //false
		System.out.println();
		
		
		System.out.println("str2 가 Day로 끝나면 true :"+str2.endsWith("Day")); //true
		System.out.println("str2 가 Day!로 끝나면 true :"+str2.endsWith("Day!"));//false
		System.out.println();
		
		//문자열 반복 메서드
		System.out.println("=".repeat(50)); //'=' 이 50번 반복
		System.out.println("str1".repeat(5)); //str1이 다섯번 반복
		System.out.println("*".repeat(30)); // '*' 이 30번 반복
		System.out.println();
		
		//문자열을 지정해서 변경하는 메서드
		System.out.println(str2.replace("a", "*")); //str2에 a라는 단어를 *로 변경
		System.out.println(str2.replace("Nice", "Happy")); //str2에 Nice라는 단어를 Happy로 변경
		System.out.println();
		
		//특정 문자열을 추출하는 메서드
		System.out.println(str2.substring(7)); //7번 index부터 끝까지 추출
		System.out.println(str2.substring(7,9));//7번~9번까지 추출
		System.out.println();
		
		// 문자열 분리
		System.out.println("split 으로 문자열 분리(배열)");
		String str5="red,green,blue,yellow,gray,black";
		System.out.println("str5="+str5);
		String []array=str5.split(",");
		//배열출력
		for(String a:array)
			System.out.println(a);
		System.out.println();
		
		// trim 매서드 공백제거
		String str6="   Hello   ";
		System.out.println("*"+str6+"*");
		System.out.println("*"+str6.trim()+"*"); //trim(): 앞뒤 공백제거후 반환
		System.out.println();
		
		//valueOf 메서드 다양한 타입의 데이터를 String으로 변환
		System.out.println("String.valueOf : 다양한 타입의 데이터를 String 타입으로 변환");
		//String s1=String.valueOf(100);
		String s1=100+""; //int+String=String 간단한 방법
		String s2=String.valueOf(true);
		String s3=String.valueOf(34.6);
		String s4=String.valueOf('A');
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println();
		
		//모르겠어 ? 그럼 외워라 외워 알겠니?
		
				
	}

}
