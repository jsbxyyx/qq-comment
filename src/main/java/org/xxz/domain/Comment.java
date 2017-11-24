package org.xxz.domain;

import java.util.List;

import lombok.Data;

@Data
public class Comment {

    private String id;// id
    private String customerId;// 用户id
    private String parentCommentId;// 父评论id
    private String contentId;// 内容id
    private String content;// 评论内容
    private String commentDate;// 评论日期
    private String commentTime;// 评论时间
    private Integer state;// 评论的状态
    private Integer type;// 评论类型

    // =================================
    private List<Comment> replyComment; // 评论回复信息
    private Customer customer;// 评论者信息
    private Customer replyCustomer; // 回复评论的人

}
