<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>睿迅CMS后台登录</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<!--样式表-->
		<link rel="stylesheet" href="/static/style/style.default.css" type="text/css" />
	</head>
	<body>
		<body class="loginpage">
			<div class="loginbox">
				<div class="loginboxinner">
					<div class="logo">
						<h1 class="logo">睿迅.<span>CMS系统</span></h1>
						<span class="slogan">后台管理系统</span>
					</div>
					<!--logo-->
					<br clear="all" /><br />
					<div class="nousername">
						<div class="loginmsg">密码不正确.</div>
					</div>
					<!--nousername-->
					<div class="nopassword">
						<div class="loginmsg">密码不正确.</div>
						<div class="loginf">
							<div class="thumb"><img alt="" src="images/thumbs/avatar1.png" /></div>
							<div class="userlogged">
								<h4></h4>
								<a href="index.html">Not <span></span>?</a>
							</div>
						</div>
						<!--loginf-->
					</div>
					<!--nopassword-->
					<!--图标使用的是图片-->
					<form id="login" action="chckLogin" method="post">
						<div class="username">
							<div class="usernameinner">
								<input type="text" name="name" value="lisi" id="username" />
							</div>
						</div>
						<div class="password">
							<div class="passwordinner">
								<input type="password" name="pwd" value="123456" id="password" />
							</div>
						</div>
						<button>登录</button>
						<div class="keep"><input type="checkbox" /> 记住密码</div>
					</form>
				</div>
				<!--loginboxinner-->
			</div>
			<!--loginbox-->
		</body>
		<script type="text/javascript" src="/static/js/plugins/jquery-1.7.min.js"></script>
		<script type="text/javascript" src="/static/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
		<script type="text/javascript" src="/static/js/plugins/jquery.uniform.min.js"></script>
		<script type="text/javascript" src="/static/js/custom/index.js"></script>

</html>