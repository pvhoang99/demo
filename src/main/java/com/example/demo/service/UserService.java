package com.example.demo.service;

import com.example.demo.dao.entity.UserEntity;
import com.example.demo.dao.repository.UserRepository;
import com.example.demo.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public UserEntity createUser(UserDTO userDTO) {

    if (userRepository.checkUserExistByUserName(userDTO.getUsername()) > 0) {
      return null;
    }

    UserEntity userEntity = new UserEntity();
    userEntity.setFullName(userDTO.getFullName());
    userEntity.setPassword(userDTO.getPassword());
    userEntity.setUsername(userDTO.getUsername());

    return userRepository.save(userEntity);

  }

}
