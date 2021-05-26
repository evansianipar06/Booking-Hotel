package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navbar.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Booking Hotel</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("              <a class=\"navbar-brand\" href=\"dashboard.jsp\">Booking Hotel PASTI</a>\n");
      out.write("              <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("              </button>\n");
      out.write("              <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                  <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link active\" aria-current=\"page\" href=\"dashboard.jsp\">Home</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" aria-current=\"page\" href=\"tambah.jsp\">Booking</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" aria-current=\"page\" href=\"home.jsp\">Daftar Booking</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"profil.jsp\">Kelompok</a>\n");
      out.write("                    </li>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"d-flex\">\n");
      out.write("                        \n");
      out.write("                  </li>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("                  <form class=\"d-flex\">\n");
      out.write("                       <a class=\"nav-link\" href=\"logout.jsp\">Logout</a>\n");
      out.write("                </form>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Booking Hotel</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./css/bootstrap.css\">\n");
      out.write("\t<script type=\"text/javascript\" src=\"./js/jquery.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"./js/bootstrap.js\"></script>\t\n");
      out.write("<link rel=\"dns-prefetch\" href=\"//fonts.googleapis.com\" />\n");
      out.write("<link rel=\"dns-prefetch\" href=\"//fonts.gstatic.com\" />\n");
      out.write("<link rel=\"preload\" as=\"style\" href=\"https://fonts.googleapis.com/css?family=Open Sans:400,500,600,700&display=swap\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open Sans:400,500,600,700&display=swap\" media=\"print\" onload=\"this.media='all'\">\n");
      out.write("</head>\n");
      out.write("<body data-rsssl=1>\n");
      out.write("\n");
      out.write("   <div class=\"container\">\t\t\n");
      out.write("\t<center><h1>Booking Hotel PASTI</h1></center>\n");
      out.write("\t<br/>\n");
      out.write("\t<div id=\"carouselExampleDark\" class=\"carousel carousel-dark slide\" data-bs-ride=\"carousel\">\n");
      out.write("  <div class=\"carousel-indicators\">\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleDark\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleDark\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\n");
      out.write("    <button type=\"button\" data-bs-target=\"#carouselExampleDark\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\n");
      out.write("  </div>\n");
      out.write("        ");

	if(session.getAttribute("login")==null || session.getAttribute("login")==" ") //check condition unauthorize user not direct access welcome.jsp page
	{
		response.sendRedirect("dashboard.jsp"); 
	}
	
      out.write("\n");
      out.write("\t\n");
      out.write("\t<h1> Selamat Datang ! </h1>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\" data-bs-interval=\"10000\">\n");
      out.write("        <img src=\"./img/6.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("        <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("          <h5>Booking NOW</h5>\n");
      out.write("          <p>Cepat dan Tepat</p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\" data-bs-interval=\"2000\">\n");
      out.write("      <img src=\"./img/2.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("      <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("            <h5>Booking NOW</h5>\n");
      out.write("            <p>Cepat dan Tepat</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"./img/3.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("      <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("            <h5>Booking NOW</h5>\n");
      out.write("            <p>Cepat dan Tepat</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleDark\"  data-bs-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"visually-hidden\">Previous</span>\n");
      out.write("  </button>\n");
      out.write("  <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleDark\"  data-bs-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"visually-hidden\">Next</span>\n");
      out.write("  </button>\n");
      out.write("</div>\n");
      out.write(" <hr> \n");
      out.write(" <hr>\n");
      out.write(" <center><h4> Jenis Room Hotel PASTI</h4></center>\n");
      out.write(" <br>\n");
      out.write(" \n");
      out.write(" <div class=\"row row-cols-1 row-cols-md-3 g-4\">\n");
      out.write("  <div class=\"col\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <img src=\"./img/hotel1.jpg\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Kamar SUITE</h5>\n");
      out.write("        <p class=\"card-text\">Rp. 180.000</p>\n");
      out.write("        <a href=\"kamarSuite.jsp\" class=\"btn btn-primary\">Booking</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <img src=\"./img/hotel2.jpeg\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Kamar DELUXE</h5>\n");
      out.write("        <p class=\"card-text\">Rp. 150.000</p>\n");
      out.write("        <a href=\"kamarDeluxe.jsp\" class=\"btn btn-primary\">Booking</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("      <img src=\"./img/hotel3.jpg\" class=\"card-img-top\" alt=\"...\">\n");
      out.write("      <div class=\"card-body\">\n");
      out.write("        <h5 class=\"card-title\">Kamar DELUXE ROOM ONLY</h5>\n");
      out.write("        <p class=\"card-text\">Rp. 130.000</p>\n");
      out.write("        <a href=\"kamarDeluxeRoomOnly.jsp\" class=\"btn btn-primary\">Booking</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("   </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
