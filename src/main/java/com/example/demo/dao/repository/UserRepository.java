package com.example.demo.dao.repository;

import com.example.demo.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

  @Query(value = "select count(1) from user where user.username = :#{#username}", nativeQuery = true)
  public int checkUserExistByUserName(String username);

}
