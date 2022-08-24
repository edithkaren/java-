package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Result_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("          <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"Colorlib Templates\">\n");
      out.write("    <meta name=\"author\" content=\"Colorlib\">\n");
      out.write("    <meta name=\"keywords\" content=\"Colorlib Templates\">\n");
      out.write("        <title>JSP Page</title> \n");
      out.write("        <link href=\"css/main.css\"  rel=\"stylesheet\" media=\"all\"> \n");
      out.write("    <style>\n");
      out.write("        .main {\n");
      out.write("            width: 100vw;\n");
      out.write("            height: 90vh;\n");
      out.write("            border: 5px double black;\n");
      out.write("            padding-top: 10px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .header {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 25%;\n");
      out.write("            display: flex;\n");
      out.write("            flex-direction: column;\n");
      out.write("\n");
      out.write("            justify-content: space-evenly;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .linkName {\n");
      out.write("            margin-top: 20px;\n");
      out.write("            font-size: large;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .logo {\n");
      out.write("            width: 100%;\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 80px;\n");
      out.write("            ;\n");
      out.write("            font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .myTable {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 70%;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .table{\n");
      out.write("            font-size: large;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div id=\"jspBody\"  class=\"main\">    \n");
      out.write("    <div class=\"linkname\"> \n");
      out.write("        IBM-Link7: SVIIT-SVICA Internship20-21 Lock-1st Internal Evaluation Report\n");
      out.write("    </div>\n");
      out.write("    </div> \n");
      out.write("        <div class=\"myTable\" > \n");
      out.write("            <table border=\"1\" class=\"table\"> \n");
      out.write("                <tbody> \n");
      out.write("                    <tr> \n");
      out.write("                        <td> # </th> \n");
      out.write("                        <td> key </th> \n");
      out.write("                        <td> Value</th> \n");
      out.write("                    </tr> \n");
      out.write("                     <tr>\n");
      out.write("                        <th>1</th>\n");
      out.write("                        <td>Name</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>2</th>\n");
      out.write("                        <td>Surname</td>\n");
      out.write("                        <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${student_surname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>3</th>\n");
      out.write("                        <td>Enrollment_Number </td>\n");
      out.write("                        <td> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${enrollment_number}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>4</th>\n");
      out.write("                        <td>Specialization </td>\n");
      out.write("                        <td> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${specialization}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>5</th>\n");
      out.write("                        <td>Mentor Number</td>\n");
      out.write("                        <td> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mentor_phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>6</th>\n");
      out.write("                        <td>File_path_name</td>\n");
      out.write("                        <td> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${file_path_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                    </tr> \n");
      out.write("                    <tr>\n");
      out.write("                        <th>7</th>\n");
      out.write("                        <td>Percentage</td>\n");
      out.write("                        <td> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${percentage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                    </tr> \n");
      out.write("                    <tr>\n");
      out.write("                        <th>8</th>\n");
      out.write("                        <td>Grade</td>\n");
      out.write("                        <td> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${grade}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>9</th>\n");
      out.write("                        <td>Marks</td>\n");
      out.write("                        <td> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${score}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("                    <div> \n");
      out.write("                        <button class=\"btn btn--blue\" type=\"button\" id=\"generateMypdf\" > download </button>\n");
      out.write("                    </div> \n");
      out.write("    </body>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.1.135/jspdf.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n");
      out.write("<script src=\"meraScript.js\"></script>\n");
      out.write("       \n");
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
