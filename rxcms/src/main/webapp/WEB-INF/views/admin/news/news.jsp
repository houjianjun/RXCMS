<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>产品管理</title>
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
		<h1 class="pagetitle">内容管理</h1>
		<br>
	</div>
	<div style="margin-left: 20px;">
		<form class="stdform" action="../news/add" method="post">
			<input type="hidden" name="id" value="${news.id}">
			<p>
				<label>标题</label> <span class="field"><input type="text"
					name="title" value="${news.title}" class="smallinput"></span> <small
					class="desc">请输入标题名.</small>
			</p>
			<p>
				<label>作者</label> <span class="field"><input type="text"
					name="author" value="${news.author }" class="smallinput"></span> <small
					class="desc">请输入作者.</small>
			</p>
			<p>
				<label>内容</label> <span class="field"> 
				<script id="container"
						name="context" type="text/plain" style="width: 80%; height: 100%;">${news.context }</script>
				</span>
			</p>
			<p class="stdformbutton">
				<button type="submit" class="submit radius2">保存</button>
				<input type="reset" class="reset radius2" value="重置">
			</p>
		</form>
	</div>
	<script type="text/javascript" src="/static/js/jquery-3.3.1.js"></script>
	<!-- ueditor文件 -->
	<!-- 配置文件 -->
	<script type="text/javascript" src="/ueditor/ueditor.config.js"></script>
	<!-- 编辑器源码文件 -->
	<script type="text/javascript" src="/ueditor/ueditor.all.js"></script>
	<script type="text/javascript" charset="utf-8"
		src="/ueditor/lang/zh-cn/zh-cn.js"></script>
	<script type="text/javascript">
		//实例化编辑器
		var ue = UE.getEditor('container');
	</script>
</body>
</html>