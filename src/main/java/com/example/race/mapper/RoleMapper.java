package com.example.race.mapper;

import com.example.race.domain.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author abner
* @description 针对表【t_role(角色表)】的数据库操作Mapper
* @createDate 2023-11-01 14:48:36
* @Entity com.example.race.domain.Role
*/
@Repository
public interface RoleMapper extends BaseMapper<Role> {

}




