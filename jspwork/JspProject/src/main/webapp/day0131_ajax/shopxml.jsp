<?xml version="1.0" encoding="UTF-8"?>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="test.data.ShopDao"%>
<%@page import="java.util.List"%>
<%@page import="test.data.ShopDto"%>
<%@ page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>
<data>
<%

	ShopDao dao = new ShopDao();
	List<ShopDto> list = dao.getAllDatas();
	
	for(ShopDto dto:list) {
%>	
	
		<sang><%=dto.getSang() %></sang>
		<su><%=dto.getSu()%></su>
		<dan><%=dto.getDan()%></dan>
	
<% 	
	}
%>
</data>
