<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="contentBox">
	<div id="join_div">
		<form id="join_form" name="join_form">
		<h2>회원가입</h2>
			ID 			<br><input type="text" name="userid" required="required" /><br /> 
			이름 		<br><input type="text" name="name" required/><br />
			생년월일	 	<br><input type="text" name="ssn" required/><br /> 
			비밀번호	 	<br><input type="text" name="password" required/><br /> 

			<br /> <br /> 
		<h4>소속팀</h4>
			<select name="teamid" id="teamid">
				<option value="A">놀자</option>
				<option value="H">지은집</option>
				<option value="S">터틀킹</option>
				<option value="C">코딩짱</option>
			</select>

		<h4>프로젝트 역할</h4><br /> 
			<select name="roll" id="roll">
				<option value="leader">팀장</option>
				<option value="front">프론트개발</option>
				<option value="back">백단개발</option>
				<option value="android">안드로이드개발</option>
				<option value="minfe">민폐</option>
			</select>
		<h4>수강과목</h4><br /> 
			<input type="checkbox" name="subject" value="java" checked="checked"/> Java
			<input type="checkbox" name="subject" value="clang" /> C언어
			<input type="checkbox" name="subject" value="JSP" /> JSP
			<input type="checkbox" name="subject" value="PHP" /> PHP
			<input type="checkbox" name="subject" value="nodejs" /> NodeJS
			<input type="checkbox" name="subject" value="linux" /> Linux
			<input type="checkbox" name="subject" value="html" /> HTML
			<input type="checkbox" name="subject" value="spring" /> Spring
			<br />
			<button id="join_submit" >회원가입</button> 
			<br /> 
		</form>
	</div>
</div> <!-- content -->

<script>
$('#join_submit').click(function(){
	alert('join_submit click !');
	$('#join_form')
	.attr({
		action:"${context}/member/add",
		method:"POST"
	})
	.submit();
});
<!--

//-->
</script>