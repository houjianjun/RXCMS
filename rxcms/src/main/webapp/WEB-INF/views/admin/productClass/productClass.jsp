<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>分类管理</title>
<link rel="stylesheet" href="/static/style/style.default.css"
	type="text/css" />
<style>
p {
	margin-top: 10px;
}
</style>
</head>

<body>
	<div class="pageheader">
		<h1 class="pagetitle">分类管理</h1>
		<br>
	</div>
	<div style="margin-left: 20px;">
		<form class="stdform" action="../productClass/add" method="post">
			<input type="hidden" name="id" value="${productClass.id}">
			<p>
				<label>类别名称：</label> <span class="field"><input type="text"
					name="name" value="${productClass.name }" class="smallinput"></span> <small
					class="desc">请输入分类名.</small>
			</p>
			<p>
				<label>类别描述：</label> <span class="field">
				<textarea name="des" cols="80"
						rows="5" class="longinput">${productClass.des }</textarea>
				</span>
			</p>
			<p class="stdformbutton">
				<button type="submit" class="submit radius2">保存</button>
				<input type="reset" class="reset radius2" value="重置">
			</p>
		</form>
	</div>
</body>
</html>