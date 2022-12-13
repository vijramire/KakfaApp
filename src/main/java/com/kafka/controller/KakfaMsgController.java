package com.kafka.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.service.Producer;

@RestController
@RequestMapping("/rest/api/")
public class KakfaMsgController {
 
	@Autowired
	Producer producer;
	
    @GetMapping("/producerMsg")
	public void getMsgFromProducer(@RequestParam("message") String message) {
		producer.sendMsgToTopic(message);
	}
}
