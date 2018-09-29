package com.eshore.wms.sys.service.impl;

import com.eshore.wms.sys.entity.User;
import com.eshore.wms.sys.mapper.UserMapper;
import com.eshore.wms.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2018-09-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
