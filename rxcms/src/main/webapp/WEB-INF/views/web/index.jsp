<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>睿迅智能</title>
<link rel="stylesheet" href="/static/style/bootstrap.css" />
<link href="/static/style/style.css" rel="stylesheet" type="text/css" />
<!--<script type="text/javascript" src="js/jquery-3.3.1.js"></script>-->
<script type="text/javascript" src="/static/js/jquery-1.11.1.min.js"></script>
</head>
<body>
	<%@include file="header.jsp"%>
	<!-- banner -->
	<div class="banner">
		<div class="container">
			<section class="slider">
				<div class="flexslider">
					<ul class="slides">
						<li>
							<div class="banner-info">
								<h1>积木式编程</h1>
								<p>使用图形化积木式编程，可视化编程。</p>
							</div>
						</li>
						<li>
							<div class="banner-info">
								<h1>智能实验</h1>
								<p>拥有最新最全的，多达几十种丰富的传感器…….</p>
							</div>
						</li>
						<li>
							<div class="banner-info">
								<h1>人工智能</h1>
								<p>使用多种最完美的算法，支持多种平台……</p>
							</div>
						</li>
					</ul>
				</div>
			</section>
			<!--FlexSlider-->
			<link rel="stylesheet" href="/static/style/flexslider.css" type="text/css"
				media="screen" />
			<script defer src="/static/js/jquery.flexslider.js"></script>
			<script type="text/javascript">
				$(window).load(function() {
					$('.flexslider').flexslider({
						animation : "slide",
						start : function(slider) {
							$('body').removeClass('loading');
						}
					});
				});
			</script>
			<!--End-slider-script-->
		</div>
	</div>
	<!-- //banner -->
	<!-- banner-bottom -->
	<div class="banner-bottom">
		<div class="container">
			<h3>欢迎您加入我们的智能实验室 !</h3>
			<p class="velit">这里是一个充满创意与想象的舞台，是创客的理想之地…….</p>
			<div class="banner-bottom-grids">
				<div class="col-md-4 banner-bottom-grid">
					<h4>智能机器人</h4>
					<p>智能感知设备,可自动避障，自动循迹，智能跟踪,语音提示…….</p>
					<div class="more">
						<a href="single.html" class="hvr-bounce-to-bottom">更多</a>
					</div>
				</div>
				<div class="col-md-4 banner-bottom-grid">
					<h4>智能语音识别</h4>
					<p>根据你发出的语音，实现自动控制与响应……</p>
				</div>
				<div class="col-md-4 banner-bottom-grid">
					<h2>
						<span>(010)</span>17003555856
					</h2>
					<p>
						中国山西省太原市 , <span>XXXXXX.</span> <a
							href="mailto:houjianjun88@163.com">houjianjun88@163.com</a>
					</p>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="banner-bottom-gd">
				<div class="col-md-4 banner-bottom-gid">
					<div class="col-xs-3 banner-bottom-gdl-left">
						<i class="glyphicon glyphicon-education" aria-hidden="true"></i>
					</div>
					<div class="col-xs-9 banner-bottom-gdl">
						<p>
							<span>100+</span> 全球校园
						</p>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="col-md-4 banner-bottom-gid">
					<div class="col-xs-3 banner-bottom-gdl-left">
						<i class="glyphicon glyphicon-user" aria-hidden="true"></i>
					</div>
					<div class="col-xs-9 banner-bottom-gdl">
						<p>
							<span>1000+</span>在线学生
						</p>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="col-md-4 banner-bottom-gid">
					<div class="col-xs-3 banner-bottom-gdl-left">
						<i class="glyphicon glyphicon-eye-open" aria-hidden="true"></i>
					</div>
					<div class="col-xs-9 banner-bottom-gdl">
						<p>
							<span>100+</span> 全球浏览
						</p>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="get-in-grids">
				<div class="get-in-grid-left">
					<p>与我联系</p>
				</div>
				<div class="get-in-grid-right">
					<input type="text" value="输入您的邮箱..." onfocus="this.value = '';"
						onblur="if (this.value == '') {this.value = '输入您的邮箱...';}"
						required=""> <input type="submit" value="">
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- //banner-bottom -->
	<!-- service1 -->
	<div class="service1">
		<div class="container">
			<div class="wmuSlider example1">
				<div class="wmuSliderWrapper">
					<article style="position: absolute; width: 100%; opacity: 0;">
						<div class="banner-wrap">
							<div class="service1-info">
								<h3>飞起来的小车</h3>
								<p>有跑的小车，飞起来的小车是什么鬼…….</p>
							</div>
						</div>
					</article>
					<article style="position: absolute; width: 100%; opacity: 0;">
						<div class="banner-wrap">
							<div class="service1-info">
								<h3>会说话的小车</h3>
								<p>会说话的小车，那就是个鬼…….</p>
							</div>
						</div>
					</article>
					<article style="position: absolute; width: 100%; opacity: 0;">
						<div class="banner-wrap">
							<div class="service1-info">
								<h3>可以走路的机器人</h3>
								<p>会走路的机器人，那不就是鬼吗？.</p>
							</div>
						</div>
					</article>
					<ul class="wmuSliderPagination">
						<li><a href="#" class="">0</a></li>
						<li><a href="#" class="">1</a></li>
						<li><a href="#" class="wmuActive">2</a></li>
					</ul>
				</div>
				<script src="/static/js/jquery.wmuSlider.js"></script>
				<script>
					$('.example1').wmuSlider();
				</script>
			</div>
		</div>
	</div>
	<!-- //service1 -->
	<!-- 产品推荐 -->
	<div class="testimonials">
		<div class="container">
			<h3>传感器</h3>
			<p class="velit">各种传感器，红外、声音、振动、人体感应、光敏、火焰、超声波…….</p>
			<div class="testimonial-grids">
				<div class="col-md-4 testimonial-grid">
					<div class="testimonial-grd">
						<p>
							一种无需编写任何代码、全部图形化设计的语音识别模块，全部操作可以由我们提供的语音识别IDE环境图形化编程，
							零基础就能完成复杂的语音识别设计，很方便就能编写复杂的语音识别剧本。 <i>语音识别 <span>智能芯片</span></i>
						</p>
						<div class="testimonial-grd-pos">
							<span></span>
						</div>
					</div>
				</div>
				<div class="col-md-4 testimonial-grid">
					<div class="testimonial-grd">
						<p>
							凭借在传感器领域 30 多年的创新，我们最新的传感解决方案组合为业界开创了一个新时代。我们的下一代传感器实现了智能集成、
							逻辑和可定制平台软件的完美平衡，支持更智能、更独特的应用。 <i>智能控制 <span>Ccbits编程板</span></i>
						</p>
						<div class="testimonial-grd-pos1">
							<span></span>
						</div>
					</div>
				</div>
				<div class="col-md-4 testimonial-grid">
					<div class="testimonial-grd">
						<p>
							今年的比赛依然由摄像头、光电和电磁三个竞赛单元和创意赛组成。东道主西北工业大学成为总决赛最大赢家，首次拿下两个特等奖，并再次获得创意赛一等奖，
							其他7个特等奖被7所学校瓜分。 <i>可视化编辑程 <span>Ccbits编程</span></i>
						</p>
						<div class="testimonial-grd-pos2">
							<span></span>
						</div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- //产品推荐 -->
	<%@include file="footer.jsp"%>
</body>
<script type="text/javascript" src="/static/js/bootstrap.js"></script>

</html>