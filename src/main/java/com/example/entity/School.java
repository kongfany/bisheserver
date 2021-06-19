package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_schoolscenery")
public class School {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 景点地址 
     */
    @Column(name = "location")
    private String location;

    /**
     * 景点名称 
     */
    @Column(name = "name")
    private String name;

    /**
     * 景点图片 
     */
    @Column(name = "url")
    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
         this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
         this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
         this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
         this.url = url;
    }

}