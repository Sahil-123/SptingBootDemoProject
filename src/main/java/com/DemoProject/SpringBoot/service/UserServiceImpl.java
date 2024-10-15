package com.DemoProject.SpringBoot.service;

import com.DemoProject.SpringBoot.dto.ResponseDto.UserResponseDTO;
import com.DemoProject.SpringBoot.dto.UserDTO;
import com.DemoProject.SpringBoot.entity.User;
import com.DemoProject.SpringBoot.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponseDTO save(UserDTO userDTO) {
        User user= new User();
        BeanUtils.copyProperties(userDTO,user);
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        user = userRepository.save(user);
        BeanUtils.copyProperties(user,userResponseDTO);
        return userResponseDTO;
    }
}
