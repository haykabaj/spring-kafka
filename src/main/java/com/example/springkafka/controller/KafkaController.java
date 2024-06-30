package com.example.springkafka.controller;

import com.example.springkafka.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducerService producerService;

    @PostMapping("/publish")
    public String sendMessageToKafka(@RequestBody String message) {
        producerService.sendMessage(message);
        return "Message sent to Kafka successfully!";
    }
}
