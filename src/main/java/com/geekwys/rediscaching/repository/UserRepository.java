package com.geekwys.rediscaching.repository;

import com.geekwys.rediscaching.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author shem.mwangi
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //custom query to search for user by first name or second name
    List<User> findUserByFirstNameAndLastName(String firstName, String lastName);

}
