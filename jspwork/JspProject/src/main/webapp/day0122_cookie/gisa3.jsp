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
	KIA 타이거즈가 2025시즌 연봉 재계약 대상자 45명 중 44명과 계약을 완료했다.
	KIA는 22일 "투수 정해영은 2억원에서 80% 오른 3억6000만원에 재계약 했다. 
	곽도규는 3300만원에서 263.6%가 인상된 1억2000만원에 사인해 구단 역대 투수 최고 인상률을 기록했다.
	지난 시즌 3천500만원에 계약한 황동하와 김도현도 각각 1억원과 9000만원에 재계약 했다. 
	포수 한준수는 5천만원에서 180% 오른 1억4000만원에 사인했다"라고 했다.
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