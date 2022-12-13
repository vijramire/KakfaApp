package com.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service 
public class Consumer {
    
	@KafkaListener(topics ="Cricket_Topic", groupId = "Cricket_Group")
	public void listenToTopic(String receviedMsg) {
		System.out.println("The message is received is "+receviedMsg);
	}
}
