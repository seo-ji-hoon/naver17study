package day1226;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Ex5TableStudent extends JFrame{
	
	JTable table;
	static final String FILENAME="c:/naver1210/student.txt";
	List<Student> list=new ArrayList<Student>();
	

	public Ex5TableStudent() {
		
		super("학생성적관리");
		this.setBounds(300, 100, 400, 300);
		this.initDesign();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void studentFileRead() {
		
		//파일을 읽어서 list 변수에 담기
		FileReader fr=null;
		BufferedReader br=null;

		try {

			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);

			while(true) {

				String studentInfo=br.readLine();
				if(studentInfo==null) {
					break;
				}
				String []s=studentInfo.split("\\|"); //.split으로 '|' 구분
				Student student=new Student();
				
				student.setName(s[0]);
				student.setKor(Integer.parseInt(s[1]));
				student.setEng(Integer.parseInt(s[2]));

				//List에 추가
				list.add(student);
			}
			//System.out.println(list.size()); 리스트 확인용
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			}catch(IOException|NullPointerException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public void initDesign() {
		
		this.studentFileRead(); //파일을 읽어서 list 변수에 담든다.
		//list 의 데이타를 읽어서 테이블에 출력후
		//프레임에 출력하시오
		//제목은 이름,국어,영어,총점,평균/2.0
		
		//테이블 제목부분
				String []title= {"이름","국어","영어","총점","평균"};
				
				//테이블의 데이타 부분 - 행갯수는 List의 size가 갯수이다.
				String[][]data=new String[list.size()][5];
				
				int i=0;
						
				for(Student s:list) {
					
					data[i][0]=s.getName();
					data[i][1]=String.valueOf(s.getKor());
					data[i][2]=String.valueOf(s.getEng());
					
					int sum=s.getKor()+s.getEng(); //총점
					double avg=sum/2.0; //평균
					
					data[i][3]=String.valueOf(sum);
					data[i][4]=String.valueOf(avg);
					
					//data[i][3]=String.valueOf(s.getKor()+s.getEng()); -지훈풀이
					//data[i][4]=String.valueOf(s.getKor()+s.getEng()/2.0); -지훈풀이
					
					i++;
				}
				
				//table 생성
				table=new JTable(data, title);
				
				//frame의 Center에 추가
				this.add("Center",new JScrollPane(table));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex5TableStudent();

	}

}
