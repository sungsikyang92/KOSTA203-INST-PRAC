package org.kosta.model;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

public class BoardDAO {
	private static BoardDAO dao=new BoardDAO();	
	private DataSource dataSource;
	private BoardDAO(){
		dataSource=DataSourceManager.getInstance().getDataSource();
	}
	public static BoardDAO getInstance(){
		return dao;
	}
	public Connection getConnection() throws SQLException{
		return dataSource.getConnection();
	}
	public void closeAll(PreparedStatement pstmt,Connection con) throws SQLException{
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close(); 
	}
	public void closeAll(ResultSet rs,PreparedStatement pstmt,Connection con) throws SQLException{
		if(rs!=null)
			rs.close();
		closeAll(pstmt,con);
	}	
	/**
	 * 페이지 번호에 해당하는 게시물 목록 리스트를 반환하는 메서드 
	 * LIST SQL -> Test 후 반영하세요 
	    SELECT b.no,b.title,b.hits,to_char(time_posted,'YYYY.MM.DD') as time_posted,m.id,m.name 
		FROM board b , board_member m
		WHERE b.id=m.id
		order by no desc
	 * @param pageNo
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<PostVO> getPostingList() throws SQLException{
		ArrayList<PostVO> list=new ArrayList<PostVO>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			con=getConnection(); 
			StringBuilder sql=new StringBuilder();		
			sql.append("SELECT b.no,b.title,b.hits,to_char(time_posted,'YYYY.MM.DD') as time_posted,m.id,m.name ");
			sql.append("FROM board b , board_member m ");
			sql.append("WHERE b.id=m.id ");	
			sql.append("order by no desc");
			pstmt=con.prepareStatement(sql.toString());			
			rs=pstmt.executeQuery();	
			//목록에서 게시물 content는 필요없으므로 null로 setting
			//select no,title,time_posted,hits,id,name
			while(rs.next()){		
				PostVO pvo=new PostVO();
				pvo.setNo(rs.getString(1));
				pvo.setTitle(rs.getString(2));
				pvo.setHits(rs.getInt(3));
				pvo.setTimePosted(rs.getString(4));				
				MemberVO mvo=new MemberVO();
				mvo.setId(rs.getString(5));
				mvo.setName(rs.getString(6));
				pvo.setMemberVO(mvo);
				list.add(pvo);			
			}			
		}finally{
			closeAll(rs,pstmt,con);
		}
		return list;
	} 	
}























