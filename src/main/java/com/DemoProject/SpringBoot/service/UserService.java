package com.DemoProject.SpringBoot.service;


import com.DemoProject.SpringBoot.dto.ResponseDto.UserResponseDTO;
import com.DemoProject.SpringBoot.dto.UserDTO;
import com.DemoProject.SpringBoot.entity.User;

public interface UserService {
    UserResponseDTO save(UserDTO userDTO);
}
