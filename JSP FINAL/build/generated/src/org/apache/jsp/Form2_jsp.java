package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Form2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"> \n");
      out.write("        <meta name=\"author\" content=\"ColorLib\"> \n");
      out.write("        <meta name=\"KeyWords\" content=\"ColorLib Templates\"> \n");
      out.write("     \n");
      out.write("    <!-- Title Page-->\n");
      out.write("    <title> IBM-Link7: SVIIT-SVICA Internship 20-21 Lock-1st Internal Evaluation report </title>\n");
      out.write("    <!-- main.css--> \n");
      out.write("    <link href=\"css/main.css\"  rel=\"stylesheet\" media=\"all\">  \n");
      out.write("</head> \n");
      out.write("<body>  \n");
      out.write("               <div class=\"page-wrapper bg-gra-03 p-t-45 p-b-50\">\n");
      out.write("        <div class=\"wrapper wrapper--w790\">\n");
      out.write("            <div class=\"card card-5\">\n");
      out.write("                <div class=\"card-heading\">\n");
      out.write("                    <h2 class=\"title\"></h2>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"card-body meraFlex\">\n");
      out.write("\n");
      out.write("                    <div class=\"success\">\n");
      out.write("                        <h1 style=\"text-align: center;  font-size:xx-large;\">\n");
      out.write("                            IBM-Link7: SVIIT-SVICA Internship20-21 Lock-1st Internal Evaluation Report\n");
      out.write("                        </h1>\n");
      out.write("                        <br><br>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <br><br>\n");
      out.write("            <div class=\"card card-5\">\n");
      out.write("                <div class=\"card card-5\">\n");
      out.write("                    <div class=\"card-heading\">\n");
      out.write("                        <p class=\"meraTitle\">\n");
      out.write("                              Find here Imp Docs/PDF/Format. \n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"card-body meraFlex2\">\n");
      out.write("\n");
      out.write("                        <div>\n");
      out.write("                            <p class=\"meraPara\"> 4. <a href=\"#\">\n");
      out.write("                                    Form-II Monthly External Evaluation Report Format\n");
      out.write("                                </a></p>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("                        <div>\n");
      out.write("                            <p class=\"meraPara\"> 3. <a href=\"#\">\n");
      out.write("                                    Form-I Fortnight Report Format (For Interns)\n");
      out.write("                                </a></p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("\n");
      out.write("                        <p class=\"meraPara\"> 2. <a href=\"#\">\n");
      out.write("                                Academic Calendar\n");
      out.write("                            </a></p>\n");
      out.write("                        <br>\n");
      out.write("                        <div>\n");
      out.write("                            <p class=\"meraPara\"> 1. <a href=\"#\">\n");
      out.write("                                    Guidelines_for_Monitoring_and_Evaluation_of_Industrial_Internship\n");
      out.write("                                </a></p>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("    \n");
      out.write("<form method=\"POST\" action=\"Form3.jsp\" onclick=\"this.value\"> \n");
      out.write("    <div class=\"flex-parent jc-center\"> \n");
      out.write("        <button class=\"btn btn--radius-2 btn--red\" type=\"button\" value=\"back\" onclick=\"history.back()\"> Back </button> \n");
      out.write("                                <button class=\"btn btn--radius-2 btn--red\" type=\"submit\">Next</button>\n");
      out.write("                            </div>\n");
      out.write(" </form>\n");
      out.write("                      \n");
      out.write("                        <br>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("                            \n");
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
