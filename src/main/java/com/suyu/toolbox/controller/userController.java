package com.suyu.toolbox.controller;

import com.suyu.toolbox.service.UserService;
import com.suyu.toolbox.service.feedbackService;
import com.suyu.toolbox.utils.feedback;
import com.suyu.toolbox.utils.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class userController {

    @Autowired
    private UserService userService;

    @Autowired
    private feedbackService fdService;

    /**
     *
     * 查询用户是否存在
     *
     * @author 物流 java01班 Tanjianbing 34号
     * @date 2022/11/10 23:11
     */

    @ResponseBody  // 这个可以直接返回数据库查的数据 而不是页面
    @GetMapping("/")
    public  List<user>  checkUser(user user){
        List<user> list = userService.list();

        return list;
     }

     /**
      * 存储前端页面请求来的反馈数据
      *
      * @author 物流 java01班 Tanjianbing 34号
      * @date 2022/11/10 23:11
      */

     @ResponseBody  // 这个可以直接返回数据库查的数据 而不是页面
     @GetMapping("/content")
     public  List<feedback>  content(user user){
         List<feedback> list = fdService.list();
         return list;
     }
}
