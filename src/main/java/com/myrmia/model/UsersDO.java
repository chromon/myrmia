package com.myrmia.model;

import javax.persistence.*;

/**
 * 用户实体类
 * Created by Ellery on 2018/10/13.
 */
@Entity
@Table(name = "t_users")
public class UsersDO {

    private int uid;

    private String username;

    private String password;

    private String salt;

    private String email;

    private String homeURL;

    private String screenName;

    private int created;

    private int activated;

    private int logged;

    private String groupName;

    @Id
    @Column(name = "uid", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Column(name = "username", nullable = false, length = 64, columnDefinition = "varchar(64) UNIQUE")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name="password", nullable = false, length=64, columnDefinition = "varchar(64)")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "salt", nullable = false, length = 128, columnDefinition = "varchar(128)")
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Column(name="email", length = 100, columnDefinition = "varchar(100)")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name="home_url", length = 255, columnDefinition = "varchar(255)")
    public String getHomeURL() {
        return homeURL;
    }

    public void setHomeURL(String homeURL) {
        this.homeURL = homeURL;
    }

    @Column(name="screen_name", length = 100, columnDefinition = "varchar(100)")
    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    @Column(name="created", nullable = false, columnDefinition = "int(10)")
    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    @Column(name="activated", nullable = false, columnDefinition = "int(10)")
    public int getActivated() {
        return activated;
    }

    public void setActivated(int activated) {
        this.activated = activated;
    }

    @Column(name="logged", nullable = false, columnDefinition = "int(10)")
    public int getLogged() {
        return logged;
    }

    public void setLogged(int logged) {
        this.logged = logged;
    }

    @Column(name="group_name", length = 16, columnDefinition = "varchar(16)")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
