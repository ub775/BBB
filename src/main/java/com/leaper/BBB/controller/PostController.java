package com.leaper.BBB.controller;

import com.leaper.BBB.data.entity.Post;
import com.leaper.BBB.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/main")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

}
