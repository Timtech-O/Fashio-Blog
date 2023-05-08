package com.fashionblog.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "comments")
public class Comment extends BaseEntity{

    private String comment;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "postId" , referencedColumnName = "id")
    private Post post;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "userId" , referencedColumnName = "id")
    private User user;

}
