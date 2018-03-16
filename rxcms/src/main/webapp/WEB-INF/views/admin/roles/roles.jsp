<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>角色管理</title>
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
		<h1 class="pagetitle">角色管理</h1>
		<br>
	</div>
	<div style="margin-left: 20px;">
		<form class="stdform" action="../roles/add" method="post">
			<input type="hidden" name="id" value="${roles.id}">
			<p>
				<label>角色名称</label> <span class="field"><input type="text"
					name="name" value="${roles.name }" class="smallinput"></span> <small
					class="desc">请输入角色名</small>
			</p>
			<p>
			<label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
				<span class="formwrapper">
					<div class="checker" id="uniform-undefined" style="width:100px">
						是否启用<span><input type="checkbox" name="isenable" value="1"
							style="opacity: 0;">
						</span>
					</div> 
				</span>
			</p>
			<p class="stdformbutton">
				<button type="submit" class="submit radius2">保存</button>
				<input type="reset" class="reset radius2" value="重置">
			</p>
		</form>
	</div>
</body>
<script type="text/javascript" src="/static/js/jquery-3.3.1.js"></script>
<script type="text/javascript">
//添加复选按钮事件
$(function() {
	$('input:checkbox').each(function() {
		$(this).on("click", function() {
			if ($(this).parent("span").attr("class") === "checked") {
				$(this).parent("span").removeClass("checked");
			} else {
				$(this).parent("span").addClass("checked");
			}
		});
	});
})
</script>
</html>