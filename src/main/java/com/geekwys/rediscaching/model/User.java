package com.geekwys.rediscaching.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.*;

/**
 * @author shem.mwangi
 */
@Setter
@Getter
@RequiredArgsConstructor
@Entity(name = "users")
@RedisHash("organization.users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    @org.springframework.data.annotation.Id private Long userID;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

}
