package com.DemoProject.SpringBoot.kafkaModel;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class KafkaData {
    private String message;
}
