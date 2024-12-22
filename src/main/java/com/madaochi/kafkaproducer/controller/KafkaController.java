package com.madaochi.kafkaproducer.controller;


import com.madaochi.kafkaproducer.dto.ProducerDTO;
import com.madaochi.kafkaproducer.service.ProducerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private final ProducerService kafkaProducer;

    public KafkaController(ProducerService kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/kafka/send")
    public ResponseEntity<String> send(@RequestBody ProducerDTO producerDTO) {
        kafkaProducer.send(producerDTO.getContent());
        return ResponseEntity.ok("Message sent to Kafka topic successfully!");
    }
}
