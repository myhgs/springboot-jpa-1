package com.test.jpa.dto.posts;

import com.test.jpa.common.DateUtils;
import com.test.jpa.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

/**
 * Created by kiseokhong on 2019. 3. 10..
 */
@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String author;
    private String modifiedDate;

    public PostsResponseDto(Posts entity) {
        id = entity.getId();
        title = entity.getTitle();
        author = entity.getAuthor();
        modifiedDate = DateUtils.toStringDateTime(entity.getModifiedDate());
    }

}
