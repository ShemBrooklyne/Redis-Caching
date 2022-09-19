package com.geekwys.rediscaching.service;

import com.geekwys.rediscaching.model.User;
import com.geekwys.rediscaching.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * @author shem.mwangi
 */

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class UserService implements UserServiceInterface {


    final UserRepository userRepository;

    @Override
    public List<User> fetchAllUserRegisteredInOrganization() {
        return userRepository.findAll();
    }

    @Override
    public void registerNewUserToOrganization(User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<User> fetchUserByRegistrationId(Long userId) {
       return userRepository.findById(userId);
    }

}
