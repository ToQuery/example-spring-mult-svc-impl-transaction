package io.github.toquery.example.mult.svc.transaction.dao;

import io.github.toquery.example.mult.svc.transaction.entity.UserB;
import org.springframework.data.repository.CrudRepository;

/**
 *
 */
public interface BUserDao extends CrudRepository<UserB, Integer> {
}
