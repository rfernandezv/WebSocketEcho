package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class WebSocket_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("        var wsUri = getRootUri();\n");
      out.write("\n");
      out.write("        function getRootUri() {\n");
      out.write("            return \"ws://\" + location.host + \"/WebSocketEcho/echo\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function init() {\n");
      out.write("            output = document.getElementById(\"output\");\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function send_echo() {\n");
      out.write("\n");
      out.write("            websocket = new WebSocket(wsUri);\n");
      out.write("            console.log (websocket);\n");
      out.write("            websocket.onopen = function (evt) {\n");
      out.write("                onOpen(evt)\n");
      out.write("            };\n");
      out.write("            websocket.onmessage = function (evt) {\n");
      out.write("                onMessage(evt)\n");
      out.write("            };\n");
      out.write("            websocket.onerror = function (evt) {\n");
      out.write("                onError(evt)\n");
      out.write("            };\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function onOpen(evt) {\n");
      out.write("            writeToScreen(\"Connected\");\n");
      out.write("            doSend(textID.value);\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function onMessage(evt) {\n");
      out.write("            writeToScreen(\"Received: \" + evt.data);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function onError(evt) {\n");
      out.write("            writeToScreen('<span style=\"color: red;\">ERROR:</span> ' + evt.data);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function doSend(message) {\n");
      out.write("            writeToScreen(\"Sent: \" + message);\n");
      out.write("            websocket.send(message);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function writeToScreen(message) {\n");
      out.write("            var pre = document.createElement(\"p\");\n");
      out.write("            pre.style.wordWrap = \"break-word\";\n");
      out.write("            pre.innerHTML = message;\n");
      out.write("            output.appendChild(pre);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        window.addEventListener(\"load\", init, false);\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Title</title>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    <h2 style=\"text-align: center;\">WebSocket Echo Client</h2>\n");
      out.write("    <br></br>\n");
      out.write("\n");
      out.write("    <div style=\"text-align: center;\">\n");
      out.write("        <form action=\"\">\n");
      out.write("            <input onclick=\"send_echo()\" value=\"Press me\" type=\"button\">\n");
      out.write("            <input id=\"textID\" name=\"message\" value=\"Hello WebSocket!\" type=\"text\"><br>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"output\"></div>\n");
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
