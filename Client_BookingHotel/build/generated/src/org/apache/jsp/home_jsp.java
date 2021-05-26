package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"table-wrapper\" id=\"printTable\">\n");
      out.write("        <h3 align=\"center\">Daftar Booking Hotel PASTI</h3>\n");
      out.write("        <div class=\"d-grid gap-2 d-md-block\">\n");
      out.write("            <a href=\"tambah.jsp\"><button class=\"btn btn-primary\">Tambah</button></a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <hr>\n");
      out.write("        \n");
      out.write("        <table class=\"table table-bordered\">\n");
      out.write("            <thead>\n");
      out.write("                <tr style=\"text-align:center\">\n");
      out.write("                    <th>No. Kamar</th>\n");
      out.write("                    <th>Jenis Kamar</th>\n");
      out.write("                    <th>Harga</th>\n");
      out.write("                    <th>Nama Customer</th>\n");
      out.write("                    <th>Check In</th>\n");
      out.write("                    <th>Check Out</th>\n");
      out.write("                    <th>No. HP</th>\n");
      out.write("                    <th>Status</th>\n");
      out.write("                    <th>Alamat</th>\n");
      out.write("                    <th colspan=\"2\">Aksi</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("        <tbody>\n");
      out.write("        <tr>\n");
      out.write("\n");
      out.write("        ");

        try {
            WebServiceClient.KamarHotel service = new WebServiceClient.KamarHotel();
            WebServiceClient.KamarHotelService port= service.getKamarHotelServicePort();
            // TODO process result here
            java.util.List<java.lang.Object> resultRoom = port.tampilBooking();
            for (int i = 0; i < resultRoom.size(); i++) {
            out.println(resultRoom.get(i));
        }
        } catch (Exception ex) {
        // TODO handle custom exceptions here
        }
        
      out.write("     \n");
      out.write("</tr>\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
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
