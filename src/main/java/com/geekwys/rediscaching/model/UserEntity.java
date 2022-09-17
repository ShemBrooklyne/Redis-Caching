package com.geekwys.rediscaching.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shem.mwangi
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    private long userID;
    private String firstName;
    private String lastName;
}