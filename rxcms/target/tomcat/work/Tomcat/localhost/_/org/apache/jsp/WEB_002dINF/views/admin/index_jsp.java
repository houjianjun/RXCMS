/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-03-16 08:18:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/admin/menu.jsp", Long.valueOf(1521188286736L));
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
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("<title>睿迅CMS后台管理系统</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/static/style/style.default.css\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"withvernav\">\r\n");
      out.write("\t<div class=\"bodywrapper\">\r\n");
      out.write("\t\t<div class=\"topheader\">\r\n");
      out.write("\t\t\t<div class=\"left\">\r\n");
      out.write("\t\t\t\t<h1 class=\"logo\">\r\n");
      out.write("\t\t\t\t\t睿迅<span>CMS</span>\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t<span class=\"slogan\">后台管理系统</span>\r\n");
      out.write("\t\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t\t<form action=\"\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"keyword\" id=\"keyword\" value=\"请输入\" />\r\n");
      out.write("\t\t\t\t\t\t<button class=\"submitbutton\"></button>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--search-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<br clear=\"all\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--left-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"right\">\r\n");
      out.write("\t\t\t\t<div class=\"userinfo\">\r\n");
      out.write("\t\t\t\t\t<img src=\"/static/images/thumbs/avatar.png\" alt=\"\" /> <span>管理员</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--userinfo-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"userinfodrop\">\r\n");
      out.write("\t\t\t\t\t<div class=\"avatar\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"\"><img src=\"/static/images/thumbs/avatarbig.png\"\r\n");
      out.write("\t\t\t\t\t\t\talt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"changetheme\">\r\n");
      out.write("\t\t\t\t\t\t\t切换主题: <br /> <a class=\"default\"></a> <a class=\"blueline\"></a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"greenline\"></a> <a class=\"contrast\"></a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"custombg\"></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--avatar-->\r\n");
      out.write("\t\t\t\t\t<div class=\"userdata\">\r\n");
      out.write("\t\t\t\t\t\t<h4>admin</h4>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"email\">474177818@qq.com</span>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"javascript:void\">编辑资料</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"javascript:void\">账号设置</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"javascript:void\">帮助</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index.html\">退出</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--userdata-->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--userinfodrop-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--right-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--topheader-->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<ul class=\"headermenu\">\r\n");
      out.write("\t\t\t\t<li class=\"current\"><a href=\"/\"><span\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon icon-flatscreen\"></span>首页</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void\"><span\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon icon-pencil\"></span>内容管理</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void\"><span\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon icon-message\"></span>产品管理</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"javascript:void\"><span class=\"icon icon-chart\"></span>统计报表</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"headerwidget\">\r\n");
      out.write("\t\t\t\t<div class=\"earnings\">\r\n");
      out.write("\t\t\t\t\t<div class=\"one_half\">\r\n");
      out.write("\t\t\t\t\t\t<h4>访问用户</h4>\r\n");
      out.write("\t\t\t\t\t\t<h2>10000</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--one_half-->\r\n");
      out.write("\t\t\t\t\t<div class=\"one_half last alignright\">\r\n");
      out.write("\t\t\t\t\t\t<h4>今日订单</h4>\r\n");
      out.write("\t\t\t\t\t\t<h2>2000</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--one_half last-->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--earnings-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--headerwidget-->\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--header-->\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<div class=\"vernav2 iconmenu\">\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li><a href=\"#formsub\" class=\"editor\">系统管理</a> <span\r\n");
      out.write("\t\t\tclass=\"arrow\"></span>\r\n");
      out.write("\t\t\t<ul id=\"formsub\">\r\n");
      out.write("\t\t\t\t<li><a href=\"roles/rolesList\" target=\"main\">角色管理</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"manager/managerList\" target=\"main\">用户管理</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"sysconfig/sysconfigList\" target=\"main\">系统配置</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li><a href=\"#formProduct\" class=\"editor\">产品管理</a> <span\r\n");
      out.write("\t\t\tclass=\"arrow\"></span>\r\n");
      out.write("\t\t\t<ul id=\"formProduct\">\r\n");
      out.write("\t\t\t\t<li><a href=\"productClass/productClassList\" target=\"main\">分类管理</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"product/productList\" target=\"main\">产品管理</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li><a href=\"javascript:void\" class=\"widgets\" target=\"main\">订单管理</a></li>\r\n");
      out.write("\t\t<li><a href=\"#formContext\" class=\"editor\" >内容管理</a> <span\r\n");
      out.write("\t\t\tclass=\"arrow\"></span>\r\n");
      out.write("\t\t\t<ul id=\"formContext\">\r\n");
      out.write("\t\t\t\t<li><a href=\"newsClass/newsClassList\" target=\"main\">分类管理</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"news/newsList\" target=\"main\">内容管理</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t<li><a href=\"javascript:void\" class=\"support\">客户支持</a></li>\r\n");
      out.write("\t\t<li><a href=\"files/filesList\" class=\"gallery\" target=\"main\">文件管理</a></li>\r\n");
      out.write("\t\t<li><a href=\"javascript:void\" class=\"gallery\">图片管理</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<a class=\"togglemenu\"></a> <br />\r\n");
      out.write("\t<br />\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t\t<!--leftmenu-->\r\n");
      out.write("\t\t<div class=\"centercontent\">\r\n");
      out.write("\t\t\t<iframe name=\"main\" id=\"rightform\" src=\"welcome\" frameborder=\"0\"\r\n");
      out.write("\t\t\t\tscrolling=\"no\" width=\"100%\"></iframe>\r\n");
      out.write("\t\t\t<!-- centercontent -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--bodywrapper-->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<!--jquery-->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/static/js/plugins/jquery-1.7.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/static/js/plugins/jquery-ui-1.8.16.custom.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction changeFrameHeight() {\r\n");
      out.write("\t\tvar ifm = document.getElementById(\"rightform\");\r\n");
      out.write("\t\tifm.height = document.documentElement.clientHeight + 100;\r\n");
      out.write("\t}\r\n");
      out.write("\twindow.onresize = function() {\r\n");
      out.write("\t\tchangeFrameHeight();\r\n");
      out.write("\t}\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tchangeFrameHeight();\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<!--cookie-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/static/js/plugins/jquery.cookie.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/static/js/plugins/jquery.uniform.min.js\"></script>\r\n");
      out.write("<!--图表插件-->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/static/js/plugins/jquery.flot.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/static/js/plugins/jquery.flot.resize.min.js\"></script>\r\n");
      out.write("<!--横向滚动-->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/static/js/plugins/jquery.slimscroll.js\"></script>\r\n");
      out.write("<!--更换皮肤-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/static/js/custom/general.js\"></script>\r\n");
      out.write("<!--主页面-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/static/js/custom/dashboard.js\"></script>\r\n");
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
