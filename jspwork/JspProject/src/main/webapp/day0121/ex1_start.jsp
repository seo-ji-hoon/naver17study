<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>HTML,JSP 주석확인</h3>
	<!-- HTML 주석 -->
	<%--JSP 주석 --%>
<!--  
	<script type="text/javascript">
		document.write("hello");
	</script>
-->
<h4>이름 : <%=name %></h4> <!-- 선언문의 변수는 위치가 어디든 출력가능 -->

<%!
	//선언문
	//이곳에 변수를 등록하면 서블릿 변환시 멤버변수로 등록된다.
	String name="홍길동";
%>

<%
	//스크립트릿(scriptlet) : 자바영역
	//이곳에서 선언하는 변수는 서블릿 변환시 지역변수로 등록된다(doGet의 지역변수로).
	
	//변수를 브라우저에 출력하는 방법 두가지
	//1번째 사용빈도 낮음
	out.print("<h2>이름:"+name+"</h2>");
%>
<h4>이름 : <%=name %></h4> <!-- 2번쨰 표현식을 이용한 자바영역의 변수 출력 -->


<%
	String addr="서울시 강남구";
	//자바 영역 안에서 선언된 지역변수는 선언된 곳 아래쪽에서만 사용가능
%>
<h5 style="color:blue;">주소: <%=addr %></h5>

<!-- 
	jsp를 실행을하면 -> servlet(java 파일)으로 변환 -> class 파일로 컴파일 -> class 파일이 실행돼서
	브라우저로 나온다.
	
	
 -->

</body>
</html>