package org.kafka.producer.kafka.producer;

import KafkaDTO.Book;
import KafkaDTO.Vehicle;
import org.kafka.producer.kafka.constants.KafkaConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    @Autowired
    KafkaTemplate<String, Object> kafkaTemplate;
    public Vehicle sendVehicle(Vehicle vehicle){
        kafkaTemplate.send(KafkaConstants.topic, vehicle);
        return vehicle;
    }
    public Book sendBook(Book book){
        kafkaTemplate.send(KafkaConstants.topic, book);
        return book;
    }
}
