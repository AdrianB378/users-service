package com.todocodeacademy.usersservice.repository;

import com.todocodeacademy.usersservice.dto.PostDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="posts-service")
public interface IPostsAPI {

    @GetMapping("/posts/{user_id}")
    public List<PostDTO> getPostsByUserId(@PathVariable("user-id")Long user_id );

}
