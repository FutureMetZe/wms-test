package com.eshore.wms.sys.controller;


import com.eshore.wms.sys.entity.User;
import com.eshore.wms.sys.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * 用户 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2018-09-29
 */
@RestController
@RequestMapping("/sys/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/{id}")
    public User get(@PathVariable Integer id){
        return userService.getById(id);
    }
}
