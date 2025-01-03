package day1224;

import java.io.File;

public class Ex2File {

	public static void main(String[] args) {
		
		//  **file 클래서 메소드 정리**
		
		// TODO Auto-generated method stub
		//File file1=new File("c:/naver1210/score.txt");
		File file1=new File("c:\\naver1210\\score.txt"); //역슬레쉬하게되면 두번을 넣어야함.
		File file2=new File("c:/naver1210");
		System.out.println(file1.length()); //글자길이 - byte 단위로 나타낸것.
		System.out.println(file1.canExecute());//실행권한 => true
		System.out.println(file1.canRead());//읽기 => true
		System.out.println(file1.canWrite());//쓰기 => true
		
		System.out.println(file1.exists());//파일이 존재하면 => true
		
		// is 는 물어보는 형식
		System.out.println(file1.isDirectory());//false => 디렉토리인가? file1->파일
		System.out.println(file2.isDirectory());//true => 디렉토리인가?
		
		System.out.println(file1.isFile());//true -> 파일인가?
		System.out.println(file2.isFile());//false -> 파일인가?
		
		//file1이 디렉토리라면 목록을 출록하라
		if(file1.isDirectory()) {
			String []list=file1.list();
			for(String s:list) {
				System.out.println(s);
			}
		}else {
			System.out.println("file1은 파일입니다.");
		}
		//file2가 디렉토리라면 목록을 출록하라
		if(file2.isDirectory()) {
			System.out.println("**파일2 목록**");
			String []list=file2.list();
			int n=0;
			for(String s:list) {
				System.out.println(++n+":"+s);
			}
		}else {
			System.out.println("file2은 파일입니다.");
		}
		System.out.println("=".repeat(30));
		
		System.out.println(file1.getAbsolutePath());//경로포함 출력됨 => c:/naver1210/score.txt
		System.out.println(file1.getName());// 파일명만 출력 =>score.txt
		System.out.println(file1.getPath());// getAbsolutePath 같은의미 =>c:/naver1210/score.txt
		
	}

}
