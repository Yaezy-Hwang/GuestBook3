package com.javaex.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GuestVo;

@Repository
public class BookDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<GuestVo> select() {
		List<GuestVo> gList = sqlSession.selectList("guestbook.selectList");
    	System.out.println(gList.toString());
		return gList;
	}
	
	
	public int insert(GuestVo vo) {
		int count = sqlSession.insert("guestbook.insert", vo);
		return count;
	}
	
	public int delete(int no, String pw) {
		
		Map<String, Object> gMap = new HashMap<>();
		gMap.put("no", no);
		gMap.put("pw", pw);
		System.out.println(gMap.toString());
		
		int printResult = sqlSession.delete("guestbook.delete", gMap);
		
		return printResult;
	}
}

