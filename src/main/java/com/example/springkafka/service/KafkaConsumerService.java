package com.example.springkafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private static final String TOPIC = "my-topic";

    @KafkaListener(topics = TOPIC, groupId = "my-group-id")
    public void listen(String message) {
        System.out.println("Received Message in group 'my-group-id': " + message);
    }

}
