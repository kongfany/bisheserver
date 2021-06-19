package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_event")
public class Event {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 收藏数 
     */
    @Column(name = "collectnum")
    private Integer collectnum;

    /**
     * 评论数 
     */
    @Column(name = "commentnum")
    private Integer commentnum;

    /**
     * 收藏的标志，true为1，false为0 
     */
    @Column(name = "flagcollect")
    private  Integer flagcollect;

    /**
     * 喜欢的标志，true为1，false为0 
     */
    @Column(name = "flaglike")
    private Integer flaglike;

    /**
     * 活动简介 
     */
    @Column(name = "introduce")
    private String introduce;

    /**
     * 喜欢数 
     */
    @Column(name = "likenum")
    private Integer likenum;

    /**
     * 活动名称 
     */
    @Column(name = "name")
    private String name;

    /**
     * 活动主办方 
     */
    @Column(name = "sponsor")
    private String sponsor;

    /**
     * 活动举办时间 
     */
    @Column(name = "time")
    private String time;

    /**
     * 活动种类id 
     */
    @Column(name = "typeid")
    private Integer typeid;

    public Integer getCollectnum() {
        return collectnum;
    }

    public void setCollectnum(Integer collectnum) {
         this.collectnum = collectnum;
    }

    public Integer getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(Integer commentnum) {
         this.commentnum = commentnum;
    }

    public  Integer getFlagcollect() {
        return flagcollect;
    }

    public void setFlagcollect( Integer flagcollect) {
         this.flagcollect = flagcollect;
    }

    public Integer getFlaglike() {
        return  flaglike;
    }

    public void setFlaglike(Integer flaglike) {
         this.flaglike = flaglike;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
         this.id = id;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
         this.introduce = introduce;
    }

    public Integer getLikenum() {
        return likenum;
    }

    public void setLikenum(Integer likenum) {
         this.likenum = likenum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
         this.name = name;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
         this.sponsor = sponsor;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
         this.time = time;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
         this.typeid = typeid;
    }

}