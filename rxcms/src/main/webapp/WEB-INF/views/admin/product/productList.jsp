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
					<th class="head1">名称</th>
					<th class="head0">描述</th>
					<th class="head0">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="product">
					<tr>
						<td align="center">
							<div class="checker" id="uniform-undefined">
								<span> <input type="checkbox" name="chks" class="chks"
									checked="checked" value="${ product.id}" style="opacity: 0;">
								</span>
							</div>
						</td>
						<td>${product.name}</td>
						<td>${productClass.des}</td>
						<td><input id="btnEdit" onclick="btnEdit(${ productClass.id})" type="button" class="edit" value="编辑"></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>