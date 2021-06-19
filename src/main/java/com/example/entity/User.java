package com.example.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_user")
public class User {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名 
     */
    @Column(name = "username")
    private String username;

    /**
     * 密码 
     */
    @Column(name = "password")
    private String password;

    /**
     * 邮箱 
     */
    @Column(name = "email")
    private String email;

    /**
     * 电话 
     */
    @Column(name = "tel")
    private String tel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
         this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
         this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
         this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
         this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
         this.tel = tel;
    }

}