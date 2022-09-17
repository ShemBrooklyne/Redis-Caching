package com.geekwys.rediscaching.repository;

import com.geekwys.rediscaching.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author shem.mwangi
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
