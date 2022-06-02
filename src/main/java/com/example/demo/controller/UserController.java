package com.example.demo.controller;

import com.example.demo.dao.entity.UserEntity;
import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // = @Controller + @ResponseBody
@RequestMapping("/api/v1")
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/user/create", method = RequestMethod.POST)
  public UserEntity createUser(@RequestBody UserDTO userDTO) {
    return userService.createUser(userDTO);
  }
}
