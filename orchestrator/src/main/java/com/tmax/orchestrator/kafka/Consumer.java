package com.tmax.orchestrator.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Consumer {

    @KafkaListener(topics = "TEST", groupId = "test-group")
    public void consume(String message) {
        System.out.println(message);
    }
}
