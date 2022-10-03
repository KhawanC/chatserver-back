package kaua.com.br.chatserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import kaua.com.br.chatserver.model.Message;

@Controller
public class ChatController {
	
	@Autowired
	private SimpMessagingTemplate messagingTemplate;

	@MessageMapping("/message")
	@SendTo("/chatroom/public")
	public Message receivePublicMessage(@Payload Message message) {
		return message;
	}
	
	@MessageMapping("/private-message")
	public Message receivePrivateMessage(@Payload Message message) {
		messagingTemplate.convertAndSendToUser(message.getReceiverName(), "/private", message);
		return message;
	}
}
