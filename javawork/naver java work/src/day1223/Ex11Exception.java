package day1223;

import java.io.FileWriter;
import java.io.IOException;

public class Ex11Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exception은 선택이 아니라 필수로 처리해야만 한다.
		//메서드 자체가 throws로 던지는 Exception 처리하면된다.
		
		System.out.println("3초만 기다리세요");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("오래 기다리셨어요");
		
		//파일에 이름과 주소를 저장해보자.
		FileWriter fw=null;
		try {
//			fw=new FileWriter("c:/naver1210/memo.txt");//새로 생성
			fw=new FileWriter("c:/naver1210/memo.txt",true);//true가 있으면, 기존파일에 추가가 계속됨.
			fw.write("이름 : 뉴진스 \n");
			fw.write("주소 : 서초구 \n");
			fw.write("============= \n");
			System.out.println("탐색기로 파일을 확인하세요.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException|NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("정상종료");
	}

}
