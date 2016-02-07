package org.kodejava.example.servlet.model;

import java.util.Objects;

public class User {
    private Long id;
    private String username;
    private String realName;

    public User() {
    }

    public User(Long id, String username, String realName) {
        this.id = id;
        this.username = username;
        this.realName = realName;
    }

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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, realName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User that = (User) o;
        return Objects.equals(this.id, that.id)
                && Objects.equals(this.username, that.username)
                && Objects.equals(this.realName, that.realName);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }
}
