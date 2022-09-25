package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calcularvel_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Velocidad Sevilla </title>\r\n");
      out.write("        <!-----------------------------BOOTSTRAP----------------------------->\r\n");
      out.write("                <!--Icono-->\r\n");
      out.write("\t\t<link rel=\"Icon\" type=\"img/png\" href=\"img/logoicono.png\">\r\n");
      out.write("\t\t<!-- Google font -->\r\n");
      out.write("\t\t<link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,500,700\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<!-- Bootstrap -->\r\n");
      out.write("\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\r\n");
      out.write("\t\t<!-- Slick -->\r\n");
      out.write("\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick.css\"/>\r\n");
      out.write("\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick-theme.css\"/>\r\n");
      out.write("\t\t<!-- nouislider -->\r\n");
      out.write("\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/nouislider.min.css\"/>\r\n");
      out.write("\t\t<!-- Font Awesome Icon -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("\t\t<!-- Custom stlylesheet -->\r\n");
      out.write("\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\"/>\r\n");
      out.write("\t\t<!--Ventanas emergentes-->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/ventanas.css\">\r\n");
      out.write("<!-----------------------------/BOOTSTRAP----------------------------->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"background-color: #1b6d85;\">\r\n");
      out.write("    <marquee><h1>Resultado de calcular velocidad </h1>ee></marquee>\r\n");
      out.write("    <hr>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"jumbotron\">\r\n");
      out.write("            <center>\r\n");
      out.write("                <h3> Resultado de velocidad y datos captureados </h3>\r\n");
      out.write("                ");

                    float aceleracioCap=Float.parseFloat(request.getParameter("aceleracion "));
                    float tiempo=float.parseFloat.parseFloat(request.getParameter("tiempo"));
                    float velocidad=aceleracioCap*tiempoCap;
                    
String nombreAlu="Diana Sevilla ";
String NombreUACM="UACM";

                
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                <hr>\r\n");
      out.write("                <h4> Aceleracion es: ");
-aceleracionCap
      out.write("</h4>\r\n");
      out.write("                <h4> Tiempo es: ");
-tiempoCap
      out.write("</h4>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <h3> Velocidad es: ");
-aceleracionCap
      out.write("</h3>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <h4> Autor : ");
      out.print( nombreAlu);
      out.write(" Universidad :");
      out.print(nombreUACM );
      out.write("</h4>\r\n");
      out.write("                <h4> Fecha y hora del sistema: ");
      out.print(new java.util.Data);
      out.write("</h4>\r\n");
      out.write("            \r\n");
      out.write("            </center>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- js Plugins -->\r\n");
      out.write("\t\t<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/slick.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/nouislider.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/jquery.zoom.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"js/main.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/municipios.js\"></script>\r\n");
      out.write("    \t<script type=\"text/javascript\" src=\"js/select_estados.js\"></script>\r\n");
      out.write("<!-- /js Plugins -->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
