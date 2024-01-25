package com.micro.service.galaxycollector.dao;

import com.micro.service.galaxycollector.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author Wang.Rui.Barney
 * @date 2024/01/22 13:29
 * @description
 */
@Mapper
public interface RoleMapper {
    @Select("select * from role where name = #{name}")
    Role findRoleByName(String name);
}
