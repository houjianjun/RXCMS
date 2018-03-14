<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>睿迅CMS后台管理系统</title>
<link rel="stylesheet" href="/static/style/style.default.css"
	type="text/css" />
</head>

<body class="withvernav">
	<div class="bodywrapper">
		<div class="topheader">
			<div class="left">
				<h1 class="logo">
					睿迅<span>CMS</span>
				</h1>
				<span class="slogan">后台管理系统</span>
				<div class="search">
					<form action="" method="post">
						<input type="text" name="keyword" id="keyword" value="请输入" />
						<button class="submitbutton"></button>
					</form>
				</div>
				<!--search-->

				<br clear="all" />

			</div>
			<!--left-->

			<div class="right">
				<div class="userinfo">
					<img src="/static/images/thumbs/avatar.png" alt="" /> <span>管理员</span>
				</div>
				<!--userinfo-->

				<div class="userinfodrop">
					<div class="avatar">
						<a href=""><img src="/static/images/thumbs/avatarbig.png"
							alt="" /></a>
						<div class="changetheme">
							切换主题: <br /> <a class="default"></a> <a class="blueline"></a> <a
								class="greenline"></a> <a class="contrast"></a> <a
								class="custombg"></a>
						</div>
					</div>
					<!--avatar-->
					<div class="userdata">
						<h4>admin</h4>
						<span class="email">474177818@qq.com</span>
						<ul>
							<li><a href="javascript:void">编辑资料</a></li>
							<li><a href="javascript:void">账号设置</a></li>
							<li><a href="javascript:void">帮助</a></li>
							<li><a href="index.html">退出</a></li>
						</ul>
					</div>
					<!--userdata-->
				</div>
				<!--userinfodrop-->
			</div>
			<!--right-->
		</div>
		<!--topheader-->

		<div class="header">
			<ul class="headermenu">
				<li class="current"><a href="/"><span
						class="icon icon-flatscreen"></span>首页</a></li>
				<li><a href="javascript:void"><span
						class="icon icon-pencil"></span>内容管理</a></li>
				<li><a href="javascript:void"><span
						class="icon icon-message"></span>产品管理</a></li>
				<li><a href="javascript:void"><span class="icon icon-chart"></span>统计报表</a>
				</li>
			</ul>

			<div class="headerwidget">
				<div class="earnings">
					<div class="one_half">
						<h4>访问用户</h4>
						<h2>10000</h2>
					</div>
					<!--one_half-->
					<div class="one_half last alignright">
						<h4>今日订单</h4>
						<h2>2000</h2>
					</div>
					<!--one_half last-->
				</div>
				<!--earnings-->
			</div>
			<!--headerwidget-->

		</div>
		<!--header-->
		<%@include file="menu.jsp"%>
		<!--leftmenu-->
		<div class="centercontent">
			<iframe name="main" id="rightform" src="welcome" frameborder="0"
				scrolling="no" width="100%"></iframe>
			<!-- centercontent -->
		</div>
	</div>
	<!--bodywrapper-->

</body>
<!--jquery-->
<script type="text/javascript"
	src="/static/js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript"
	src="/static/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript">
	function changeFrameHeight() {
		var ifm = document.getElementById("rightform");
		ifm.height = document.documentElement.clientHeight + 100;
	}
	window.onresize = function() {
		changeFrameHeight();
	}
	$(function() {
		changeFrameHeight();
	});
</script>
<!--cookie-->
<script type="text/javascript" src="/static/js/plugins/jquery.cookie.js"></script>
<script type="text/javascript"
	src="/static/js/plugins/jquery.uniform.min.js"></script>
<!--图表插件-->
<script type="text/javascript"
	src="/static/js/plugins/jquery.flot.min.js"></script>
<script type="text/javascript"
	src="/static/js/plugins/jquery.flot.resize.min.js"></script>
<!--横向滚动-->
<script type="text/javascript"
	src="/static/js/plugins/jquery.slimscroll.js"></script>
<!--更换皮肤-->
<script type="text/javascript" src="/static/js/custom/general.js"></script>
<!--主页面-->
<script type="text/javascript" src="/static/js/custom/dashboard.js"></script>

</html>