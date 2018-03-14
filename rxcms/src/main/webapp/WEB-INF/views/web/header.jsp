<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- header -->
<div class="header">
	<div class="container">
		<div class="header-top">
			<div class="header-top-left">
				<p>顶级创客，从这里开始……</p>
			</div>
			<div class="header-top-left1">
				<!-- start search-->
				<div class="search-box">
					<div id="sb-search" class="sb-search">
						<form>
							<input class="sb-search-input" placeholder="请输入搜索内容..."
								type="search" name="search" id="search"> <input
								class="sb-search-submit" type="submit" value=""> <span
								class="sb-icon-search"> </span>
						</form>
					</div>
				</div>
				<!-- search-scripts -->
				<script src="/static/js/classie.js"></script>
				<script src="/static/js/uisearch.js"></script>
				<script>
					new UISearch(document.getElementById('sb-search'));
				</script>
				<!-- //search-scripts -->
			</div>
			<div class="header-top-right">
				<p>
					联系方式： <span><i class="glyphicon glyphicon-earphone"
						aria-hidden="true"></i>17003555856</span>
				</p>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
</div>
<div class="header-logo">
	<div class="container">
		<div class="header-nav">
			<nav class="navbar navbar-default">
				<!-- 菜单分组显示 -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">导航切换</span> <span class="icon-bar"></span> <span
							class="icon-bar"></span> <span class="icon-bar"></span>
					</button>
					<div class="logo">
						<a class="navbar-brand" href="index.html">睿迅智能实验室 <span>创机人创客中心</span></a>
					</div>
				</div>
				<!-- 导航 -->
				<div class="collapse navbar-collapse nav-wil"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="hvr-bounce-to-bottom active"><a
							href="/">首页</a></li>
						<li class="hvr-bounce-to-bottom"><a href="/product">产品模块</a>
						</li>
						<li class="hvr-bounce-to-bottom"><a href="/gallery">创意作品</a>
						</li>
						<li class="hvr-bounce-to-bottom"><a href="/download">软件下载</a>
						</li>
						<li class="hvr-bounce-to-bottom"><a href="/question">常见问题</a>
						</li>
						<li class="hvr-bounce-to-bottom"><a href="/contact">联系我们</a>
						</li>
					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</nav>
		</div>
	</div>
</div>
<!-- //header -->