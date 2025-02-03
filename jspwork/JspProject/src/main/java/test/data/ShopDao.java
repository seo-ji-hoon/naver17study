package test.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import db.connect.MysqlConnect;
import simpleboard.data.SimpleBoardDto;

public class ShopDao {
	MysqlConnect connect=new MysqlConnect();
	
public List<ShopDto> getAllDatas(){
		
		List<ShopDto> list = new Vector<ShopDto>();
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from shop order by idx";
		
		conn=connect.getConnection();
		
		try {
			
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				
				ShopDto dto = new ShopDto();
				dto.setIdx(rs.getInt("idx"));
				dto.setSang(rs.getString("sampum"));
				dto.setSu(rs.getInt("su"));
				dto.setDan(rs.getInt("dan"));
				
				
				//list에 추가
				list.add(dto);
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
