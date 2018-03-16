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
		<h1 class="pagetitle">产品管理</h1>
		<br>
	</div>
	<div style="margin-left: 20px;">
		<form class="stdform" action="../product/add" method="post">
		<input type="hidden" name="id" value="${product.id}">
			<p>
				<label>账号</label> <span class="field"><input type="text"
					name="name" value="${product.name }" class="smallinput"></span> <small
					class="desc">请输入分类名.</small>
			</p>
			<p>
				<label>数量</label> <span class="field"><input type="text"
					name="num" value="${product.num }" class="smallinput"
					style="width: 30px"></span> <small class="desc">请输入产品数 量.</small>
			</p>
			<p>
				<label>选择类别</label> <span class="field">
					<div class="selector hover" id="uniform-undefined">
						<span>请选择一项</span><select name="clazz" class="uniformselect"
							style="opacity: 0;">
							<option value="">开发板</option>
							<option value="">模块</option>
						</select>
					</div>
				</span>
			</p>
			<p>
				<label>描述</label> <span class="field"> <textarea name="des"
						cols="80" rows="5" class="longinput">${product.des }
				</textarea>
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