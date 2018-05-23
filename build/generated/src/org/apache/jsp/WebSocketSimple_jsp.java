package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class WebSocketSimple_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.7.2.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-ui-1.8.22.custom.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        var miWebsocket = null;\n");
      out.write("        \n");
      out.write("        function connect(){\n");
      out.write("            var uriWS=\"ws://\"+ location.host +\"/WebSocketExample1/simple\";\n");
      out.write("            if ('WebSocket' in window) {\n");
      out.write("                miWebsocket = new WebSocket(uriWS);\n");
      out.write("            } else if ('MozWebSocket' in window) {\n");
      out.write("                miWebsocket = new MozWebSocket(uriWS);\n");
      out.write("            } else {\n");
      out.write("                alert('Tu navegador no soporta WebSockets');\n");
      out.write("                return;\n");
      out.write("            }\n");
      out.write("            console.log (miWebsocket);\n");
      out.write("            miWebsocket.onopen = function () {\n");
      out.write("                miWebsocket.send(\"...\");\n");
      out.write("                addMessage('Concectado!');\n");
      out.write("            };\n");
      out.write("            miWebsocket.onmessage = function (event) {\n");
      out.write("                var message = event.data;\n");
      out.write("                addMessage(message);\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            miWebsocket.onclose = function () {\n");
      out.write("                addMessage('Desconectado!');\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            miWebsocket.onerror = function (event) {\n");
      out.write("                addMessage('Se produjo un error!');\n");
      out.write("            };\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        function disconnect() {\n");
      out.write("            if (miWebsocket != null) {\n");
      out.write("                miWebsocket.close();\n");
      out.write("                miWebsocket = null;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function sendMessage(message) {\n");
      out.write("            if (miWebsocket != null) {\n");
      out.write("                miWebsocket.send(message);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function addMessage(message) {\n");
      out.write("            var messages = document.getElementById('messages').value;\n");
      out.write("            messages += (message + '\\n');\n");
      out.write("            document.getElementById('messages').value = messages;\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write(" \n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Title</title>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    <h1>WebSocket RFV</h1>\n");
      out.write("    <br/>\n");
      out.write("    \n");
      out.write("    <label for=\"name\">Nombre:</label> <input type=\"text\" id=\"name\"/>\n");
      out.write("    <br/><br/>\n");
      out.write("    <button onclick=\"connect()\">Conectar</button>\n");
      out.write("    <button onclick=\"disconnect()\">Desconectar</button>\n");
      out.write("    <button onclick=\"sendMessage(document.getElementById('name').value)\">Enviar mensaje</button>\n");
      out.write("    <br/><br/>\n");
      out.write("    <textarea rows=\"5\" cols=\"50\" id=\"messages\"></textarea>\n");
      out.write("\n");
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
