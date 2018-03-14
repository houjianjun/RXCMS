<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>文件管理</title>
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
		<h1 class="pagetitle">文件管理</h1>
		<br>
	</div>
	<div style="margin-left: 20px;">
		<form action="../manager/add" method="post">
			<input type="hidden" name="id" value="${files.id}">
			<p>
				<label>标题</label> <span class="field"><input type="text"
					name="name" value="${files.title }" class="smallinput"></span> <small
					class="desc">请输入文件标题.</small>
			</p>
			<p>
				<label>路径</label>
				<span class="field"><input type="file" name="src" value="${files.src }"  class="smallinput"></span>
				<small class="desc">请选择文件.</small>
			</p>
			<p>
				<label>内容</label> <span class="field">
				<textarea name="des" cols="80"
						rows="5" class="longinput">${news.content }</textarea>
				</span>
			</p>
			<p class="stdformbutton">
				<button type="submit" class="submit radius2">添加</button>
				<input type="reset" class="reset radius2" value="重置">
			</p>
		</form>
	</div>
</body>
</html>