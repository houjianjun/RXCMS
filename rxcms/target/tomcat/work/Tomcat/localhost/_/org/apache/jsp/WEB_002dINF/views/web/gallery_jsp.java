/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-03-14 02:07:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gallery_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/web/header.jsp", Long.valueOf(1520993010704L));
    _jspx_dependants.put("/WEB-INF/views/web/footer.jsp", Long.valueOf(1520991509545L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>创意作品</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/static/style/bootstrap.css\" />\r\n");
      out.write("<link href=\"/static/style/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<!--<script type=\"text/javascript\" src=\"js/jquery-3.3.1.js\"></script>-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/static/js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!-- header -->\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"header-top\">\r\n");
      out.write("\t\t\t<div class=\"header-top-left\">\r\n");
      out.write("\t\t\t\t<p>顶级创客，从这里开始……</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"header-top-left1\">\r\n");
      out.write("\t\t\t\t<!-- start search-->\r\n");
      out.write("\t\t\t\t<div class=\"search-box\">\r\n");
      out.write("\t\t\t\t\t<div id=\"sb-search\" class=\"sb-search\">\r\n");
      out.write("\t\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"sb-search-input\" placeholder=\"请输入搜索内容...\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"search\" name=\"search\" id=\"search\"> <input\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"sb-search-submit\" type=\"submit\" value=\"\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"sb-icon-search\"> </span>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- search-scripts -->\r\n");
      out.write("\t\t\t\t<script src=\"/static/js/classie.js\"></script>\r\n");
      out.write("\t\t\t\t<script src=\"/static/js/uisearch.js\"></script>\r\n");
      out.write("\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\tnew UISearch(document.getElementById('sb-search'));\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t<!-- //search-scripts -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"header-top-right\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t联系方式： <span><i class=\"glyphicon glyphicon-earphone\"\r\n");
      out.write("\t\t\t\t\t\taria-hidden=\"true\"></i>17003555856</span>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"header-logo\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"header-nav\">\r\n");
      out.write("\t\t\t<nav class=\"navbar navbar-default\">\r\n");
      out.write("\t\t\t\t<!-- 菜单分组显示 -->\r\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\"\r\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">导航切换</span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"navbar-brand\" href=\"index.html\">睿迅智能实验室 <span>创机人创客中心</span></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- 导航 -->\r\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse nav-wil\"\r\n");
      out.write("\t\t\t\t\tid=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"hvr-bounce-to-bottom active\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"/\">首页</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"hvr-bounce-to-bottom\"><a href=\"/product\">产品模块</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"hvr-bounce-to-bottom\"><a href=\"/gallery\">创意作品</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"hvr-bounce-to-bottom\"><a href=\"/download\">软件下载</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"hvr-bounce-to-bottom\"><a href=\"/question\">常见问题</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"hvr-bounce-to-bottom\"><a href=\"/contact\">联系我们</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /.navbar-collapse -->\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- //header -->");
      out.write("\r\n");
      out.write("<!-- gallery -->\r\n");
      out.write("\t\t<div class=\"gallery\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<h3>公司产品</h3>\r\n");
      out.write("\t\t\t\t<p class=\"velit\">智能传感与编程板</p>\r\n");
      out.write("\t\t\t\t<div class=\"gallery-grids\">\r\n");
      out.write("\t\t\t\t\t<div class=\"gallery-grid\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/static/images/2.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/images/2.jpg\" alt=\" \" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/static/images/7.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/images/7.jpg\" alt=\" \" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/static/images/8.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/images/8.jpg\" alt=\" \" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"gallery-grid\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/static/images/3.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/images/3.jpg\" alt=\" \" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/static/images/4.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/images/4.jpg\" alt=\" \" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/static/images/9.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/images/9.jpg\" alt=\" \" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/static/images/10.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/images/10.jpg\" alt=\" \" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"gallery-grid\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/static/images/5.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/images/5.jpg\" alt=\" \" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/static/images/6.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/images/6.jpg\" alt=\" \" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/static/images/11.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"/static/images/11.jpg\" alt=\" \" class=\"img-responsive\" />\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- //gallery -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!-- footer -->\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"col-md-3 footer-grid\">\r\n");
      out.write("\t\t\t<h6>关于我们</h6>\r\n");
      out.write("\t\t\t<p>我们是一支年轻而富有激情，新一代创新性产品研发团队。</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-3 footer-grid\">\r\n");
      out.write("\t\t\t<h6>信息</h6>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">关于我们</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">快递信息</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">政策隐私</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">服务条款</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-3 footer-grid\">\r\n");
      out.write("\t\t\t<h6>服务支持</h6>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">在线解答</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">历史订单</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">常见问题</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">最新消息</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-3 footer-grid\">\r\n");
      out.write("\t\t\t<h6>附加信息</h6>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">品牌</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">礼品券</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">分支机构</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">特价</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"footer-copy\">\r\n");
      out.write("\t<p>版权所有 &copy; 2016.山西迅腾伟业科贸有限公司 .</p>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li><a href=\"#\" class=\"facebook\"></a></li>\r\n");
      out.write("\t\t<li><a href=\"#\" class=\"in\"></a></li>\r\n");
      out.write("\t\t<li><a href=\"#\" class=\"v\"></a></li>\r\n");
      out.write("\t\t<li><a href=\"#\" class=\"p\"></a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- //footer -->");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/static/js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
