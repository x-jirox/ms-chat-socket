package com.chatsocket.mschatsocket.controller;

import com.chatsocket.mschatsocket.dto.ChatMessage;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

   @MessageMapping("/chat{id}")
    @SendTo("/topic/{id}")
    public ChatMessage chat(@DestinationVariable String id, ChatMessage message) {
       return new ChatMessage(message.getMessage(),message.getUser());
   }
}
