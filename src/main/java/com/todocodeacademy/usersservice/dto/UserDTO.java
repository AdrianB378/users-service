package com.todocodeacademy.usersservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


public class UserDTO {

    private Long user_id;
    private String name;
    private String lastname;
    private String cellphone;
    private List<PostDTO> listPosts;

    public UserDTO() {
    }

    public UserDTO(Long user_id, String name, String lastname, String cellphone, List<PostDTO> listPosts) {
        this.user_id = user_id;
        this.name = name;
        this.lastname = lastname;
        this.cellphone = cellphone;
        this.listPosts = listPosts;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public List<PostDTO> getListPosts() {
        return listPosts;
    }

    public void setListPosts(List<PostDTO> listPosts) {
        this.listPosts = listPosts;
    }
}

