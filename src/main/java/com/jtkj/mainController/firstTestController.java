package com.jtkj.mainController;


import com.jtkj.entity.User;
import com.jtkj.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class firstTestController {

    /**
     *
     */
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public String getData() throws Exception {

        List<User> users = userMapper.selectAll();

        for (User user : users) {
            System.out.println(user.getUsername());
        }
        return "Hello World";
    }
}
