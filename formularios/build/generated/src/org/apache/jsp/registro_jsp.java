package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Registro Sevilla </title>\n");
      out.write("        <!-----------------------------BOOTSTRAP----------------------------->\n");
      out.write("                <!--Icono-->\n");
      out.write("\t\t<link rel=\"Icon\" type=\"img/png\" href=\"img/logoicono.png\">\n");
      out.write("\t\t<!-- Google font -->\n");
      out.write("\t\t<link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,500,700\" rel=\"stylesheet\">\n");
      out.write("\t\t<!-- Bootstrap -->\n");
      out.write("\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("\t\t<!-- Slick -->\n");
      out.write("\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick.css\"/>\n");
      out.write("\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick-theme.css\"/>\n");
      out.write("\t\t<!-- nouislider -->\n");
      out.write("\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/nouislider.min.css\"/>\n");
      out.write("\t\t<!-- Font Awesome Icon -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\t\t<!-- Custom stlylesheet -->\n");
      out.write("\t\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("\t\t<!--Ventanas emergentes-->\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/ventanas.css\">\n");
      out.write("<!-----------------------------/BOOTSTRAP----------------------------->\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String matriculaAlumno=request.getParameter("matri");
            String nombreAlu=request.getParameter("nombre");
            String carreraAlu=request.getParameter("carrera");
            int edadAlu=Integer.parseInt(request.getParameter("edad"));
            String telAlu=request.getParameter("telefono");
            String correoAlu=request.getParameter("correo");
            String fechaAlu=request.getParameter("fecha");
            
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"jumbotron\">\n");
      out.write("                    <div class=\"alert-info\">\n");
      out.write("                        <center>\n");
      out.write("                            <h3>Datos del alumno </h3>\n");
      out.write("                            <hr>\n");
      out.write("                            <h4> Matricula alumno : ");
      out.print( matriculaAlumno );
      out.write("</h4>\n");
      out.write("                             <h4>Nombre del alumno : ");
      out.print( nombreAlu );
      out.write("</h4>\n");
      out.write("                              <h4> carrera  alumno : ");
      out.print( carreraAlu );
      out.write("</h4>\n");
      out.write("                               <h4> Edad alumno : ");
      out.print( edadAlu );
      out.write("</h4>\n");
      out.write("                                <h4>Telefono alumno : ");
      out.print( telAlu );
      out.write("</h4>\n");
      out.write("                                 <h4> Correo alumno : ");
      out.print( correoAlu );
      out.write("</h4>\n");
      out.write("                                 <h4> Fechs alumno : ");
      out.print( fechaAlu );
      out.write("</h4>\n");
      out.write("                             <hr>\n");
      out.write("                        </center>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("         <!-- js Plugins -->\n");
      out.write("\t\t<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/slick.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/nouislider.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/jquery.zoom.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/main.js\"></script>\n");
      out.write("                <script type=\"text/javascript\" src=\"js/municipios.js\"></script>\n");
      out.write("                <script type=\"text/javascript\" src=\"js/select_estados.js\"></script>\n");
      out.write("<!-- /js Plugins -->\n");
      out.write("    </body>\n");
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
