package com.geekwys.rediscaching.service;

import com.geekwys.rediscaching.model.User;
import com.geekwys.rediscaching.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author shem.mwangi
 */

@Service
@Transactional
public class UserService {

    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> fetchAllUserRegisteredInOrganization() {
        return userRepository.findAll();
    }
    public void registerNewUserToOrganization(User user) {
        userRepository.save(user);
    }

}
