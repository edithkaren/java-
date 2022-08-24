package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Form3_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags-->\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"Colorlib Templates\">\n");
      out.write("    <meta name=\"author\" content=\"Colorlib\">\n");
      out.write("    <meta name=\"keywords\" content=\"Colorlib Templates\">\n");
      out.write("\n");
      out.write("    <!-- Title Page-->\n");
      out.write("    <title>IBM-Link7: SVIIT-SVICA Internship 20-21 Lock-1st Internal Evaluation report</title>\n");
      out.write("\n");
      out.write("    <!-- Main CSS-->\n");
      out.write("    <link href=\"css/main.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"page-wrapper bg-gra-03 p-t-45 p-b-50\">\n");
      out.write("        <div class=\"wrapper wrapper--w790\">\n");
      out.write("            <div class=\"card card-5\">\n");
      out.write("                <div class=\"card-heading\">\n");
      out.write("                    <div class=\"card-heading\">\n");
      out.write("                                <h2 class=\"title\">IBM-Link7: SVIIT-SVICA Internship 20-21 Lock-1st Internal Evaluation report\n");
      out.write("                                   </h2>\n");
      out.write("                               \n");
      out.write("                            </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("\n");
      out.write("                        <div class=\"\">\n");
      out.write("                  <li> \n");
      out.write("                                    <p> The name and photo associated with your Google account will be recorded when you upload files and submit this form\n");
      out.write("                                    </p> \n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div><br> \n");
      out.write("    <div class=\"page-wrapper bg-gra-03 p-t-45 p-b-50\">\n");
      out.write("        <div class=\"wrapper wrapper--w790\">\n");
      out.write("            <div class=\"card card-5\">\n");
      out.write("                <div class=\"card-heading\">\n");
      out.write("                    <h2 class=\"title\"> Student Details</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    \n");
      out.write("                    <!-- Form -->\n");
      out.write("                    <form method=\"POST\" action=\"Form4.jsp\" enctype=\"multipart/form-data\">\n");
      out.write("                        <div class=\"form-row m-b-55\">\n");
      out.write("                            <div class=\"name\">Name</div>\n");
      out.write("                            <div class=\"value\">\n");
      out.write("                                <div class=\"row row-space\">\n");
      out.write("                                    <div class=\"col-2\">\n");
      out.write("                                        <div class=\"input-group-desc\">\n");
      out.write("                                            <input class=\"input--style-5\" type=\"name\" name=\"student_name\">\n");
      out.write("                                            <label class=\"label--desc\">name</label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div> \n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div> \n");
      out.write("                          <div class=\"form-row m-b-55\">\n");
      out.write("                            <div class=\"name\">Surname</div>\n");
      out.write("                            <div class=\"value\">\n");
      out.write("                                <div class=\"row row-space\">\n");
      out.write("                                    <div class=\"col-2\">\n");
      out.write("                                        <div class=\"input-group-desc\">\n");
      out.write("                                            <input class=\"input--style-5\" type=\"text\" name=\"student_Surname\">\n");
      out.write("                                            <label class=\"label--desc\">Surname</label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-row m-b-55\">\n");
      out.write("                            <div class=\"name\">Enrollment Number</div>\n");
      out.write("                            <div class=\"value\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <input class=\"input--style-5\" type=\"number\" name=\"enrollment_number\"> \n");
      out.write("                                    <label class=\"label--desc\" >Enrollment Number </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <div class=\"name\">Specialization</div>\n");
      out.write("                            <div class=\"value\">\n");
      out.write("                                <div class=\"input-group\">\n");
      out.write("                                    <div class=\"rs-select2 js-select-simple select--no-search\">\n");
      out.write("                                        <select name=\"specialization\">\n");
      out.write("                                            <option disabled=\"disabled\" selected=\"selected\">Choose option</option>\n");
      out.write("                                            <option>BDA</option>\n");
      out.write("                                            <option>CMC</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        <div class=\"select-dropdown\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>       \n");
      out.write("                        <div>\n");
      out.write("                            <button class=\"btn btn--radius-2 btn--red\" type=\"back\">Back</button> \n");
      out.write("                        </div>\n");
      out.write("                        <br> </br>   \n");
      out.write("                        <div>\n");
      out.write("                            <button class=\"btn btn--radius-2 btn--red\" type=\"submit\">Next</button>\n");
      out.write("                        </div> \n");
      out.write("                    </form>\n");
      out.write("                    <!-- Form-Ending -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
