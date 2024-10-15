package com.DemoProject.SpringBoot.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {

    private Integer id;

    private String username;

    private String password;

    private String email;

    private String firstName;

    private String lastName;

    private String phoneNumber;
}
