package com.geekwys.rediscaching.service;

import com.geekwys.rediscaching.model.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {
    List<User> fetchAllUserRegisteredInOrganization();

    void registerNewUserToOrganization(User user);

    Optional<User> fetchUserByRegistrationId(Long userId);
}
