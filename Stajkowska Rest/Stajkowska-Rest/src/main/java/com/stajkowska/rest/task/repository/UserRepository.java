package com.stajkowska.rest.task.repository;


import com.stajkowska.rest.task.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User, Long>{

}
