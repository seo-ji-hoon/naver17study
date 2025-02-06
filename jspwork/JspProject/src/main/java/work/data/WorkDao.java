package work.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.connect.MysqlConnect;

public class WorkDao {
	MysqlConnect db = new MysqlConnect();
	
	public void insertWork(WorkDto dto) {
		Connection conn=null;
		PreparedStatement pstmt = null;
		String sql="insert into workouts (worktitle,worktxt,location,writeday,num) values (?,?,?,?,?)";
		
		conn = db.getNaverCloudConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			//바인딩
			pstmt.setString(1, dto.getWorktitle());
			pstmt.setString(2, dto.getWorktxt());
			pstmt.setString(3, dto.getLocation());
			pstmt.setString(4, dto.getWriteday());
			pstmt.setInt(5, dto.getNum());
			
			//실행
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	public List<WorkDto> getAllWorkouts() {
	    List<WorkDto> list = new ArrayList<>();
	    
	    Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select * from workouts order by idx desc";
        conn=db.getNaverCloudConnection();
        
	    try {
	    	
	    	pstmt = conn.prepareStatement(sql);
	    	rs=pstmt.executeQuery();
	    	
	        while (rs.next()) {
	        	
	            WorkDto dto = new WorkDto();
	            
	            dto.setIdx(rs.getInt("idx"));
	            dto.setWorktitle(rs.getString("worktitle"));
	            dto.setWorktxt(rs.getString("worktxt"));
	            dto.setLocation(rs.getString("location"));
	            dto.setWriteday(rs.getString("writeday"));
	            dto.setNum(rs.getInt("num"));

	            list.add(dto);
	        }
	        
	        
	    } catch (Exception e) {
	    	
	        e.printStackTrace();
	    }finally {
	    	db.dbClose(rs, pstmt,conn);
	    }
	    return list;
	}

}
