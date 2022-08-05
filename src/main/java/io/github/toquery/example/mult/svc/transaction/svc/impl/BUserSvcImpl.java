package io.github.toquery.example.mult.svc.transaction.svc.impl;

import io.github.toquery.example.mult.svc.transaction.dao.BUserDao;
import io.github.toquery.example.mult.svc.transaction.entity.UserB;
import io.github.toquery.example.mult.svc.transaction.svc.UserSvc;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 *
 */
public class BUserSvcImpl implements UserSvc {

    @Resource
    private BUserDao userDao;

    @Override
    public List<String> findAll() {
        return StreamSupport.stream(userDao.findAll().spliterator(), false).map(UserB::getUsername).distinct().collect(Collectors.toList());
    }

    @Override
    public String save(String username) {
        return userDao.save(new UserB(username)).getUsername();
    }

    @Override
    public String saveError(String username) throws Exception {
        String usernameNew = this.save(username);
        throw new Exception("saveError");
    }
}
