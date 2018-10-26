package com.drafire.springmultisource.service.impl;

import com.drafire.springmultisource.config.DataSourceHelp;
import com.drafire.springmultisource.core.DrafireDataSource;
import com.drafire.springmultisource.dao.UserDAO;
import com.drafire.springmultisource.domain.User;
import com.drafire.springmultisource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    @DrafireDataSource(value = DataSourceHelp.BANK)
    public User query(int id) {
        return userDAO.query(id);
    }
}
