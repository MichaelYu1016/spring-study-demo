package com.example.ynx.springbootjpa.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author ynx
 * @version V1.0
 * @date 2020-01-19
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(length = 32)
    private String name;
    @Column(length = 64)
    private String userName;
    @Column(length = 128)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
