package com.cx.repository;

import com.cx.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UserRepository extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {

}
