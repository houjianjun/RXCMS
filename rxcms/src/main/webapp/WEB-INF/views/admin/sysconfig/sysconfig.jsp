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
		<h1 class="pagetitle">配置管理</h1>
		<br>
	</div>
	<div style="margin-left: 20px;">
		<form action="../sysconfig/add" method="post">
			<input type="hidden" name="id" value="${sysconfig.id}">
			<p>
				<label>名称</label> <span class="field"><input type="text"
					name="title" value="${sysconfig.title }" class="smallinput"></span> <small
					class="desc">请输入配置名称.</small>
			</p>
			<p>
				<label>内容</label> <span class="field">
				<textarea name="context" cols="80"
						rows="5" class="longinput">${sysconfig.context}</textarea>
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