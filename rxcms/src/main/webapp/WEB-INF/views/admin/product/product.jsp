<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<h1 class="pagetitle">产品管理</h1>
		<br>
	</div>
	<div style="margin-left: 20px;">
		<form class="stdform" action="../product/add" method="post">
			<input type="hidden" name="id" value="${product.id}">
			<p>
				<label>名称</label> <span class="field"><input type="text"
					name="name" value="${product.name }" placeholder="请输入产品名称"
					class="smallinput" required></span> <small class="desc">必填项</small>
			</p>
			<p>
				<label>数量</label> <span class="field"><input type="text"
					name="num" value="${product.num }" class="smallinput"
					style="width: 30px" required number></span> <small class="desc">请输入产品数量.</small>
			</p>
			<p>
				<label>选择类别</label> <span class="field"> <select
					name="select" class="uniformselect">
						<option value="-1">请选择一项</option>
						<c:forEach items="${list}" var="productClass">
							<option value="">${productClass.name}</option>
						</c:forEach>
				</select>
				</span>
			</p>
			<p>
				<label>描述</label> <span class="field"> <script id="container"
						name="des" type="text/plain" style="width: 80%; height: 100%;">${product.des}</script>
				</span>
			</p>
			<p class="stdformbutton">
				<button type="submit" class="submit radius2">保存</button>
				<input type="reset" class="reset radius2" value="重置">
			</p>
		</form>
	</div>

	<script type="text/javascript" src="/static/js/jquery-3.3.1.js"></script>
	<!-- js验证框架 -->
	<script type="text/javascript" src="/static/plugins/jquery.validate.js"></script>
	<script type="text/javascript"
		src="/static/plugins/localization/messages_zh.js"></script>
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

		//对表单进行验证
		$("#stdform").validate();
	</script>
</body>
</html>