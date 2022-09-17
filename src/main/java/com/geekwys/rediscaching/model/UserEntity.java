package com.geekwys.rediscaching.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

/**
 * @author shem.mwangi
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userID;

    private String firstName;
    private String lastName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UserEntity that = (UserEntity) o;
        return userID != null && Objects.equals(userID, that.userID);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
