package com.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.institute.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
