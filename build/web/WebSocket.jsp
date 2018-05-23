<%-- 
    Document   : WebSocket
    Created on : 21/05/2018, 10:32:30 PM
    Author     : Richar
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <script language="javascript" type="text/javascript">
        var wsUri = getRootUri();

        function getRootUri() {
            return "ws://" + location.host + "/WebSocketEcho/echo";
        }

        function init() {
            output = document.getElementById("output");
        }

        function send_echo() {

            websocket = new WebSocket(wsUri);
            console.log (websocket);
            websocket.onopen = function (evt) {
                onOpen(evt)
            };
            websocket.onmessage = function (evt) {
                onMessage(evt)
            };
            websocket.onerror = function (evt) {
                onError(evt)
            };
        }

        function onOpen(evt) {
            writeToScreen("Connected");
            doSend(textID.value);

        }

        function onMessage(evt) {
            writeToScreen("Received: " + evt.data);
        }

        function onError(evt) {
            writeToScreen('<span style="color: red;">ERROR:</span> ' + evt.data);
        }

        function doSend(message) {
            writeToScreen("Sent: " + message);
            websocket.send(message);
        }

        function writeToScreen(message) {
            var pre = document.createElement("p");
            pre.style.wordWrap = "break-word";
            pre.innerHTML = message;
            output.appendChild(pre);
        }

        window.addEventListener("load", init, false);

    </script>
    
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
    </head>
<body>
    <h2 style="text-align: center;">WebSocket Echo Client</h2>
    <br></br>

    <div style="text-align: center;">
        <form action="">
            <input onclick="send_echo()" value="Press me" type="button">
            <input id="textID" name="message" value="Hello WebSocket!" type="text"><br>
        </form>
    </div>
    <div id="output"></div>
</body>
</html>