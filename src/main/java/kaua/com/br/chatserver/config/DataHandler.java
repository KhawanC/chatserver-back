package kaua.com.br.chatserver.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.fasterxml.jackson.databind.ObjectMapper;

import kaua.com.br.chatserver.model.Pessoa;
import kaua.com.br.chatserver.service.PessoaService;

public class DataHandler extends TextWebSocketHandler{
	
	private static final Logger LOG = LoggerFactory.getLogger(DataHandler.class);
	
	@Autowired
	PessoaService service;

	@Override
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) {
		try {
			Pessoa pessoa = new ObjectMapper().readValue(""+message.getPayload(), Pessoa.class);
			service.post(pessoa);
			System.out.println(pessoa);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
}
