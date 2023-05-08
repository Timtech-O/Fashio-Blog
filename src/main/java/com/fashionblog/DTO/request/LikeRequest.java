package com.fashionblog.DTO.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class LikeRequest {
    private boolean isLiked = true;
}
