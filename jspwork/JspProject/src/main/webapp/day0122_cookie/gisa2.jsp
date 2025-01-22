<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>502 jsp study</title>
	<link href="https://fonts.googleapis.com/css2?family=Caveat:wght@400..700&family=Gaegu&family=Jua&family=Nanum+Pen+Script&family=Playwrite+AU+SA:wght@100..400&family=Single+Day&display=swap" rel="stylesheet">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css">
	<style>
		body * {
			font-family: 'Jua';
		}
	</style>
</head>
<%
	boolean blogin=false;

	//현재 브라우저에 저장된 모든 쿠키값얻기, 없을경우 null 값
	Cookie []cookies=request.getCookies();
	
	if(cookies!=null){
		
		for(int i=0; i<cookies.length; i++){
			
			//loginok 라는 쿠키가 있는지 검사
			if(cookies[i].getName().equals("loginok")){
				
				blogin=true;
				break;
				
			}
		}
	}

%>
<body>
<%
	if(blogin){
	//로그인을 한 상태
	%>
	<pre>
	[마이데일리 = 인천공항 박승환 기자] "조금 아픔이 있어도…"
	한화 이글스 선수단은 22일 인천 국제공항을 통해 호주 멜버른으로 출국했다.
	이번 캠프에는 '특급유망주' 정우주를 비롯해 2025년 신인드래프트 루키 6명이 포함되는 등
	선수만 45명으로 구성됐으나,황준서의 이름은 찾아볼 수 없었다.
	</pre>
		
	<%}else{%>
		<script type="text/javascript">
			alert("먼저 로그인을 해주세요");
			history.back(); //이전 페이지로 이동
		</script>
	<% 
	}
	%>

</body>
</html>