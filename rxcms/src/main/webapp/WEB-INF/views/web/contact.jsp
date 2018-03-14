<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>联系我们</title>
<link rel="stylesheet" href="/static/style/bootstrap.css" />
<link href="/static/style/style.css" rel="stylesheet" type="text/css" />
<!--<script type="text/javascript" src="js/jquery-3.3.1.js"></script>-->
<script type="text/javascript" src="/static/js/jquery-1.11.1.min.js"></script>
</head>
<body>
	<%@include file="header.jsp"%>
	<!-- 联系我们 -->
	<div class="contact">
		<div class="container">
			<h3>联系我们</h3>
			<p class="velit">一个全新的世界，一个创意的天堂，一个制造鬼的地方…….</p>
			<div class="contact-grids">
				<div class="col-md-5 contact-left">
					<h4>地址</h4>
					<p>
						山西省太原市XXXXXXXXXXXXX <span>xxx街道XXXX号楼</span>
					</p>
					<ul>
						<li>联系电话 :0351 XXXXXXX</li>
						<li>手 机 :+138 8888 8888</li>
						<li>传 真:+0351 XXXXXXX</li>
						<li><a href="mailto:houjianjun88@163.com">houjianjun88@163.com</a>
						</li>
					</ul>
				</div>
				<div class="col-md-7 contact-left">
					<h4>联系方式</h4>
					<form>
						<input type="text" value="姓名" onfocus="this.value = '';"
							onblur="if (this.value == '') {this.value = 'Name';}" required="">
						<input type="email" value="邮箱" onfocus="this.value = '';"
							onblur="if (this.value == '') {this.value = 'Email';}"
							required=""> <input type="text" value="电话"
							onfocus="this.value = '';"
							onblur="if (this.value == '') {this.value = 'Telephone';}"
							required="">
						<textarea type="text" onfocus="this.value = '';"
							onblur="if (this.value == '') {this.value = '信息...';}"
							required="">信息内容...</textarea>
						<input type="submit" value="提交">
					</form>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- //contact -->
	<%@include file="footer.jsp"%>
</body>
<script type="text/javascript" src="/static/js/bootstrap.js"></script>

</html>