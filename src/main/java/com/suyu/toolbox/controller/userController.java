package com.suyu.toolbox.controller;

import com.suyu.toolbox.mapper.UserMapper;
import com.suyu.toolbox.service.feedbackService;
import com.suyu.toolbox.utils.feedback;
import com.suyu.toolbox.utils.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class userController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private feedbackService fdService;

    /**
     *   每次删除数据之后 执行 alter table user AUTO_INCREMENT=(已有数据的下一个id); 这样就不会跟着删除的那条数据的id来自增了
     *
     * 登录验证
     *
     * @author 物流 java01班 Tanjianbing 34号
     * @date 2022/11/10 23:11
     */

    @ResponseBody  // 这个可以直接返回数据库查的数据 而不是页面
    @PostMapping("/checkUser")    // @RequestBody主要是用来接收前端传递给后端的json字符串中的数据（请求体中的数据）
    public int checkUser(@RequestBody user user1){
//        System.out.println(user1);
        //验证
        String username = user1.getUsername();
        String password = user1.getPassword();
        //  这里如果没查到的话 返回的类型就不是boolean型的了
        boolean b = userMapper.checkUser(username, password);
        //   验证成功返回0 失败则返回-1
        if (b == true){
            return 0;
        }else {
            return -1;
        }
     }

    /**
     * 注册用户
     *
     * @author 物流 java01班 Tanjianbing 34号
     * @date 2022/11/11 13:37
     */

    @ResponseBody  // 这个可以直接返回数据库查的数据 而不是页面
    @PostMapping("/user")
    public int  registerUser(@RequestBody user user1){
        user user2 = new user();
        user2 = user1;
        int result = userMapper.insert(user2);
        return result;
    }

     /**
      * 查询前端页面请求来的反馈数据
      *
      * @author 物流 java01班 Tanjianbing 34号
      * @date 2022/11/10 23:11
      */

     @ResponseBody  // 这个可以直接返回数据库查的数据 而不是页面
     @GetMapping("/content")
     public  List<feedback>  content(){
         List<feedback> list = fdService.list();
         return list;
     }

    /**
     * 插入前端页面请求来的反馈数据
     *
     * @author 物流 java01班 Tanjianbing 34号
     * @date 2022/11/10 23:11
     */

    @ResponseBody  // 这个可以直接返回数据库查的数据 而不是页面
    @PostMapping("/content")
    public  int  insertContent(@RequestBody feedback f1){
       System.out.println(f1);
       int result = fdService.getBaseMapper().insert(f1);
       return  result;
    }
}
