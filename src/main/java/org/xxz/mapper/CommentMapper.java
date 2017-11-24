package org.xxz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.xxz.domain.Comment;

@Mapper
public interface CommentMapper {
    
    List<Comment> findParentCommentByItemId(@Param("itemId") String itemId);
    
    List<Comment> findReplyCommentByCommentId(@Param("parentCommentId") String parentCommentId);

}
