package com.fashionblog.services;

import com.fashionblog.DTO.request.CommentRequest;
import com.fashionblog.DTO.request.LikeRequest;
import com.fashionblog.DTO.request.PostDTO;
import com.jconcept.fashionblog.DTO.response.*;
import com.fashionblog.entity.Post;

import java.util.List;

public interface PostService {
    PostDTO createPost(PostDTO postRequest);

    String makeAComment(Long userId , Long postId , CommentRequest commentResquest);

    Integer likeAPost(Long userId , Long postId , LikeRequest likeRequest);

    List<String> searchComment(String keyword);


    List<PostDTO> searchPost(String keyword);

    Post findPostById(Long id);
    public PostDTO getPostById(Long id);
    void deleteComment(Long commentId);
}
