package io.github.toquery.example.mult.svc.transaction.svc.impl;

import io.github.toquery.example.mult.svc.transaction.dao.AUserDao;
import io.github.toquery.example.mult.svc.transaction.entity.UserA;
import io.github.toquery.example.mult.svc.transaction.svc.UserSvc;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 *
 */
public class AUserSvcImpl implements UserSvc {

    @Resource
    private AUserDao userDao;

    @Override
    public List<String> findAll() {
        return StreamSupport.stream(userDao.findAll().spliterator(), false).map(UserA::getUsername).distinct().collect(Collectors.toList());
    }

    @Override
    public String save(String username) {
        return userDao.save(new UserA(username)).getUsername();
    }

    @Override
    public String saveError(String username) {
        String usernameNew = this.save(username);
        throw new RuntimeException("saveError");
    }
}
