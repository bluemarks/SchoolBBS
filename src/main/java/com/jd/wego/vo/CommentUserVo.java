package com.jd.wego.vo;

import com.jd.wego.entity.Comment;
import lombok.Data;


@Data
public class CommentUserVo extends Comment {

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 用户昵称
     */
    private String nickname;
}
