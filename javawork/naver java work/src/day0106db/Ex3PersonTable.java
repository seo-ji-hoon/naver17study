package day0106db;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Ex3PersonTable extends JFrame {
	JTextField tfname,tfage,tfblood,tfhp;
	JButton btnplus,btnDel;
	DefaultTableModel tableModel;
	JTable table;
	
	PersonModel personModel=new PersonModel(); //Person db 데이타 관리
	
	public Ex3PersonTable () {
		super("person 관리");
		this.setBounds(300, 100, 600, 400); //시작위치와 프레임 크기설정
		this.initDesign();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void initDesign() {
		
		JPanel p1=new JPanel();
		tfname=new JTextField(6);
		tfage=new JTextField(3);
		tfblood=new JTextField(3);
		tfhp=new JTextField(6);
		
		p1.add(new JLabel("이름"));	
		p1.add(tfname);
		p1.add(new JLabel("나이"));
		p1.add(tfage);
		p1.add(new JLabel("혈액형"));
		p1.add(tfblood);
		p1.add(new JLabel("핸드폰"));
		p1.add(tfhp);
		
		//p1 panel frane  상단에 추가
		this.add("North",p1);
		
		//frame 중간에 table 넣기
		String []title= {"번호","이름","나이","핸드폰","혈액형"};
		tableModel = new DefaultTableModel(title,0);
		table=new JTable(tableModel);
		this.add("Center",new JScrollPane(table));
		
		//생성된 테이블에 db데이타 출력하기
		this.rowSelect();
		
		//하단에 버튼
		btnplus=new JButton("직원추가");
		btnDel=new JButton("직원삭제");
		
		JPanel p2=new JPanel();
		p2.add(btnplus);
		p2.add(btnDel);
		this.add("South",p2);
		
		//직원추가 버튼 이벤트
		btnplus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name=tfname.getText();
				if(name.length()==0) {
					JOptionPane.showMessageDialog(Ex3PersonTable.this,"이름을 입력해주세요.");
					return;
				}
				String text_age=tfage.getText();
				int age=0;
				if(text_age.length()==0) {
					JOptionPane.showConfirmDialog(Ex3PersonTable.this,"나이를 입력해주세요.");
					return;
				}else {
					age=Integer.parseInt(text_age);
				}
				
				String blood=tfblood.getText();
				if(blood.length()==0) {
					JOptionPane.showMessageDialog(Ex3PersonTable.this,"혈액형을 입력해주세요.");
					return;
				}
				String hp=tfhp.getText();
				if(hp.length()==0) {
					JOptionPane.showMessageDialog(Ex3PersonTable.this,"번호를 입력해주세요.");
					return;
				}
				
				//insert 메서드 호출
				personModel.insertPerson(new PersonDto(name,age,blood,hp));
				//전체데이타 다시 출력
				rowSelect();
				//입력한 데이타 초기화
				tfname.setText("");
				tfage.setText("");
				tfblood.setText("");
				tfhp.setText("");
			}
		});
		
		//삭제 버튼 이벤트
		btnDel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//table의 선택한 행번호 가져오기
				int row = table.getSelectedRow();
				System.out.println(row);
				
				if(row==-1) {
					JOptionPane.showMessageDialog(Ex3PersonTable.this, "삭제할 행을 먼저 선택해주세요.");
					return;
				}
				//선택한 행의 0번열 (인덱스) 값 가져오기
				int num=Integer.parseInt((String)table.getValueAt(row, 0));
				//삭제 메서드 호출
				personModel.deletesPerson(num);
				//테이블 데이타 다시출력
				rowSelect();
			}
		});
		
		
	}
	
	
	
	
	
	//table 에 데이타 출력하는 메소드
		public void rowSelect() {
			
			//기존 테이블의 데이타 모두 삭제
			tableModel.setRowCount(0);
			
			//db의 모든 데이타 가져오기
			List<Vector<String>> list=personModel.getAllDatas();	
			for(Vector<String> data:list) {
				tableModel.addRow(data);
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3PersonTable ex3 = new Ex3PersonTable();
	}

}
