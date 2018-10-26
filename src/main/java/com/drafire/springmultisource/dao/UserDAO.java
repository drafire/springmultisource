package com.drafire.springmultisource.dao;

import com.drafire.springmultisource.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserDAO {
    User query(Integer id);
}
