/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ads.websocket;

import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author Richar
 */

@ServerEndpoint("/echo")
public class MiWebSocket {
    
    @OnMessage
    public String mensaje(String mensaje) {
        return "** Server **"+mensaje;
    }
}
