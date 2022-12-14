package com.example.UserTrackservices.repository;

import com.example.UserTrackservices.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
    User findByUserId(String userId);
}
