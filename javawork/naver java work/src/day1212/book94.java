package day1212;

public class book94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode='5';
			
		if((65<=charCode)&(charCode<=90))//char코드가 65이상 90이하일떄
		{
			System.out.println("대문자이군요");
		}
		if((97<=charCode)&(charCode<=122))//char코드가 97이상 122이하일떄
		{
			System.out.println("소문자이군요");
		}
		if((48<=charCode)&(charCode<=57))//char코드가 48이상 57이하일떄
		{
			System.out.println("0~9 숫자이군요");
		}
		
		
		int value = 6;
		
		if((value%2==0)|(value%3==0))
		{
			System.out.println("2 또는 3의 배수이군요");
		}
		
		boolean result = (value%2==0)|(value%3==0);
		if(!result) {
			System.out.println("2또는 3의 배구가 아니군요");
		}
		
	}

}
