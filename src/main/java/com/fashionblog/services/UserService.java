package com.fashionblog.services;

import com.fashionblog.DTO.request.UserLoginRequest;
import com.fashionblog.DTO.request.UserRegisterRequest;
import com.fashionblog.DTO.response.UserInfoResponse;
import com.fashionblog.entity.User;
import com.fashionblog.exception.UserAlreadyExistException;

import java.util.Optional;

public interface UserService {
  UserInfoResponse registerCustomer(UserRegisterRequest userRegisterRequest) throws UserAlreadyExistException;
  UserInfoResponse registerDesigner(UserRegisterRequest userRegisterRequest) throws UserAlreadyExistException;

  String login(UserLoginRequest loginRequest);
//  DisplayUsersResponse getAllUserByRole(String role);
  String findUserByEmail(String email);
  String findUserById(Long id);
  User getUserByEmail(String email);

  Optional<User> getUserByPasswordResetToken(String token);


}
