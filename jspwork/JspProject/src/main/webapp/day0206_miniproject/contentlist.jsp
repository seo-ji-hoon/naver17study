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
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
	<style>
		body * {
			font-family: 'Jua';
		}
	</style>
	<script type="text/javascript">
	
	let view="list";
	
	/* 아이콘 */
	$(function(){	
		
		//list 모양 디폴트값을 list모양으로
		$("div.liststyle i:eq(1)").css("color","red");
		
		//목록모양 변경하는 이벤트
		$("div.liststyle i").click(function(){
			
			view=$(this).attr("view");
			//alert(view);
			
			$(this).siblings().css("color","black");//형제태그의 글자색을 black으로
			$(this).css("color","red");
			
			list(); //바뀐 모양으로 다시 출력
		});
		
		list(); //전체 목록 불러오기
		
		//상품등록버튼
		$("#shopfrm").submit(function(e){
			
			e.preventDefault(); //기본 이벤트를 무효화 (action 호출 x)
			
			$.ajax({
				type:"get",
				dataType:"json",
				data:$(this).serialize(),
				url:"./insertwork.jsp",
				success:function(){
					alert("상품이 추가되었습니다.");
					//입력값 초기화
					$("#worktitle").val("");
					$("#worktxt").val("");
					$("#location").val("");
					$("#num").val(1);
					
					//목록 다시 출력하기
					list();
				}
			});
		});
		
		//상세보기 클릭시 이벤트
		$(document).on("click","i.detail",function(){
			let num=$(this).attr("num");
			//상세페이지로 이동
			location.href="./contentview.jsp?num="+num;
		});
		
	});
	
	function list(){
		let order= $("#selorder").val();
		
		$.ajax({
			
			type:"get",
			dataType:"json",
			data:{"order":order},
			url:"./listwork.jsp",
			success:function(res){
				writedata(res);
			}
		});
	}
	
	function writedata(res){
		
		let s="";
		if(view=='list'){
			
			s=`
				<table class="table table-bordered tab1">
					<thead>
						<th width="50">번호</th>
						<th width="150">운동제목</th>
						<th width="50">인원</th>
						<th width="50">장소</th>
						<th width="120">날짜</th>
						<th>상세보기</th>
					</thead>
					<tbody>
			`;
			
			$.each(res,function(idx,ele){
				s+=`
					<tr>
						<td>${idx+1}</td>
						<td style="text-align:left;">
							${ele.worktitle}
						</td>
						<td>${ele.num}명</td>
						<td>${ele.location}</td>
						<td style="text-align:right;">${ele.writeday}</td>
						<td></td>
					</tr>
				
				`;
			});
			s+="</tbody></table>";
		}else{
			
			$.each(res,function(idx,ele){
				
				s+=`
					<div class="grid">
						<h6>${ele.worktitle}</h6>
						<h6>${ele.worktxt}</h6>
					</div>
		
				`;
				
			});
		}
		
		$("div.result").html(s);
	}
	</script>
</head>
<body>
	<!-- 모달영역 -->
<!-- The Modal -->
<div class="modal" id="myShopModal">
  <div class="modal-dialog modal-sm">
    <div class="modal-content">

      <!-- Modal Header -->
      <div class="modal-header">
        <h4 class="modal-title">모임등록</h4>
        <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
      </div>

      <!-- Modal body -->
      <div class="modal-body">
      
    <!--이번에 수정은 폼단위로 값을 알아보자-->
	<form id="shopfrm">
	  <table class="table table-bordered">
		<tr>
			<td style="background-color: lightgray;">운동제목</td>
			<td>
				<input type="text" name="worktitle" id="worktitle" class="form-control">
			</td>
		</tr>
		<tr>
			<td style="background-color: lightgray;">소개글</td>
			<td>
				<input type="text" name="worktxt" id="worktxt" class="form-control">
			</td>
		</tr>
		<tr>
			<td style="background-color: lightgray;">장소</td>
			<td>
				<input type="text" name="location" id="location">
			</td>
		</tr>
		<tr>
			<td style="background-color: lightgray;">운동시간</td>
			<td>
				<input type="date" name="writeday" id="writeday" class="form-control" value="2025-01-01">
			</td>
		</tr>
		<tr>
			<td style="background-color: lightgray;">인원수</td>
			<td>
				<input type="number" name="num" id="num" class="form-control" min="1" max="30" value="1">
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<button type="submit" data-bs-dismiss="modal" style="width: 120px;">등록하기</button>
			</td>
		</tr>
      </table>
      	
	</form>
	</div>
	
      <!-- Modal footer -->
      <div class="modal-footer">
        <button type="button" class="btn btn-danger"
        data-bs-dismiss="modal">Close</button>
      </div>

    </div>
  </div>
</div>

	<!-- 메인화면 -->
	<div style="margin: 20px; width: 500px;">
	
		<h5 class="alert alert-success" style="text-align: center;">[운동할싸람 모집]</h5>
		
		<div class="input-group">
			<button type="button" class="btn btn-sm btn-outline-secondary"
			id="btnaddmodal" data-bs-toggle="modal" data-bs-target="#myShopModal">모임등록</button>
		
			<select id="selorder" style="width: 150px; margin-left: 150px;" 
			class="form-select" onchange="list()">
				<option value="1">등록순</option>
				<option value="2">높은가격순</option>
				<option value="3">낮은가격순</option>
				<option value="4">상품명순</option>
			</select>
		</div>
		<div class="liststyle">
			<i class="bi bi-grid" view="grid"></i>
			<i class="bi bi-card-list" view="list"></i>
		</div>
		<div style="margin-top: 20px;" class="result">
			123
		</div>
	</div>
</body>
</html>