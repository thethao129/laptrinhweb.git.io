package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<!-- css -->\n");
      out.write("<link rel=\"stylesheet\" href=\"../template/css/index.css\">\n");
      out.write("\n");
      out.write("<!-- jQuery library -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- js -->\n");
      out.write("<script src=\"../template/js/index.js\" type=\"text/javascript\"></script>\n");
      out.write("<!-- font-awesome -->\n");
      out.write("<link rel=\"stylesheet\" href=\"../template/fontawesome/css/all.css\">\n");
      out.write("\n");
      out.write("<title>Index</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/view/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/view/banner.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t<div class=\"product\">\n");
      out.write("\t\t<div class=\"product-inner\">\n");
      out.write("\t\t\t<div class=\"title-product\">\n");
      out.write("\t\t\t\t<h1>Sản phẩm</h1>\n");
      out.write("\t\t\t\t<hr class=line>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"intro-product\">\n");
      out.write("\t\t\t\t<p>\"Càng mua Càng rẻ\" Chúng tôi không cố gắng để thuyết phục người dùng về điều chỉnh suy nghĩ của mình, mà đơn giản, đó chỉ là tìm cách tốt nhất để tiết kiệm tài chính phục vụ cho lợi ích của chính mình. Đó cũng chính là những gì chúng tôi cố gắng để đem đến cho người dùng một lời giới thiệu ý nghĩa nhất.</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"list-product\">\n");
      out.write("\t\t\t\t<div class=\"item-product col-4 col-12 col-6\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"item-inner\">\n");
      out.write("\t\t\t\t\t\t<div class=\"item-img-cart\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item-cart-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\"><i class=\"fas fa-cart-plus\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item-img-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/iphone11-pro.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"item-info\">\n");
      out.write("\t\t\t\t\t\t\t<h2 class=\"price-product\">30$</h2>\n");
      out.write("\t\t\t\t\t\t\t<h2 class=\"name-product\">Iphone11-pro</h2>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"item-product col-4 col-12 col-6\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"item-inner\">\n");
      out.write("\t\t\t\t\t\t<div class=\"item-img-cart\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item-cart-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\"><i class=\"fas fa-cart-plus\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item-img-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/iphone11-pro.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"item-info\">\n");
      out.write("\t\t\t\t\t\t\t<h2 class=\"price-product\">30$</h2>\n");
      out.write("\t\t\t\t\t\t\t<h2 class=\"name-product\">Iphone11-pro</h2>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"item-product col-4 col-12 col-6\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"item-inner\">\n");
      out.write("\t\t\t\t\t\t<div class=\"item-img-cart\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item-cart-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\"><i class=\"fas fa-cart-plus\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item-img-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/iphone11-pro.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"item-info\">\n");
      out.write("\t\t\t\t\t\t\t<h2 class=\"price-product\">30$</h2>\n");
      out.write("\t\t\t\t\t\t\t<h2 class=\"name-product\">Iphone11-pro</h2>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"item-product col-4 col-12 col-6\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"item-inner\">\n");
      out.write("\t\t\t\t\t\t<div class=\"item-img-cart\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item-cart-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\"><i class=\"fas fa-cart-plus\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item-img-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/iphone11-pro.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"item-info\">\n");
      out.write("\t\t\t\t\t\t\t<h2 class=\"price-product\">30$</h2>\n");
      out.write("\t\t\t\t\t\t\t<h2 class=\"name-product\">Iphone11-pro</h2>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"item-product col-4 col-12 col-6\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"item-inner\">\n");
      out.write("\t\t\t\t\t\t<div class=\"item-img-cart\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item-cart-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"\"><i class=\"fas fa-cart-plus\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item-img-info\">\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"images/iphone11-pro.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"item-info\">\n");
      out.write("\t\t\t\t\t\t\t<h2 class=\"price-product\">30$</h2>\n");
      out.write("\t\t\t\t\t\t\t<h2 class=\"name-product\">Iphone11-pro</h2>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"extend\">\n");
      out.write("\t\t\t\t<a href=\"\">\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-angle-double-down\"></i>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/view/footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
