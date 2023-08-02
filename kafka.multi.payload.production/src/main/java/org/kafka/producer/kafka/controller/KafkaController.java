package org.kafka.producer.kafka.controller;

import KafkaDTO.Book;
import KafkaDTO.Vehicle;
import org.kafka.producer.kafka.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/auth" +"/kafka")
public class KafkaController {
    @Autowired
    private KafkaProducer kafkaProducer;
    @PostMapping("/sendVehicle")
    public Vehicle sendVehicle(@RequestBody Vehicle pojo){
        kafkaProducer.sendVehicle(pojo);
        return pojo;
    }
    @PostMapping("/sendBook")
    public Book sendBook(@RequestBody Book pojo){
        kafkaProducer.sendBook(pojo);
        return pojo;
    }
}
