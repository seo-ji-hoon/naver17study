package day1224;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

public class Ex12FileList {
	
	static final String FILENAME="c:/naver1210/sawon.txt";
	
	List<String> sawonList=new Vector<String>();
	
	public Ex12FileList() {
		// TODO Auto-generated constructor stub
		//파일에서 이름을 읽어서 sawonList 에 추가해주세요
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			
			int n=0;
			
			while(true) {
				
				String line=br.readLine();
				if(line==null) {
					
					break;
					
				}
				
			}
			
		}catch(FileNotFoundException e){
			System.out.println("**해당 파일을 찾을수 없습니다.**");
		}		
	}	
		

	
	public void sawonMemberList()
	{
		//사원 이름을 번호와 함께 출력해주세요
		for(int i=0; i<sawonList.size();i++) {
			
			System.out.print(i+1+":"+sawonList.get(i)+" ");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex12FileList ex12=new Ex12FileList();
		ex12.sawonMemberList();
		
	}


}