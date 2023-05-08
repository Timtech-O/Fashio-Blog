package com.fashionblog.entity;

import com.fashionblog.enums.Role;
import jakarta.persistence.*;
import lombok.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseEntity {
    private String name;
    @Column(unique = true)
    private String email;
    @Enumerated(EnumType.STRING)
    private Role role;

    private String password;
    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    private List<Post> postList = new ArrayList<>();

    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    private List<Comment> commentList = new ArrayList<>();

    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    private List<Like> likeList = new ArrayList<>();

    public void addRole(Role role) {
        this.role.getRole();
    }

    public Set<Role> getRoles() {
        return Collections.singleton(role);
    }


}
