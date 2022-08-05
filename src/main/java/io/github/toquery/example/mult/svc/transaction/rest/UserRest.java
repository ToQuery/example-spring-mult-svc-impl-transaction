package io.github.toquery.example.mult.svc.transaction.rest;

import io.github.toquery.example.mult.svc.transaction.svc.UserSvc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@RestController
@RequestMapping("/user")
public class UserRest {

    @Resource
    private UserSvc userSvc;

    @GetMapping("/list")
    public List<String> list() {
        return userSvc.findAll();
    }

    @GetMapping("/save")
    public String save() {
        return userSvc.save(System.currentTimeMillis() + "");
    }


    @GetMapping("/save-error")
    public String saveError() throws Exception {
        return userSvc.saveError(System.currentTimeMillis() + "");
    }


}
