package com.drafire.springmultisource.dao;

import com.drafire.springmultisource.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface OrderDAO {
    Order query(Integer id);
}
