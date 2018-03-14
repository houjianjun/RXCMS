<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<link rel="stylesheet" href="/static/style/style.default.css"
	type="text/css" />
<!-- <div class="centercontent"> -->
	<div class="pageheader">
		<h1 class="pagetitle">控制台</h1>
	</div>
	<!--pageheader-->
	<div id="contentwrapper" class="contentwrapper">
		<div id="updates" class="subcontent">
			<div class="notibar announcement">
				<a class="close"></a>
				<h3>公告</h3>
				<p>睿迅CMS管理系统开发进行中……，敬请关注！</p>
			</div>
			<!-- notification announcement -->
			<div class="two_third dashboard_left">
				<ul class="shortcuts">
					<li><a href="" class="settings"><span>设置</span></a></li>
					<li><a href="" class="users"><span>用户</span></a></li>
					<li><a href="" class="gallery"><span>相册</span></a></li>
					<li><a href="" class="events"><span>事件</span></a></li>
					<li><a href="" class="analytics"><span>分析</span></a></li>
				</ul>
				<br clear="all" />
				<div class="contenttitle2 nomargintop">
					<h3>访问统计</h3>
				</div>
				<!--contenttitle-->
				<div class="overviewhead">
					<div class="overviewselect">
						<select id="overviewselect" name="select">
							<option value="">1小时前</option>
							<option value="">5小时前</option>
							<option value="">今天</option>
							<option value="">昨天</option>
							<option value="">本周</option>
							<option value="">上周</option>
							<option value="">本月</option>
							<option value="">上个月</option>
						</select>
					</div>
					<!--floatright-->
					从: &nbsp;<input type="text" id="datepickfrom" /> &nbsp; &nbsp; 到:
					&nbsp;<input type="text" id="datepickto" />
				</div>
				<!--overviewhead-->

				<br clear="all" />
				<div class="widgetbox">
					<div class="title">
						<h3>最新反馈</h3>
					</div>
					<div class="widgetcontent">
						<div id="scroll1" class="mousescroll" style="height: 500px;">
							<ul class="entrylist">
								<li>
									<div class="entry_wrap">
										<div class="entry_img">
											<img src="/static/images/thumbs/image1.png" alt="" />
										</div>
										<div class="entry_content">
											<h4>
												<a href="">Why Won't My Cat Eat?</a>
											</h4>
											<small>Submitted by: <a href=""><strong>Hiccup</strong></a>
												- June 10, 2012
											</small>
											<p>Neque porro quisquam est, qui dolorem ipsum quia dolor
												sit amet, consectetur, adipisci velit, sed quia non...</p>
											<p>
												<button class="stdbtn btn_lime">Approve</button>
												<button class="stdbtn">Decline</button>
											</p>
										</div>
									</div>
								</li>
								<li class="even">
									<div class="entry_wrap">
										<div class="entry_img">
											<img src="/static/images/thumbs/image2.png" alt="" />
										</div>
										<div class="entry_content">
											<h4>
												<a href="">We Are About Color</a>
											</h4>
											<small>Submitted by: <a href=""><strong>Hiccup</strong></a>
												- June 10, 2012
											</small>
											<p>Neque porro quisquam est, qui dolorem ipsum quia dolor
												sit amet, consectetur, adipisci velit, sed quia non...</p>
											<p>
												<button class="stdbtn btn_lime">Approve</button>
												<button class="stdbtn">Decline</button>
											</p>
										</div>
									</div>
								</li>
								<li>
									<div class="entry_wrap">
										<div class="entry_img">
											<img src="/static/images/thumbs/image3.png" alt="" />
										</div>
										<div class="entry_content">
											<h4>
												<a href="">Ancient Technology</a>
											</h4>
											<small>Submitted by: <a href=""><strong>Hiccup</strong></a>
												- June 10, 2012
											</small>
											<p>Neque porro quisquam est, qui dolorem ipsum quia dolor
												sit amet, consectetur, adipisci velit, sed quia non...</p>
											<p>
												<button class="stdbtn btn_lime">Approve</button>
												<button class="stdbtn">Decline</button>
											</p>
										</div>
									</div>
								</li>
								<li class="even">
									<div class="entry_wrap">
										<div class="entry_img">
											<img src="/static/images/thumbs/image4.png" alt="" />
										</div>
										<div class="entry_content">
											<h4>
												<a href="">Bird's Nest Soup</a>
											</h4>
											<small>Submitted by: <a href=""><strong>Hiccup</strong></a>
												- June 10, 2012
											</small>
											<p>Neque porro quisquam est, qui dolorem ipsum quia dolor
												sit amet, consectetur, adipisci velit, sed quia non...</p>
											<p>
												<button class="stdbtn btn_lime">Approve</button>
												<button class="stdbtn">Decline</button>
											</p>
										</div>
									</div>
								</li>
							</ul>
						</div>
						<!--#scroll1-->
					</div>
					<!--widgetcontent-->
				</div>
				<!-- widgetbox -->

			</div>
			<!--two_third dashboard_left -->

			<div class="one_third last dashboard_right">

				<div class="contenttitle2 nomargintop">
					<h3>浏览最多</h3>
				</div>
				<!--contenttitle-->

				<ul class="toplist">
					<li>
						<div>
							<span class="three_fourth"> <span class="left"> <span
									class="title"><a href="">loremipsum.com</a></span> <span
									class="desc">Social Network</span>
							</span> <!--left-->
							</span>
							<!--three_fourth-->
							<span class="one_fourth last"> <span class="right">
									<span class="h3">8.1</span>
							</span> <!--right-->
							</span>
							<!--one_fourth-->
							<br clear="all" />
						</div>
					</li>
					<li>
						<div>
							<span class="three_fourth"> <span class="left"> <span
									class="title"><a href="">dolorsitamet.net</a></span> <span
									class="desc">Social Network</span>
							</span> <!--left-->
							</span>
							<!--three_fourth-->
							<span class="one_fourth last"> <span class="right">
									<span class="h3">7.8</span>
							</span> <!--right-->
							</span>
							<!--one_fourth-->
							<br clear="all" />
						</div>
					</li>
					<li>
						<div>
							<span class="three_fourth"> <span class="left"> <span
									class="title"><a href="">consectetur.org</a></span> <span
									class="desc">Social Network</span>
							</span> <!--left-->
							</span>
							<!--three_fourth-->
							<span class="one_fourth last"> <span class="right">
									<span class="h3">7.5</span>
							</span> <!--right-->
							</span>
							<!--one_fourth-->
							<br clear="all" />
						</div>
					</li>
				</ul>
				<div class="widgetbox">
					<div class="title">
						<h3>新增用户</h3>
					</div>
					<div class="widgetoptions">
						<div class="right">
							<a href="">查看所有用户</a>
						</div>
					</div>
					<div class="widgetcontent userlistwidget nopadding">
						<ul>
							<li>
								<div class="avatar">
									<img alt="" src="/static/images/thumbs/avatar1.png" />
								</div>
								<div class="info">
									<a href="">Squint</a> <br /> Front-End Engineer <br /> 18
									minutes ago
								</div> <!--info-->
							</li>
							<li>
								<div class="avatar">
									<img alt="" src="/static/images/thumbs/avatar2.png" />
								</div>
								<div class="info">
									<a href="">Eunice</a> <br /> Architectural Designer <br /> 18
									minutes ago
								</div> <!--info-->
							</li>
							<li>
								<div class="avatar">
									<img alt="" src="/static/images/thumbs/avatar1.png" />
								</div>
								<div class="info">
									<a href="">Captain Gutt</a> <br /> Software Engineer <br />
									18 minutes ago
								</div> <!--info-->
							</li>
							<li>
								<div class="avatar">
									<img alt="" src="/static/images/thumbs/avatar2.png" />
								</div>
								<div class="info">
									<a href="">Flynn</a> <br /> Accounting Manager <br /> 18
									minutes ago
								</div> <!--info-->
							</li>
						</ul>
						<a class="more" href="">查看更多用户</a>
					</div>
					<!--widgetcontent-->
				</div>
			</div>
			<!--one_third last-->
		</div>
		<!-- #updates -->
	</div>
	<!--contentwrapper-->
	<br clear="all" />
<!-- </div> -->
<!--jquery-->
<script type="text/javascript"
	src="/static/js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript"
	src="/static/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
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
