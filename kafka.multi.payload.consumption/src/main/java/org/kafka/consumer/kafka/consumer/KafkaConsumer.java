package org.kafka.consumer.kafka.consumer;

import KafkaDTO.Book;
import KafkaDTO.Vehicle;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(topics = "test", groupId = "default", containerFactory = "listenerContainerFactory")
public class KafkaConsumer {

    @KafkaHandler
    public Vehicle Listner(@Payload Vehicle vehicle) {
        System.out.println("Received Message in group Test1: " + vehicle);
        return vehicle;
    }
    @KafkaHandler
    public Book Listner2(@Payload Book book) {
        System.out.println("Received Message in group Test1: " + book);
        return book;
    }

}
