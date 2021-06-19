package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_collect")
public class Collect {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "eventid")
    private Integer eventid;

    public Integer getEventid() {
        return eventid;
    }

    public void setEventid(Integer eventid) {
         this.eventid = eventid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
         this.id = id;
    }

}