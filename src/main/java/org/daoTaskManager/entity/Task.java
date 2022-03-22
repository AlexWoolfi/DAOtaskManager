package org.daoTaskManager.entity;

import java.util.List;


public class Task {
    private Long id;
    private String title;
    private String description;
    private Long user_id;
    private List<User> users;

    public Task() {
    }

    public Task(Long id, String title, String description, Long user_id, List<User> users) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.user_id = user_id;
        this.users = users;
    }
    public Task(Long id, String title, String description, Long user_id) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.user_id = user_id;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", user_id=" + user_id +
                '}';
    }
}
