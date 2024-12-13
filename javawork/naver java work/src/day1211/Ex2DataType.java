package day1211;

public class Ex2DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=90;
		int eng=93;
		System.out.println("합계="+kor+eng);//String+int+int : 묵시적형변화에 은해서 String+ing=String
		
		//int+int=int 이므로 먼저 계산을 해야만한다
		System.out.println("합계="+(kor+eng));
		
		
		//진법변환
		int a=056;//앞에 '0'이있으면 8진수로 인식을함
		int b=0x12a; //'0'뒤에 x가 붙으면 16진수로 인식을함
		System.out.println("a="+a); //8진수를 10진수로 변경:5x8=-+6x1=46
		System.out.println("b="+b); //16진수를 10진수로 변경 : 1x16의2승+2x16의1승+10x16의0승:256+32+10 = 298
		
		int c=047;
		int d=0xa9;
		System.out.println("c="+c); //4x8+7 = 39
		System.out.println("d="+d); //10x16+9 = 169
		
	}

}
