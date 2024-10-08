package com.tmax.articleservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ArticleController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/articles")
    public String test() {

        return "/articles";
    }
}
