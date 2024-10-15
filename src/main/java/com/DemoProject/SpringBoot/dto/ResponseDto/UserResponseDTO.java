package com.DemoProject.SpringBoot.dto.ResponseDto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseDTO {

    private Integer id;

    private String username;

    private String email;

    private String firstName;

    private String lastName;

    private String phoneNumber;
}
