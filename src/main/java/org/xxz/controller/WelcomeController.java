package org.xxz.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xxz.domain.Comment;
import org.xxz.service.CommentService;

@Controller
public class WelcomeController {
    
    @Resource
    private CommentService commentService;
    
    @RequestMapping(value = "/test")
    public String test(ModelMap model) {
        model.put("key", "hello qq-comment");
        return "test";
    }
    
    @RequestMapping(value = "/test1")
    @ResponseBody
    public String test1() {
        return "test";
    }
    
    @RequestMapping(value = "/comment")
    public String comment(String itemId, ModelMap model) {
        List<Comment> itemComments = commentService.findCommentByItemId(itemId, 1, 10);
        model.put("itemComments", itemComments);
        return "comment";
    }

}
