<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="work.data.WorkDto"%>
<%@page import="java.util.List"%>
<%@page import="work.data.WorkDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//운동 리스트 가져오기
	WorkDao dao = new WorkDao();
	List<WorkDto> list = dao.getAllWorkouts();

	JSONArray arr = new JSONArray();

	for (WorkDto dto : list) {
    	JSONObject ob = new JSONObject();
    	ob.put("idx", dto.getIdx());  // 운동 ID
    	ob.put("worktitle", dto.getWorktitle());  // 운동 제목
    	ob.put("worktxt", dto.getWorktxt());  // 운동 소개글
    	ob.put("location", dto.getLocation());  // 운동 장소
    	ob.put("writeday", dto.getWriteday());  // 운동 날짜
    	ob.put("num", dto.getNum());  // 모집 인원수

    arr.add(ob);
}
%>
<%=arr%>