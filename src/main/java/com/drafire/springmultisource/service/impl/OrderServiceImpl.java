package com.drafire.springmultisource.service.impl;

import com.drafire.springmultisource.config.DataSourceHelp;
import com.drafire.springmultisource.core.DrafireDataSource;
import com.drafire.springmultisource.dao.OrderDAO;
import com.drafire.springmultisource.domain.Order;
import com.drafire.springmultisource.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDAO orderDAO;

    @Override
    @DrafireDataSource(value = DataSourceHelp.ORDER)
    public Order query(int id) {
        return orderDAO.query(id);
    }
}
