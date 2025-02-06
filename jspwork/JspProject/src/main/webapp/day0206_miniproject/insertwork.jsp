<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="work.data.WorkDao"/>
<jsp:useBean id="dto" class="work.data.WorkDto"/>
<jsp:setProperty property="*" name="dto"/>
<%
 dao.insertWork(dto);
%>