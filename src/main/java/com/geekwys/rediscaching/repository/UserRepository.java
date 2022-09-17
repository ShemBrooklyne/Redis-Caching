package com.geekwys.rediscaching.repository;

import com.geekwys.rediscaching.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author shem.mwangi
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    //custom query to search for user by first name or second name
    List<UserEntity> findUserByFirstOrSecondName(String firstName, String secondName);

}
