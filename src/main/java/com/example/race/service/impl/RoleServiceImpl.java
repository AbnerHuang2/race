package com.example.race.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.race.domain.Role;
import com.example.race.service.RoleService;
import com.example.race.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
* @author abner
* @description 针对表【t_role(角色表)】的数据库操作Service实现
* @createDate 2023-11-01 14:48:36
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}




