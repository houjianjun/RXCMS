<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>文件列表</title>
<link rel="stylesheet" href="/static/style/style.default.css"
	type="text/css" />
<style>
.context {
	margin: 10px;
}
</style>
</head>
<body>
	<div class="context">
		<p class="stdformbutton">
			<input type="button" id="btnAdd" class="add" value="添加"> <input
				type="button" id="btnDel" class="del" value="删除">
		</p>
		<br>
		<table cellpadding="0" cellspacing="0" border="0"
			class="stdtable stdtablecb">
			<colgroup>
				<col class="con0" style="width: 4%">
				<col class="con1">
				<col class="con0">
				<col class="con1">
			</colgroup>
			<thead>
				<tr>
					<th class="head0">
						<div class="checker" id="uniform-undefined">
							<span> <input type="checkbox" id="chkall" class="checkall"
								style="opacity: 0;">
							</span>
						</div>
					</th>
					<th class="head1">角色名</th>
					<th class="head0">是否启用</th>
					<th class="head0">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="roles">
					<tr>
						<td align="center">
							<div class="checker" id="uniform-undefined">
								<span> <input type="checkbox" name="chks" class="chks"
									checked="checked" value="${roles.id}" style="opacity: 0;">
								</span>
							</div>
						</td>
						<td>${roles.name}</td>
						<td>${roles.isenable}</td>
						<td>
						<input id="btnEdit" onclick="btnEdit(${roles.id})"
							type="button" class="edit" value="编辑"></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
<script type="text/javascript" src="/static/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="/static/js/common.js"></script>
<script type="text/javascript">
	$("#btnAdd").on("click", function() {
		$(location).attr('href', '/admin/roles/addOrEdit?id=');
	});
	//删除事件
	$("#btnDel").on("click",function(){
		var dels="";
		$('input:checkbox.chks').each(function() {
			if($(this).parent("span").attr("class") === "checked"){
				dels+=$(this).val()+",";
			}
		});
		$(location).attr("href","dels?dels="+dels.substring(0,dels.length-1));
	});
	//编辑
	function btnEdit(id){
		$(location).attr("href","edit?id="+id);
	}
</script>
</html>