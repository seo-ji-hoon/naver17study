package day0106db;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import db.connect.MysqlConnect;

//db 를 처리하기 위한 클래스
public class ShopModel {
	
	MysqlConnect connect=new MysqlConnect();
	
	//전체 데이타 반환하는 메서드
	//List 안에 vector 형태로 넣어서 반환
	public List<Vector<String>> getAllDatas(){
		
		List<Vector<String>> list = new Vector<Vector<String>>();
		Connection conn=connect.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from shop order by idx desc";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				
				Vector<String> data = new Vector<String>();
				data.add(rs.getString("idx"));
				data.add(rs.getString("sampum"));
				data.add(rs.getString("su"));
				data.add(rs.getString("danga"));
				
				int total=rs.getInt("su")*rs.getInt("danga");
				data.add(String.valueOf(total)); // int->String 으로 변환해서 추가
				data.add(rs.getString("ipgoday").substring(0,10));
				
				//list 에 추가
				list.add(data);								
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			connect.dbClose(rs, pstmt, conn);
		}
		
		return list;
		
	}

	
	//insert 
	public void insertShop(ShopDto dto) {
		
		Connection conn=connect.getConnection();
		PreparedStatement pstmt=null;
		String sql="insert into shop (sampum,su,danga,ipgoday) values (?,?,?,now())";
		
		try {
			pstmt=conn.prepareStatement(sql);
			//바인딩
			pstmt.setNString(1, dto.getSampum());
			pstmt.setInt(2, dto.getSu());
			pstmt.setInt(3, dto.getDanga());
			
			//실행
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			connect.dbClose(pstmt, conn);
		}
	}
	
	//delete
	public void deletesShop(int idx) {
		
		Connection conn=connect.getConnection();
		PreparedStatement pstmt=null;
		String sql="delete from shop where idx=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			// 바인딩
			pstmt.setInt(1, idx);
			//실행
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			connect.dbClose(pstmt, conn);
		}
		
		
	}
	
	//update
	public void updateShop(int idx,String sampum,int danga) {
		
		Connection conn= connect.getConnection();
		PreparedStatement pstmt=null;
		String sql="update shop set sampum=?,danga=? where idx=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			//바인딩
			pstmt.setString(1, sampum);
			pstmt.setInt(2, danga);
			pstmt.setInt(3, idx);			
			//실행
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			connect.dbClose(pstmt, conn);
		}
	}
	
	//search
public List<Vector<String>> getSearchData(String searchWord){
		
		List<Vector<String>> list = new Vector<Vector<String>>();
		Connection conn=connect.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from shop where sampum like ? order by idx";
		
		try {
			pstmt=conn.prepareStatement(sql);
			//바인딩
			pstmt.setString(1,"%"+searchWord+"%");
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				
				Vector<String> data = new Vector<String>();
				data.add(rs.getString("idx"));
				data.add(rs.getString("sampum"));
				data.add(rs.getString("su"));
				data.add(rs.getString("danga"));
				
				int total=rs.getInt("su")*rs.getInt("danga");
				data.add(String.valueOf(total)); // int->String 으로 변환해서 추가
				data.add(rs.getString("ipgoday").substring(0,10));
				
				//list 에 추가
				list.add(data);								
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			connect.dbClose(rs, pstmt, conn);
		}
		
		return list;
		
	}
	
}

