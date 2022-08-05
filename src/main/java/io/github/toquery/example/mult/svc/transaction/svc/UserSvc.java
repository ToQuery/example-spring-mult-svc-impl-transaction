package io.github.toquery.example.mult.svc.transaction.svc;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
//@Service
public interface UserSvc {
    List<String> findAll();

    String save(String username);

    String saveError(String username) throws Exception;
}
