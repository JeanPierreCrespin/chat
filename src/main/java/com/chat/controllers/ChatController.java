package com.chat.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.chat.entities.Message;
import com.chat.entities.OutputMessage;

@Controller
public class ChatController {
/*
	@MessageMapping("/chat")
	@SendTo("/topic/messages")
	public OutputMessage send(Message message) throws Exception {
		String time = new SimpleDateFormat("HH:mm").format(new Date());
		return new OutputMessage(message.getFrom(), message.getText(), time);
	}*/
	/*
	 * @MessageMapping("/chat")
	 * 
	 * @SendTo("/topic/messages") public Mensaje recibeMensaje(Mensaje mensaje) {
	 * mensaje.setFecha(new Date().getTime());
	 * mensaje.setTexto("Recibir por el broker: "+mensaje.getTexto()); return
	 * mensaje; } +/ /*@GetMapping("/inicio") public String inicio() { return
	 * "index"; }
	 */
}
