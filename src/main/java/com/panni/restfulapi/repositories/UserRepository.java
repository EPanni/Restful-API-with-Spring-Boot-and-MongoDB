package com.panni.restfulapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.panni.restfulapi.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
    
}
