<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户管理</title>
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
					<th class="head1">账号</th>
					<th class="head0">最后一次登录日期</th>
					<th class="head1">登录次数</th>
					<th class="head0">角色</th>
					<th class="head0">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="manager">
					<tr>
						<td align="center">
							<div class="checker" id="uniform-undefined">
								<span> <input type="checkbox" name="chks" class="chks"
									checked="checked" value="${ manager.id}" style="opacity: 0;">
								</span>
							</div>
						</td>
						<td>${manager.name}</td>
						<td>${manager.logintime}</td>
						<td>${manager.loginnum}</td>
						<td class="center">管理员</td>
						<td><input id="btnEdit" onclick="btnEdit(${ manager.id})" type="button" class="edit" value="编辑"></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script type="text/javascript" src="/static/js/jquery-3.3.1.js"></script>
	<script type="text/javascript">
		$("#btnAdd").on("click", function() {
			$(location).attr('href', '/admin/manager/addOrEdit?id=');
		});
		//删除功能
		$("#btnDel").on("click", function() {

		});
		//添加复选按钮事件
		$(function() {
			$('input:checkbox.chks').each(function() {
				$(this).on("click", function() {
					if ($(this).parent("span").attr("class") === "checked") {
						$(this).parent("span").removeClass("checked");
					} else {
						$(this).parent("span").addClass("checked");
					}
				});
			});
		})

		//全选事件
		$("#chkall").on("click", function() {
			if ($(this).parent("span").attr("class") === "checked") {
				$(this).parent("span").removeClass("checked");
				$('input:checkbox.chks').parent("span").removeClass("checked");
			} else {
				$(this).parent("span").addClass("checked");
				$('input:checkbox.chks').parent("span").addClass("checked");
			}
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
</body>
</html>