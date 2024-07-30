package dev.dio.service;

import dev.dio.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
