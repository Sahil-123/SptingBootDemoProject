package com.DemoProject.SpringBoot.service;

import com.DemoProject.SpringBoot.kafkaModel.KafkaData;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaServiceImpl {

    @KafkaListener(topics = "init", groupId = "testing-kafka")
    public void consume(String kafkaData){
        System.out.println("new data : "+kafkaData);
    }

}
