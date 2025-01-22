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
	토트넘 훗스퍼 소식통 '토트넘 훗스퍼 뉴스'는 21일(한국시간) 영국 '데일리 메일'을 인용하여 
	"토트넘 선수들은 포스테코글루 감독이 이번 달 초 손흥민을 제외한 결정에 충격을 받았다. 
	포스테코글루 감독은 부진한 성적을 보인 선수단에 자신의 권위를 각인시키기 위해 위험을 감수했다.
	뉴캐슬 유나이티드전에서 손흥민을 벤치에 앉힌 결정은 선수들의 눈살을 찌푸리게 했다. 
	포스테코글루 감독과 선수단 사이에 분열이 있는 듯하다"라고 전했다.
	
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