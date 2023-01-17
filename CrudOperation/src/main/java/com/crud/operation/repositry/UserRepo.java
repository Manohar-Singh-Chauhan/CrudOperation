package com.crud.operation.repositry;

import org.springframework.data.repository.CrudRepository;

import com.crud.operation.entities.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}
